package provaSwing;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class ProvaSwing2 extends Canvas {
	
	int xx=700;
	int yy=700;
	
	public void paint(Graphics g) {
		int x = xx/2;
		int y = yy/2;
		g.drawRect(x, y, 1, 1);
		g.drawRect(x, y+1, 1, 1);
		g.drawRect(x+1, y, 2, 2);
		g.drawRect(x, y-3, 3, 3);
		g.drawRect(x-5, y-3, 5, 5);
		g.drawRect(x-5, y+2, 8, 8);
		g.drawRect(x+3, y-3, 13, 13);
		g.drawRect(x-5, y-24, 21, 21);

	}
	

	public static void main(String[] args) {
		
		ProvaSwing2 m = new ProvaSwing2();
		
		JFrame f = new JFrame();
		f.add(m);
		int larghezza = m.xx;
		int altezza = m.yy;
		f.setSize(larghezza, altezza);
		f.paint(null);
		

		
	}

}
