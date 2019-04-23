package march25;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Hw01JPanel extends JPanel{
	public void paint(Graphics g) {
		super.paint(g);
		// 正方形 drawRect
		g.setColor(Color.green);
		g.drawRect(40, 40, 100, 100);
		g.setColor(Color.RED);
		g.drawLine(40, 40, 65, 70);
		g.drawLine(140, 40, 115,70);
		g.drawRect(65, 70, 50, 40);
		g.drawLine(40, 140, 65, 110);
		g.drawLine(140, 140, 115, 110);

		// 椭圆形 drawOval
		g.setColor(Color.RED);
		g.drawOval(200, 40, 70, 40);
		g.drawLine(205, 70, 180, 100);
		g.drawLine(265, 70, 300, 100);
		g.drawLine(196, 83, 196, 150);
		g.drawLine(281, 83, 281, 150);
	}
}
