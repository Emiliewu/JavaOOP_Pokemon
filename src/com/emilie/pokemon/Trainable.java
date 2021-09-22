package com.emilie.pokemon;

public interface Trainable {
	void learnMove(String moveName);
	void useMove(Integer moveIndex);
	void levelUp();
}
