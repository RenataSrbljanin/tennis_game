package com.renatasrbljanin.tennis_game;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	Player p1;
	Player p2;
	Game game;

	@Before
	public void setUp() {
		p1 = new Player("Monika");
		p2 = new Player("Novak");
		game = new Game(p1, p2);
	}
	
	@Test 
	public void twoOne() {
		p1.winsBall();
		p1.winsBall();
		p2.winsBall();
		assertThat(game.getScore(), is("thirty - fifteen"));
	}
	
	@Test 
	public void loveAll() {
		assertThat(game.getScore(), is("love - All"));
		p1.winsBall();
		assertThat(game.getScore(), is("fifteen - love"));
		p2.winsBall();
		assertThat(game.getScore(), is("fifteen - All"));
	}
	
	@Test 
	public void deuceAdvantageDeuceAdvantageWin() {
		IntStream.rangeClosed(1, 3).forEach((Integer) -> {
			p1.winsBall();
		});
		IntStream.rangeClosed(1, 3).forEach((Integer) -> {
			p2.winsBall();
		});
		assertThat(game.getScore(), is("deuce"));
		p1.winsBall();
		assertThat(game.getScore(), is("advantage " + game.getLeadPlayer().getName()));
		p2.winsBall();
		assertThat(game.getScore(), is("deuce"));
		p1.winsBall();
		assertThat(game.getScore(), is("advantage " + "Monika"));
		p1.winsBall();
		assertThat(game.getScore(), is("win for " + "Monika"));

	}


}
