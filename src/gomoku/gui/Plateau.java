/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gomoku.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 *
 * @author laredjm
 */
public class Plateau {
    Pierre[][] plateau ;
    private static final int largeurPierre = 60;
    private static final int largeur = largeurPierre+4;
    private static final int hauteur = largeur;
    private BufferedImage image;
            
    public Plateau (int nbLignes, int nbColonnes){
        
        int width = (nbColonnes+2)*largeur; 
	int height = (nbLignes+2)*hauteur;
    	image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
 
	Graphics2D graphics = image.createGraphics();
 
	graphics.setBackground(Color.getHSBColor(0, 200, 255));
	graphics.clearRect(0, 0, width, height);
		
	// lignes de grille horizontales
	for(int i=0; i<nbLignes; i++) {
	int x1=largeur+largeur/2;
	int x2=largeur/2+largeur*nbColonnes;
	int y=hauteur+hauteur/2+i*hauteur;
	graphics.drawLine(x1, y, x2, y);
	if ( i==0 ) {
            graphics.drawLine(x1-1, y-1, x2+1, y-1);
	}
	else if ( i==nbLignes-1 ) {
            graphics.drawLine(x1-1, y+1, x2+1, y+1);
	}
	}
 
	// lignes de grille verticales
	for(int i=0; i<nbColonnes; i++) {
	int y1=hauteur+hauteur/2;
	int y2=hauteur/2+hauteur*nbLignes;
	int x=largeur+largeur/2+i*largeur;
	graphics.drawLine(x, y1, x, y2);
	if ( i==0 ) {
	graphics.drawLine(x-1, y1-1, x-1, y2+1);
	}
	else if ( i==nbColonnes-1 ) {
            graphics.drawLine(x+1, y1-1, x+1, y2+1);
	}
	}
 
	graphics.dispose();
    }
    
    public BufferedImage getImage(){
        return image;
    } 
}
