package br.univel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Ex02 extends JPanel {
	
	public Ex02() {
		
		super();
		this.setBackground(Color.WHITE);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
	super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
	
		int w = getWidth();
		int h = getHeight();
		
		int x = (w / 2);
		int y = (h / 2);
		
		g2.drawLine(w / 2, 0, w / 2, h);
		g2.drawLine(0, 0, x - 10, h);
		g2.drawLine(x + 10, h, w, 0);
		g2.drawLine(w, y, 0, h);
		
		g2.dispose();
	}
}

