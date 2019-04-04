package com.java.java22;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyJPanel extends JPanel {
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g; // g是Graphics对象
		g2.setStroke(new BasicStroke(5.0f));
		g2.setColor(Color.GREEN);
		g.drawRect(40, 40, 300, 300);
		g.setColor(Color.RED);
		g.drawLine(40, 40, 115, 115);
		g.drawLine(340, 40,265, 115);
		g.drawRect(115, 115, 150, 150);
		g.drawLine(40, 340, 115, 265);
		g.drawLine(340, 340, 265, 265);
	}
}
