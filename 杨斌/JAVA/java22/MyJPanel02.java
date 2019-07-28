package com.java.java22;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyJPanel02 extends JPanel {
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g; // g是Graphics对象
		g2.setStroke(new BasicStroke(5.0f));
		g.setColor(Color.RED);
		g.drawOval(200, 40, 70, 40);
		g.drawLine(190, 85, 150, 130);
		g.drawLine(280, 85, 330, 130);
		g.drawLine(181, 98, 181, 190);
		g.drawLine(295, 98, 295, 190);
	}
}
