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
	public final static int[][] RAYON_DE_LUNE1 = {{1,1,1,1}, {2,0,1,1}, {2,0,2,0}};
	public final static int[][] RAYON_DE_LUNE2 = {{2,0,1,1}, {1,3,0,0}, {0,1,2,1}};
	public final static int[][] RAYON_DE_LUNE3 = {{0,0,4,0}, {0,2,2,0}, {0,0,1,3}};
	
	public final static int[][] CHANT_DE_SIRENE1 = {{1,3,1,0}, {1,2,1,1}, {0,1,4,0}};
	public final static int[][] CHANT_DE_SIRENE2 = {{2,1,1,1}, {1,0,2,2}, {3,0,0,2}};
	public final static int[][] CHANT_DE_SIRENE3 = {{1,2,2,0}, {1,1,2,1}, {2,0,1,2}};
	
	public final static int[][] LARME_DE_DRYADE1 = {{2,1,1,2}, {1,1,1,3}, {2,0,2,2}};
	public final static int[][] LARME_DE_DRYADE2 = {{0,3,0,3}, {2,1,3,0}, {1,1,3,1}};
	public final static int[][] LARME_DE_DRYADE3 = {{1,2,1,2}, {1,0,1,4}, {2,4,0,0}};
	
	public final static int[][] FONTAINE_D_EAU_PURE1 = {{1,3,1,2}, {2,1,2,2}, {0,0,3,4}};
	public final static int[][] FONTAINE_D_EAU_PURE2 = {{2,2,0,3}, {1,1,4,1}, {1,2,1,3}};
	public final static int[][] FONTAINE_D_EAU_PURE3 = {{2,2,3,1}, {2,3,0,3}, {1,1,3,3}};
			
	public final static int[][] POUDRE_D_OR1 = {{2,2,3,1}, {2,3,0,3}, {1,1,3,3}};
	public final static int[][] POUDRE_D_OR2 = {{2,2,2,2}, {0,4,4,0}, {1,3,2,2}};
	public final static int[][] POUDRE_D_OR3 = {{3,1,3,1}, {1,4,2,1}, {2,4,1,1}};
	
	public final static int[][] RACINE_D_ARC_EN_CIEL1 = {{4,1,1,1}, {1,2,1,3}, {1,2,2,2}};
	public final static int[][] RACINE_D_ARC_EN_CIEL2 = {{2,3,2,0}, {0,4,3,0}, {2,1,1,3}};
	public final static int[][] RACINE_D_ARC_EN_CIEL3 = {{2,2,3,0}, {1,1,1,4}, {2,0,3,2}};
	
	public final static int[][] ESPRIT_DE_DOLMEN1 = {{4,1,1,1}, {1,2,1,3}, {1,2,2,2}};
	public final static int[][] ESPRIT_DE_DOLMEN2 = {{2,4,1,2}, {2,2,2,3}, {1,4,3,1}};
	public final static int[][] ESPRIT_DE_DOLMEN3 = {{3,3,3,0}, {1,3,3,2}, {2,3,1,3}};
	
	public final static int[][] RIRE_DE_FEE1 = {{1,2,2,1}, {1,2,3,0}, {0,2,2,2}};
	public final static int[][] RIRE_DE_FEE2 = {{4,0,1,1}, {1,1,3,1}, {0,0,3,3}};
	public final static int[][] RIRE_DE_FEE3 = {{2,0,1,3}, {0,3,0,3}, {1,2,2,1}};
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
			this.push(new Ingredient("Rayon de Lune", RAYON_DE_LUNE1[0], RAYON_DE_LUNE1[1], RAYON_DE_LUNE1[2]));
			this.push(new Ingredient("Rayon de Lune", RAYON_DE_LUNE2[0], RAYON_DE_LUNE2[1], RAYON_DE_LUNE2[2]));
			this.push(new Ingredient("Rayon de Lune", RAYON_DE_LUNE3[0], RAYON_DE_LUNE3[1], RAYON_DE_LUNE3[2]));
			this.push(new Ingredient("Chant de Sirene", CHANT_DE_SIRENE1[0], CHANT_DE_SIRENE1[1], CHANT_DE_SIRENE1[2]));
			this.push(new Ingredient("Chant de Sirene", CHANT_DE_SIRENE2[0], CHANT_DE_SIRENE2[1], CHANT_DE_SIRENE2[2]));
			this.push(new Ingredient("Chant de Sirene", CHANT_DE_SIRENE3[0], CHANT_DE_SIRENE3[1], CHANT_DE_SIRENE3[2]));
			this.push(new Ingredient("Larme de Dryade", LARME_DE_DRYADE1[0], LARME_DE_DRYADE1[1], LARME_DE_DRYADE1[2]));
			this.push(new Ingredient("Larme de Dryade", LARME_DE_DRYADE2[0], LARME_DE_DRYADE2[1], LARME_DE_DRYADE2[2]));
			this.push(new Ingredient("Larme de Dryade", LARME_DE_DRYADE3[0], LARME_DE_DRYADE3[1], LARME_DE_DRYADE3[2]));
			this.push(new Ingredient("Fontaine d'Eau Pure", FONTAINE_D_EAU_PURE1[0], FONTAINE_D_EAU_PURE1[1], FONTAINE_D_EAU_PURE1[2]));
			this.push(new Ingredient("Fontaine d'Eau Pure", FONTAINE_D_EAU_PURE2[0], FONTAINE_D_EAU_PURE2[1], FONTAINE_D_EAU_PURE2[2]));
			this.push(new Ingredient("Fontaine d'Eau Pure", FONTAINE_D_EAU_PURE3[0], FONTAINE_D_EAU_PURE3[1], FONTAINE_D_EAU_PURE3[2]));
			this.push(new Ingredient("Poudre d'Or", POUDRE_D_OR1[0], POUDRE_D_OR1[1], POUDRE_D_OR1[2]));
			this.push(new Ingredient("Poudre d'Or", POUDRE_D_OR2[0], POUDRE_D_OR2[1], POUDRE_D_OR2[2]));
			this.push(new Ingredient("Poudre d'Or", POUDRE_D_OR3[0], POUDRE_D_OR3[1], POUDRE_D_OR3[2]));
			this.push(new Ingredient("Racine d'Arc-En-Ciel", RACINE_D_ARC_EN_CIEL1[0], RACINE_D_ARC_EN_CIEL1[1], RACINE_D_ARC_EN_CIEL1[2]));
			this.push(new Ingredient("Racine d'Arc-En-Ciel", RACINE_D_ARC_EN_CIEL2[0], RACINE_D_ARC_EN_CIEL2[1], RACINE_D_ARC_EN_CIEL2[2]));
			this.push(new Ingredient("Racine d'Arc-En-Ciel", RACINE_D_ARC_EN_CIEL3[0], RACINE_D_ARC_EN_CIEL3[1], RACINE_D_ARC_EN_CIEL3[2]));
			this.push(new Ingredient("Esprit de Dolmen", ESPRIT_DE_DOLMEN1[0], ESPRIT_DE_DOLMEN1[1], ESPRIT_DE_DOLMEN1[2]));
			this.push(new Ingredient("Esprit de Dolmen", ESPRIT_DE_DOLMEN2[0], ESPRIT_DE_DOLMEN2[1], ESPRIT_DE_DOLMEN2[2]));
			this.push(new Ingredient("Esprit de Dolmen", ESPRIT_DE_DOLMEN3[0], ESPRIT_DE_DOLMEN3[1], ESPRIT_DE_DOLMEN3[2]));
			this.push(new Ingredient("Rire de Fée", RIRE_DE_FEE1[0], RIRE_DE_FEE1[1], RIRE_DE_FEE1[2]));
			this.push(new Ingredient("Rire de Fée", RIRE_DE_FEE2[0], RIRE_DE_FEE2[1], RIRE_DE_FEE2[2]));
			this.push(new Ingredient("Rire de Fée", RIRE_DE_FEE3[0], RIRE_DE_FEE3[1], RIRE_DE_FEE3[2]));
			this.shuffle();
			//this.shuffle();
			break;
		default:
			break;
		}
	}
	
	
}
