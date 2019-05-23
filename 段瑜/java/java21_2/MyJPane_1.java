package job;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class MyJPane_1 extends JPanel{
	public void paint(Graphics g){
		g.setColor(Color.green);
		g.drawRect(50, 50, 100, 100);
		g.setColor(Color.RED);
		g.drawLine(50, 50, 70, 70);
		g.drawLine(150, 50, 130, 70);
		g.drawRect(70, 70, 60, 60);
		g.drawLine(50,150,70,130);
		g.drawLine(150, 150, 130, 130);
		
		g.drawOval(200, 50, 70, 50);
		g.drawLine(205, 90, 180, 110);
		g.drawLine(265, 90, 300, 110);
		g.drawLine(205, 90, 205, 160);
		g.drawLine(265, 90,265,160);
	}
}
