package com.emilie.pokemon;

public class Pokemon {

	public static void main(String[] args) {
		Monster squirtle = new Monster("Squirtle");
		squirtle.learnMove("Bubble");
		squirtle.useMove(squirtle.getMoves().indexOf("Bubble"));
		squirtle.useMove(squirtle.getMoves().indexOf("Tackle"));
		squirtle.levelUp();
		squirtle.levelUp();
		
		Monster charmander = new Monster("Charmander");
		charmander.learnMove("Ember");
		charmander.learnMove("Scratch");
		for(String move: squirtle.getMoves()) {
			charmander.useMove(squirtle.getMoves().indexOf(move));
		}
		charmander.learnMove("Sing");
		charmander.levelUp();
		charmander.levelUp();
		charmander.levelUp();

	}

}
