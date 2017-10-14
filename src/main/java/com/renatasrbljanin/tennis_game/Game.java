package com.renatasrbljanin.tennis_game;

public class Game {

	private Player player1;
	private Player player2;

	public Game(Player player1, Player player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getScore() {

		if (player1.getScore() >= 3 && player2.getScore() >= 3) {

			if (Math.abs(player1.getScore() - player2.getScore()) >= 2)
				return "win for " + getLeadPlayer().getName();
			else if (player1.getScore() == player2.getScore())
				return "deuce";
			else
				return "advantage " + getLeadPlayer().getName();

		} else {
			if (player1.getScore() == player2.getScore())
				return player1.getScoreDescription() + " - All";
			else
				return player1.getScoreDescription() + " - " + player2.getScoreDescription();
		}
	}

	public Player getLeadPlayer() {
		return (player1.getScore() > player2.getScore()) ? player1 : player2;
	}
}