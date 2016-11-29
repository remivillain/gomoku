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
public class Pierre {
    private final boolean color;
    private final int nb;
 
    public Pierre(boolean color, int nb) {
			this.color=color;
			this.nb=nb;
		}
 
		public int getNumber() {
			return nb;
		}
 
		public boolean getColor() {
			return color;
		}
		public String getLabel() {
			return String.valueOf(nb);
		}
}
