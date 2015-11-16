package card;

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

	public Ingredient(String name, int[] giantVector, int[] farfadetVector, int[] fertilizerVector) {
		super(name);
		this.giantVector = giantVector;
		this.farfadetVector = farfadetVector;
		this.fertilizerVector = fertilizerVector;
	}

	

}
