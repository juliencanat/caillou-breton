package player;


import java.util.ArrayList;
import game.*;
import card.*;


public class Player {
	
	private String name;
	

	private int nbRocks;
	private int nbMenhirs;
	private ArrayList<Card> hand;
	private Game currentGame;
	
	
	public void playFertilizer(Ingredient card) {
		int season = currentGame.getSeason();
		int[] fertilizerStrength = card.getFertilizerVector();
		
		if( fertilizerStrength[season] > this.nbRocks)
			this.nbMenhirs = this.nbMenhirs + this.nbRocks;
		else
			this.nbMenhirs = this.nbMenhirs + fertilizerStrength[season];
		
		
	}
	
	public void playGiant(Ingredient card) {
		int season = currentGame.getSeason();
		int[] giantStrength = card.getGiantVector();
		
		this.nbRocks += giantStrength[season];
		
	}

	public void playFarfadet(Ingredient card, player.Player victim) {
	
	}

	public Player(String name, Game game) {
		super();
		this.name = name;
		this.nbRocks = 2;
		this.nbMenhirs = 0;
		this.hand = new ArrayList<Card>();
		this.currentGame = game;
	}


	public int getNbRocks() {
		return nbRocks;
	}

	public void setNbRocks(int nbRocks) {
		this.nbRocks = nbRocks;
	}

	public int getNbMenhirs() {
		return nbMenhirs;
	}

	public void setNbMenhirs(int nbMenhirs) {
		this.nbMenhirs = nbMenhirs;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(Card card) {
		this.hand.add(card);
	}
	
	
}
