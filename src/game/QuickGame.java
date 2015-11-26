package game;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import card.Ingredient;
import player.AIplayer;
import player.HumanPlayer;
import player.Player;
import view.Console;

public class QuickGame extends Game {

	public ArrayList<Player> designateWinner() {
		
			ArrayList<Player> winner = new ArrayList<Player>();
			winner.add(this.players.get(0));
			
			for(ListIterator<Player> p = players.listIterator(); p.hasNext();){
				//p.next(); Skip the first player but not only, and bug appears with 3 or more players
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
			//TODO: gérer le doublon
			
			return winner;
			}
			

	public QuickGame() {
		super();
	}


	public static void main(String[] args) {
		QuickGame game = new QuickGame();
		Scanner userInput = new Scanner( System.in );
		Console console = new Console();
		
		while(game.getSeason() <= WINTER) {
			for(ListIterator<Player> p = game.getPlayers().listIterator(); p.hasNext();) {
				Player currentPlayer = p.next();				
				if (currentPlayer instanceof HumanPlayer) {
					console.getGameDetails(game);
					console.getPlayerDetails(currentPlayer);
					int playedCard = console.choiceCard(userInput);
					String playedAction = console.choiceAction(userInput);
					if (playedAction.equals("G"))
						currentPlayer.playGiant((Ingredient) currentPlayer.getHand().get(playedCard));
					else if (playedAction.equals("E"))
						currentPlayer.playFertilizer((Ingredient) currentPlayer.getHand().get(playedCard));
					else if (playedAction.equals("F")) {
						int victim = console.choiceVictim(userInput);
						currentPlayer.playFarfadet((Ingredient) currentPlayer.getHand().get(playedCard),
								game.getPlayers().get(victim - 1));
					} else
						System.out.println("Tour passé");
					currentPlayer.getHand().remove(playedCard); //On retire la carte jouée
				} else if(currentPlayer instanceof AIplayer){
					//console.getPlayerDetails(currentPlayer);
					((AIplayer) currentPlayer).playACard();
					//console.getPlayerDetails(currentPlayer);
				}
			}
			game.setSeason(); // Change the season to the next one
		}
			
			console.displayWinner(game.designateWinner());
			userInput.close();
	}

}
