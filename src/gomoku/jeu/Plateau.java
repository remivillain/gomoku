/**
 * @author villain remi, mohamed laredj
 */
package gomoku.jeu ;


import gomoku.regles.Variante;

/** Cette interface représente un plateau de jeu à deux dimensions. 
*/
public class Plateau {
	 /** La grille du jeu */
	  private int jeu[][];

	  /** La largeur de la grille */
	  private int largeur;

	  /** La hauteur de la grille */
	  private int hauteur;

	  /** La variante de la grille */
	  private Variante v;

	  /** Constructeur permettant d'instancer la grille
	   * @param jeu la variante souhaitée */
	  public Plateau(Variante jeu) {
	    this.v = jeu;
	    this.largeur = jeu.largeur();
	    this.hauteur = jeu.hauteur();
	    this.jeu = new int[this.largeur][this.hauteur];
	  }

	  /** Largeur du jeu */
	  public int largeur() {
	    return this.largeur;
	  }

	  /** Hauteur du jeu */
	  public int hauteur() {
	    return this.hauteur;
	  }

	  

}
