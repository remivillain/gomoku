/**
 * @author villain remi, mohamed laredj
 */

package gomoku.gui;

import gomoku.jeu.* ;
import javax.swing.JPanel;
import gomoku.regles.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;


/** La représentation graphique du plateau */
public class DessinPlateau extends JPanel {

  /** Largeur du plateau */
  /** Hauteur du plateau */
  /** Espace du plateau */
  private int largeur, hauteur,espace=45;

  /** Le plateau */
  private Plateau plateau;

  /** Elements graphiques */
  private Image fond, pionBlanc, pionNoir;

  /** Constructeur DessinPlateau */
  public DessinPlateau(Plateau p) {
    this.plateau = p;
    this.largeur = p.largeur();
    this.hauteur = p.hauteur();
  }

  /** Redéfinition de la méthode paintComponent
   * pour dessiner le plateau correspondant à la partie
   */
  public void paintComponent(Graphics g){
    super.paintComponent(g);

    try {
      fond = ImageIO.read(new File("images/fond.png"));
      g.drawImage(fond, 0, 0, this.getWidth(), this.getHeight(), this);

    }
    catch (IOException e) {
      e.printStackTrace();
    }

   
     for(int iX = 0; iX < this.largeur-1; iX++){
      for(int iY = 0; iY < this.hauteur-1; iY++){
        g.setColor(Color.BLACK);
        g.drawRect(espace*iX+espace, espace*iY+espace, espace, espace);
      }
    }

    
  }
  
}
