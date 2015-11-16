package card;

import java.util.Collections;
import java.util.LinkedList;


public class Deck extends LinkedList<Card> {
	private static final long serialVersionUID = 999L;
	
	public final static int INGREDIENT = 0;
	public final static int ALLY = 1;
	public final static String[] COULEURS = {"Ingredient", "Ally"};
	
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
	//Fin matrice des cartes ingrédients
	

	
	private int typeOfDeck;
	
	public void shuffle() {
		Collections.shuffle(this);
	
}

	public Card piocher() {
		return this.remove();
		
	}
	
	public Deck(int typeOfDeck) {
		super();
		
		this.typeOfDeck = typeOfDeck;
		switch(this.typeOfDeck) {
		
		case ALLY:
			
			this.add(new Ingredient("Rayon de Lune", rayonDeLune1[1], rayonDeLune1[2], rayonDeLune1[3]));
			this.add(new Ingredient("Rayon de Lune", rayonDeLune2[1], rayonDeLune2[2], rayonDeLune2[3]));
			this.add(new Ingredient("Rayon de Lune", rayonDeLune3[1], rayonDeLune3[2], rayonDeLune3[3]));
			this.add(new Ingredient("Chant de Sirene", chantDeSirene1[1], chantDeSirene1[2], chantDeSirene1[3]));
			this.add(new Ingredient("Chant de Sirene", chantDeSirene2[1], chantDeSirene2[2], chantDeSirene2[3]));
			this.add(new Ingredient("Chant de Sirene", chantDeSirene3[1], chantDeSirene3[2], chantDeSirene3[3]));
			this.add(new Ingredient("Larme de Dryade", larmeDeDryade1[1], larmeDeDryade1[2], larmeDeDryade1[3]));
			this.add(new Ingredient("Larme de Dryade", larmeDeDryade2[1], larmeDeDryade2[2], larmeDeDryade2[3]));
			this.add(new Ingredient("Larme de Dryade", larmeDeDryade3[1], larmeDeDryade3[2], larmeDeDryade3[3]));
			this.shuffle();
			this.shuffle();
			break;
		case INGREDIENT:
			break;
		default:
			break;
		}
	}
	
	
}
