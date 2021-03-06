// WIDTH and HEIGHT are constants for how many pixels wide maze cells are.

import java.awt.Color;


public class Cell {
	public static final int WIDTH = 7;
	public static final int HEIGHT = 7;
	
	private int x;
	private int y;
	
	private Color col;
	
	public Cell(int setx, int sety) {
		x = setx;
		y = sety;
		col = Color.black;
	}
	
	public Color getColor() {return col;}
	public void setColor(Color newCol) {col = newCol;}
	
	public int getx() {return x;}
	public int gety() {return y;}
	
	public void flip() {
		col = new Color(255 - col.getRed(), 255 - col.getGreen(), 255 - col.getBlue());
	}
}
