package com.nd.yl.demo1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyJPannel2 extends JPanel {

	// g :画笔
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 增强的功能---不仅仅能画控件到面板 还能非控件到面板
		// 绘制一张图片到面板，不绘制 控件！！
		// 画背景图片
		File bg = new File("FF201311.jpg");
		Image image = null;
		try {
			image = ImageIO.read(bg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 1.不能对图片进行缩放
		// image ---图片 x,y----图片在面板中的坐标 observer---this
		// g.drawImage(image,10, 10, this);
		// 2.支持缩放--- width:图片框宽 height:图片框的高度
		g.drawImage(image, 0, 0, 600, 400, this);

		File xiaohua = new File("plane.png");
		Image image1 = null;
		try {
			image1 = ImageIO.read(xiaohua);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image1, 200, 100, this);

	}
}
