package game;

import java.util.ListIterator;

import player.Player;

public class QuickGame extends Game {

	public void designateWinner() {
		
			Player winner = new Player("V", this);
			for(ListIterator<Player> p = players.listIterator(); p.hasNext();){
				Player player = p.next();
				if(player.getNbMenhirs() > winner.getNbMenhirs())
					winner = player;
			}
			System.out.println(winner.getName() + " wins !");
			}
	

	public QuickGame(int season) {
		super();
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
