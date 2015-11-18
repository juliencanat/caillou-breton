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
		
		if( fertilizerStrength[season] > this.nbRocks) {
			this.nbMenhirs = this.nbMenhirs + this.nbRocks;
			this.nbRocks = 0;
		}
		else {
			this.nbMenhirs = this.nbMenhirs + fertilizerStrength[season];
			this.nbRocks -= fertilizerStrength[season];
		}
	}
	
	public void playGiant(Ingredient card) {
		int season = currentGame.getSeason();
		int[] giantStrength = card.getGiantVector();
		
		this.nbRocks += giantStrength[season];
		
	}

	public void playFarfadet(Ingredient card, Player victim) {
		int season = currentGame.getSeason();
		int[] farfadetStrength = card.getFarfadetVector();
		
		int rockStolen = victim.stealRocks(farfadetStrength[season]);
		
		this.nbRocks += rockStolen;
		
	
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
	
	public int stealRocks(int toSteal) {
		if( toSteal <= this.nbRocks) {
			this.nbRocks -= toSteal;
		return toSteal; 
		}
		else {
			int tmp = this.nbRocks;
			this.nbRocks = 0;
			return (-tmp + toSteal);
		}
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

	@Override
	public String toString() {
		return "Graine(s)=" + nbRocks + "\n"+ "Menhir(s)=" + nbMenhirs + "\n" + " Main=" + hand.toString() +"\n";
	}
	
	
}
