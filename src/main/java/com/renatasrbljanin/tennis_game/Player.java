package com.renatasrbljanin.tennis_game;

import java.util.Arrays;
import java.util.List;

public class Player {
	
	public static final List<String> pointsDescription = Arrays.asList("love", "fifteen", "thirty", "forty");

	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Player(String name) {
		this.name = name;
	}
	
	public void winsBall(){
		this.score ++;
	}
	
	public String getScoreDescription(){
		return pointsDescription.get(score);
	}

}
