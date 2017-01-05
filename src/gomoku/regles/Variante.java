/**
 * @author villain remi, mohamed laredj
 */
package gomoku.regles ;

/** Cette classe décrit les caractéristiques des variantes du
 * jeu */
public abstract class Variante {
  private int largeur, hauteur ;

  /** Construit une variante à partir des dimensions et des règles
   * spécifiées */
  public Variante(int largeur, int hauteur) {
    this.largeur = largeur ;
    this.hauteur = hauteur ;
  }

  /** Largeur du plateau */
  public int largeur() {
    return this.largeur ;
  }

  /** Hauteur du plateau */
  public int hauteur() {
    return this.hauteur ;
  }

}
