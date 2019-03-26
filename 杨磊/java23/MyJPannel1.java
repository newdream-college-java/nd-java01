package com.nd.yl.demo1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyJPannel1 extends JPanel {
	// g :画笔
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		// 正方形 drawRect
		g.setColor(Color.GREEN);
		g.drawRect(40, 40, 100, 100);
		g.setColor(Color.RED);
		g.drawLine(40, 40, 65, 65);
		g.drawLine(140, 40, 115, 65);
		g.drawRect(65, 65, 50, 50);
		g.drawLine(40, 140, 65, 115);
		g.drawLine(140, 140, 115, 115);

		// 椭圆形 drawOval
		g.setColor(Color.RED);
		g.drawOval(200, 40, 70, 40);
		g.drawLine(205, 70, 180, 100);
		g.drawLine(265, 70, 300, 100);
		g.drawLine(196, 83, 196, 150);
		g.drawLine(281, 83, 281, 150);
	}
}
