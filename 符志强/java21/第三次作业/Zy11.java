package 作业3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Zy11 extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        //画线
        //上
        g.setColor(Color.green);
        g.drawLine(10, 10, 200, 10);
        //下
        g.setColor(Color.green);
        g.drawLine(10, 200, 200, 200);
        //左
        g.setColor(Color.green);
        g.drawLine(10, 10, 10, 200);
        //右
        g.setColor(Color.green);
        g.drawLine(200, 10, 200, 200);
        //中上
        g.setColor(Color.RED);
        g.drawLine(50, 50, 150, 50);
        //中下
        g.setColor(Color.RED);
        g.drawLine(50, 150, 150, 150);
        //中左
        g.setColor(Color.RED);
        g.drawLine(50, 50, 50, 150);
        //中右
        g.setColor(Color.RED);
        g.drawLine(150, 50, 150, 150);
        //左上
        g.setColor(Color.RED);
        g.drawLine(10, 10, 50, 50);
        //右上
        g.setColor(Color.RED);
        g.drawLine(200, 10, 150, 50);
        //左下
        g.setColor(Color.RED);
        g.drawLine(10, 200, 50, 150);
        //右下
        g.setColor(Color.RED);
        g.drawLine(200, 200, 150, 150);
        //园头
        g.setColor(Color.RED);
        g.drawOval(300, 10, 150, 80);
        //左手
        g.setColor(Color.RED);
        g.drawLine(330, 82, 230, 150);
        //右手
        g.setColor(Color.RED);
        g.drawLine(420, 82, 520, 150);
        //左腿
        g.setColor(Color.RED);
        g.drawLine(305, 110, 305, 300);
        //右腿
        g.setColor(Color.RED);
        g.drawLine(445, 110, 445, 300);
    }
}
