package game;

public abstract class Game {

	private int season;
	private int nbPlayer;
	private int currentPlayer;
	private player.Player[] players;
	
	public player.Player[] getPlayers() {
		return players;
	}


	public void setPlayers(player.Player[] players) {
		this.players = players;
	}


	public abstract void designateWinner(); 
	
	
	public int getSeason() {
		return season;
	}


	public void setSeason(int season) {
		this.season = season;
	}


	public int getNbPlayer() {
		return nbPlayer;
	}


	public void setNbPlayer(int nbPlayer) {
		this.nbPlayer = nbPlayer;
	}


	public int getCurrentPlayer() {
		return currentPlayer;
	}


	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
