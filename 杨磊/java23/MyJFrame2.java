package com.nd.yl.demo1;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame2 extends JFrame {
	public MyJFrame2() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}

	private void init() {
		// JPanel jp =new JPanel();
		// 1.创建我们自定一定的面板
		MyJPannel2 mp = new MyJPannel2();
		File bg = new File("plane.png");
		Image image = null;
		try {
			image = ImageIO.read(bg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JLabel jLabel = new JLabel();
		// jLabel.setBounds(x, y, width, height);
		// 图片
		Icon icon = new ImageIcon("plane.png");
		// 设置控件的图标
		jLabel.setIcon(icon);
		mp.add(jLabel);
		// 2.,将面板添加到窗体
		this.add(mp);
	}

	public static void main(String[] args) {
		new MyJFrame2();
	}
}
