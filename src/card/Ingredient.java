package card;

import java.util.Arrays;

public class Ingredient extends Card {
	
	private int[] giantVector;
	private int[] farfadetVector;
	private int[] fertilizerVector;

	public int[] getGiantVector() {
		return giantVector;
	}

	public int[] getFarfadetVector() {
		return farfadetVector;
	}

	public int[] getFertilizerVector() {
		return fertilizerVector;
	}

	public Ingredient(String name, int[] giantVector,  int[] fertilizerVector, int[] farfadetVector) {
		super(name);
		this.giantVector = giantVector;
		this.farfadetVector = farfadetVector;
		this.fertilizerVector = fertilizerVector;
	}

	@Override
	public String toString() {
		return super.getName() + " : " + "Geant =" + Arrays.toString(giantVector) + ", Farfadet="
				+ Arrays.toString(farfadetVector) + ", Engrais=" + Arrays.toString(fertilizerVector);
	}

	

}
