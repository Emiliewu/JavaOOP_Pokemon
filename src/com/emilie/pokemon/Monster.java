package com.emilie.pokemon;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Monster implements Trainable{
	private String name;
	private Integer level;
	private ArrayList<String> moves = new ArrayList<String>();
	
	// constructors
	public Monster() {}
	
	public Monster(String name) {
		this.name = name;
		this.level = 5;
		this.moves.add("Tackle");
		this.moves.add("Growl");
	}
	
	@Override
	public void learnMove(String moveName) {
		if(moves.size() < 4) {	
			this.moves.add(moveName);		
		} else {
			System.out.println("Oops! Aready 4 moves! Please enter a move to replace: \n");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        try {
	        	String userInput = reader.readLine();
	        	System.out.println("You just entered: " + userInput);
	        	Integer replaceIndex = this.moves.indexOf(userInput);
	        	System.out.println("The index of " + userInput + " is " + replaceIndex);
		    	if(replaceIndex == -1) {
		    		System.out.println("The move is not learned!");
		    	} else {
		    		this.moves.set(replaceIndex, moveName);
		    		System.out.println(userInput + " has been replaced by " + moveName);
		    	}		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("The move cannot be added");
			}   	  
		}
	}
	@Override
	public void useMove(Integer moveIndex) {
		System.out.println(this.name + " used " + this.moves.get(moveIndex));		
	}
	@Override
	public void levelUp() {
		if(this.level <= 100) {
			this.level += 1;
		}		
	}
	
	// setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public ArrayList<String> getMoves() {
		return moves;
	}
	public void setMoves(ArrayList<String> moves) {
		this.moves = moves;
	}
	
	
}
