package com.nd.yl.demo1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JieMian2 extends JFrame {
	public JieMian2() {

		setSize(600, 800);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		into();

		setVisible(true);

	}

	private void into() {

		JPanel jp1 = new JPanel();
		jp1.setLayout(new BorderLayout());

		JButton jb1 = new JButton("东");
		JButton jb2 = new JButton("北");
		JButton jb3 = new JButton("西");
		JButton jb4 = new JButton("南");

		JPanel center = new JPanel(new GridLayout(4, 3, 1, 1));

		for (int i = 1; i <= 12; i++) {

			JButton jb = new JButton(" " + i);

			center.add(jb);

		}

		jp1.add(jb1, BorderLayout.WEST);

		jp1.add(jb2, BorderLayout.NORTH);

		jp1.add(jb3, BorderLayout.EAST);

		jp1.add(jb4, BorderLayout.SOUTH);

		jp1.add(center, BorderLayout.CENTER);

		this.add(jp1);

	}

	public static void main(String[] args) {

		JieMian2 z = new JieMian2();

	}

}
