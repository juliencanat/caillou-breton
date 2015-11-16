package game;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import player.Player;
import card.*;

public abstract class Game {

	private int season; // spring = 1 ; summer = 2 ; autumn = 3 ; winter = 4
	private Scanner user_input = new Scanner( System.in );
	
	protected ArrayList<Player> players;
	
	
	public Game() {
		super();
		this.season = 1;
		
		//Instantiate the players
		System.out.println("Combien de joueurs ?");
		int nbJoueur = user_input.nextInt();
		this.players = new ArrayList<Player>();
		for(int i = 0; i < nbJoueur ; i++) {
			System.out.println("Quel nom pour le joueur " + i + " ?");
			String name = user_input.next();
			
			players.add(i, new Player(name, this));
		}
		// Instantiate the players END
		// Distribute cards
		Deck deck = new Deck(Deck.INGREDIENT);
		for(ListIterator<Player> p = players.listIterator(); p.hasNext();) {
			Player player = p.next();
			for(int i = 0; i < 4 ; i++)
				player.setHand(deck.remove());
			
			
		}
		//Distribute cards END
	}



	public abstract void designateWinner(); 
	
	
	public int getSeason() {
		return season;
	}


	public void setSeason(int season) {
		this.season = season;
	}


	public int getNbPlayer() {
		return players.size();
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
