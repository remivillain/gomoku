/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gomoku.gui;

/**
 *
 * @author laredjm
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
 
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
 
public class Gomoku {
 
	private static final int NBLINES = 8;
	private static final int HEADER_HEIGHT = 100; 
	private static final int NBCOLUMNS = NBLINES;
	private static final int STONE_WIDTH = 60;
	private static final int WIDTH = STONE_WIDTH+4;
	private static final int HEIGHT = WIDTH;

 
	public static void main(String[] args) {
            Plateau P = new Plateau(7,7);
            showImage(P.getImage());
        }
		
 
	private static void showImage(BufferedImage image) {
		JFrame frame = new JFrame("Image");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		frame.add(new JLabel(new ImageIcon(image)));
 
		frame.pack();
		frame.setVisible(true);
	}
 
}
