package com.nd.yl.demo1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyJFrame1 extends JFrame {
	public MyJFrame1() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}

	private void init() {
		// JPanel jp =new JPanel();
		// 1.创建我们自定�?定的面板
		MyJPannel1 mp = new MyJPannel1();

		// 2.,将面板添加到窗体
		this.add(mp);

		mp.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println(e.getPoint());
			}
		});
	}

	public static void main(String[] args) {
		new MyJFrame1();
	}
}
