package card;


public class Ally extends Card {

	

	private int[] strengthVector;
	
	public int[] getStrengthVector() {
		return strengthVector;
	}


	public Ally(String name, int[] strengthVector) {
		super(name);

		this.strengthVector = strengthVector;
		
	}

}
