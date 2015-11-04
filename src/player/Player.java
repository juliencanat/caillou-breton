package player;

import card.Card;

public abstract class Player {
	
	private int id;
	private int nbRocks;
	private int nbMenhirs;
	private card.Card[] hand;
	private game.Game currentGame;
	
	
	public void playFertilizer(card.Ingredient card) {
		int season = currentGame.getSeason();
		int[] fertilizerStrength = card.getFertilizerVector();
		
		if( fertilizerStrength[season] > this.nbRocks)
			this.nbMenhirs = this.nbMenhirs + this.nbRocks;
		else
			this.nbMenhirs = this.nbMenhirs + fertilizerStrength[season];
		
		
	}
	
	public void playGiant(card.Ingredient card) {
		int season = currentGame.getSeason();
		int[] giantStrength = card.getGiantVector();
		
		this.nbRocks += giantStrength[season];
		
	}

	public void playFarfadet(card.Ingredient card, player.Player victim) {
	
	}

	public Player(int id, int nbRocks, int nbMenhirs, Card[] hand) {
		super();
		this.id = id;
		this.nbRocks = nbRocks;
		this.nbMenhirs = nbMenhirs;
		this.hand = hand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public card.Card[] getHand() {
		return hand;
	}

	public void setHand(card.Card[] hand) {
		this.hand = hand;
	}
	
	
	
}
