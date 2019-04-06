package com.nd.yl.demo1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form2 extends JFrame {
	public Form2() {
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		// 设置可见性
		this.setVisible(true);
	}

	private void init() {
		JPanel jp = new JPanel();
		jp.setLayout(null);

		JLabel jl1 = new JLabel("半径");
		jl1.setBounds(50, 50, 100, 50);
		jp.add(jl1);

		JTextField jt1 = new JTextField(" ");
		jt1.setBounds(160, 50, 150, 50);
		jp.add(jt1);

		JButton jb = new JButton("计算");
		jb.setBounds(200, 150, 100, 50);
		jp.add(jb);

		JLabel jl2 = new JLabel("面积");
		jl2.setBounds(50, 250, 100, 50);
		jp.add(jl2);

		JTextField jt2 = new JTextField(" ");
		jt2.setBounds(160, 250, 150, 50);
		jp.add(jt2);

		this.add(jp);

		jb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double sum = Double.parseDouble(jt1.getText()) * Double.parseDouble(jt1.getText()) * 3.14;
				jt2.setText(sum + " ");
			}
		});
	}

	public static void main(String[] args) {
		new Form2();
	}

}
