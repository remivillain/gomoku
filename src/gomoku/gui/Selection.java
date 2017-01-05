/**
 * @author villain remi, mohamed laredj
 */

package gomoku.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gomoku.jeu.*;
import gomoku.regles.*;

/** Cette classe permet d'instancier la fenêtre principale de l'application */
public class Selection extends JFrame implements ActionListener {

  // le panel
  private JPanel pan1 = new JPanel();
  private JPanel pan2 = new JPanel();
  private JPanel pan3 = new JPanel();

  // les bouttons
  private JButton boutonIAG = new JButton("Gomoku contre l'ordinateur");
  private JButton boutonHG = new JButton("Gomoku contre un ami");



  
  private Plateau pG = new Plateau(new Gomoku());

  public void actionPerformed(ActionEvent e) {
    if ((JButton)e.getSource() == boutonIAG)
      new Jeu(pG);
    else if ((JButton)e.getSource() == boutonHG)
      new Jeu(pG);
    
    this.dispose();
    this.setVisible(false);
  }

  /** Constructeur de Selection permetant l'instanciation
   * de la fenêtre principale. */
  public Selection () {

    this.setTitle("Mode de jeu");
    this.setSize(800, 200);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    // Ajout des actions sur les boutons.
    boutonIAG.addActionListener(this);
    boutonHG.addActionListener(this);

    // On place les labels et boutons dans la fenêtre.
    
    pan2.add(boutonIAG);
    pan2.add(boutonHG);
    pan3.add(pan1);
    pan3.add(pan2);

    this.setContentPane(pan3);
    this.setVisible(true);
  }

  /** Methode principale du programme */
  public static void main (String[] args) {
    Selection s = new Selection();
  }
}
