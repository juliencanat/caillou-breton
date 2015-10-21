package card;

public class Ingredient extends Card {
	
	private int[] giantVector;
	private int[] farfadetVector;
	private int[] fertilizerVector;

	public int[] getGiantVector() {
		return giantVector;
	}

	public void setGiantVector(int[] giantVector) {
		this.giantVector = giantVector;
	}

	public int[] getFarfadetVector() {
		return farfadetVector;
	}

	public void setFarfadetVector(int[] farfadetVector) {
		this.farfadetVector = farfadetVector;
	}

	public int[] getFertilizerVector() {
		return fertilizerVector;
	}

	public void setFertilizerVector(int[] fertilizerVector) {
		this.fertilizerVector = fertilizerVector;
	}

	public Ingredient(String name, boolean isDistributed) {
		super(name, isDistributed);
		// TODO Auto-generated constructor stub
	}

}
