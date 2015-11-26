package game;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import player.Player;
import card.*;
//import player.HumanPlayer;
import player.AIplayer;
//import player.Strategy;
import player.FirstCard;
import player.Grow;
import player.HumanPlayer;

public abstract class Game {
	
	public final static int SPRING = 0;
	public final static int SUMMER = 1;
	public final static int AUTUMN = 2;
	public final static int WINTER = 3;
	public final static String[] SEASONS = {"Printemps", "Ete", "Automne", "Hiver"};

	private int season;
	
	private Scanner user_input = new Scanner( System.in );
	protected ArrayList<Player> players;
	
	
	public Game() {
		super();
		this.season = SPRING;
		
		//Instantiate the players
		System.out.println("Combien de joueurs AI?");
		int nbJoueurAI = user_input.nextInt();
		this.players = new ArrayList<Player>();
		for(int i = 0; i < nbJoueurAI ; i++) {
			System.out.println("Quel nom pour le joueur AI " + (i+1) + " ?");
			String name = user_input.next();
			System.out.println("Quelle difficult� pour le joueur AI "+ name + "? (facile/moyen)");
			String difficult� = user_input.next();
			if (difficult� == "facile"){
				players.add(new AIplayer(name, this, new FirstCard()));
			} else if (difficult� == "moyen"){
				players.add(new AIplayer(name, this, new Grow()));
			} else {
				players.add(new AIplayer(name, this, new FirstCard()));
			}
			
		}
		System.out.println("Combien de joueurs humains?");
		int nbJoueur = user_input.nextInt();
		for(int i = 0; i < nbJoueur ; i++) {
			System.out.println("Quel nom pour le joueur humain " + (i+1) + " ?");
			String name = user_input.next();
			
			players.add(new HumanPlayer(name, this));
		}
		// Instantiate the players END
		
		// Distribute cards
		Deck deck = new Deck(Deck.INGREDIENT);
		for(ListIterator<Player> p = players.listIterator(); p.hasNext();) {
			Player player = p.next();
			for(int i = 0; i < 4 ; i++){
				player.setHand(deck.remove()); //Chaque joueur pioche 4 cartes 
			
			
			}
		//Distribute cards END
		}
	}



	public abstract ArrayList<Player> designateWinner(); 
	
	
	public int getSeason() {
		return season;
	}


	public void setSeason() {
		this.season++;
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}


}
