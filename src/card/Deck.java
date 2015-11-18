package card;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Deck extends LinkedList<Card> {
	private static final long serialVersionUID = 999L;
	
	public final static int INGREDIENT = 0;
	public final static int ALLY = 1;
	public final static String[] TYPEOFDECK = {"Ingredient", "Ally"};
	
	//Matrice des cartes Ingrédients
	public final static int[][] rayonDeLune1 = {{1,1,1,1}, {2,0,1,1}, {2,0,2,0}};
	public final static int[][] rayonDeLune2 = {{2,0,1,1}, {1,3,0,0}, {0,1,2,1}};
	public final static int[][] rayonDeLune3 = {{0,0,4,0}, {0,2,2,0}, {0,0,1,3}};
	
	public final static int[][] chantDeSirene1 = {{1,3,1,0}, {1,2,1,1}, {0,1,4,0}};
	public final static int[][] chantDeSirene2 = {{2,1,1,1}, {1,0,2,2}, {3,0,0,2}};
	public final static int[][] chantDeSirene3 = {{1,2,2,0}, {1,1,2,1}, {2,0,1,2}};
	
	public final static int[][] larmeDeDryade1 = {{2,1,1,2}, {1,1,1,3}, {2,0,2,2}};
	public final static int[][] larmeDeDryade2 = {{0,3,0,3}, {2,1,3,0}, {1,1,3,1}};
	public final static int[][] larmeDeDryade3 = {{1,2,1,2}, {1,0,1,4}, {2,4,0,0}};
	
	//public final static ArrayList<int[][]> ListeCarte = new ArrayList<int[][]>(rayonDeLune1, rayonDeLune2]);
	//Fin matrice des cartes ingrédients
	

	
	private int typeOfDeck;

	
	public void shuffle() {
		Collections.shuffle(this);
	
}

	
	public Deck(int typeOfDeck) {
		super();
		this.typeOfDeck = typeOfDeck;
		switch(this.typeOfDeck) {
		
		case ALLY:
			break;
		case INGREDIENT:
			this.push(new Ingredient("Rayon de Lune", rayonDeLune1[0], rayonDeLune1[1], rayonDeLune1[2]));
			this.push(new Ingredient("Rayon de Lune", rayonDeLune2[0], rayonDeLune2[1], rayonDeLune2[2]));
			this.push(new Ingredient("Rayon de Lune", rayonDeLune3[0], rayonDeLune3[1], rayonDeLune3[2]));
			this.push(new Ingredient("Chant de Sirene", chantDeSirene1[0], chantDeSirene1[1], chantDeSirene1[2]));
			this.push(new Ingredient("Chant de Sirene", chantDeSirene2[0], chantDeSirene2[1], chantDeSirene2[2]));
			this.push(new Ingredient("Chant de Sirene", chantDeSirene3[0], chantDeSirene3[1], chantDeSirene3[2]));
			this.push(new Ingredient("Larme de Dryade", larmeDeDryade1[0], larmeDeDryade1[1], larmeDeDryade1[2]));
			this.push(new Ingredient("Larme de Dryade", larmeDeDryade2[0], larmeDeDryade2[1], larmeDeDryade2[2]));
			this.push(new Ingredient("Larme de Dryade", larmeDeDryade3[0], larmeDeDryade3[1], larmeDeDryade3[2]));
			this.shuffle();
			this.shuffle();
			break;
		default:
			break;
		}
	}
	
	
}
