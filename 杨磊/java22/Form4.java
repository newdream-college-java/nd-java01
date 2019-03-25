package com.nd.yl.demo1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form4 extends JFrame {
	public Form4() {
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		// 设置可见性
		this.setVisible(true);
	}

	private void init() {
		JPanel jp = new JPanel();
		jp.setLayout(null);

		JTextField jt1 = new JTextField();
		jt1.setBounds(20, 20, 200, 30);
		jp.add(jt1);

		JLabel jl1 = new JLabel("显示按钮过程：");
		jl1.setBounds(20, 60, 200, 30);
		jp.add(jl1);

		JLabel jl2 = new JLabel();
		jl2.setBounds(50, 100, 200, 30);
		jp.add(jl2);

		this.add(jp);

		jt1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				jl2.setText("你按下了" + KeyEvent.getKeyText(e.getKeyCode()) + "键");

			}
		});

	}

	public static void main(String[] args) {
		new Form4();
	}

}
