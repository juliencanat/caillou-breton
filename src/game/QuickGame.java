package game;

public class QuickGame extends Game {

	public void designateWinner() {
		
			int i = 0;
			for (int j = 1; j < super.getNbPlayer(); j++) {
				if (super.getPlayers()[i].getNbMenhirs()< super.getPlayers()[j].getNbMenhirs())
						i++;
				}
			
			System.out.println("Player" + i + " wins !");
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
