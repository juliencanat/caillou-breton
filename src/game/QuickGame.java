package game;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import card.Ingredient;
import player.Player;

public class QuickGame extends Game {

	public void designateWinner() {
		
			ArrayList<Player> winner = new ArrayList<Player>();
			winner.add(this.players.get(0));
			
			for(ListIterator<Player> p = players.listIterator(); p.hasNext();){
				p.next(); // Skip the first player
				Player player = p.next();
				if(player.getNbMenhirs() > winner.get(0).getNbMenhirs()) {
					winner.clear();
					winner.add(0, player);
				}
				else if (player.getNbMenhirs() == winner.get(0).getNbMenhirs()) {
					if(player.getNbRocks() > winner.get(0).getNbRocks()) {
						winner.clear();
						winner.add(0, player);
					}
					else if (player.getNbRocks() == winner.get(0).getNbRocks()) {
						winner.add(player);
					}
				}
			}
			for(Player w : winner)
				System.out.println(w.getName() + " wins !");
			}
			//TODO : cas d'égalité

	public QuickGame() {
		super();
	}


	public static void main(String[] args) {
		QuickGame game = new QuickGame();
		Scanner user_input = new Scanner( System.in );
		
		while(game.getSeason() <= WINTER) {
			System.out.println("Saison actuelle : " + SEASONS[game.getSeason()]);
			for(ListIterator<Player> p = game.getPlayers().listIterator(); p.hasNext();) {
				Player currentPlayer = p.next();
				System.out.println("Au tour de " + currentPlayer.getName());
				System.out.println(currentPlayer.toString());
				
				System.out.println("Quelle carte voulez-vous jouer ?");
				int carteJoue = user_input.nextInt() - 1;
				
				System.out.println("Quelle action souhaitez vous effectuer : G/E/F ?");
				
				String actionJoue = user_input.next();
				
				
				if(actionJoue.equals("G"))
					currentPlayer.playGiant((Ingredient) currentPlayer.getHand().get(carteJoue));
				else if(actionJoue.equals("E"))
					currentPlayer.playFertilizer((Ingredient) currentPlayer.getHand().get(carteJoue));
				else if(actionJoue.equals("F")) {
					System.out.println("Quel joueur souhaitez vous voler ?");
					int victim = user_input.nextInt();  
					currentPlayer.playFarfadet((Ingredient) currentPlayer.getHand().get(carteJoue), game.getPlayers().get(victim - 1));
				}
				else
					System.out.println("Tour passé");
				
				currentPlayer.getHand().remove(carteJoue); //On retire la carte jouée
			}
			game.setSeason(); // Change the season to the next one
		}
			game.designateWinner();
			user_input.close();
	}

}
