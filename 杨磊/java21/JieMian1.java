package com.nd.yl.demo1;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JieMian1 extends JFrame {
	public JieMian1() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}

	public void init() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton jb = new JButton("按钮");
		jb.setSize(40, 40);

		JTextField jt = new JTextField("文本框", 10);

		JRadioButton jr1 = new JRadioButton("男");
		JRadioButton jr2 = new JRadioButton("女");
		ButtonGroup b = new ButtonGroup();
		b.add(jr1);
		b.add(jr2);
		JLabel jl = new JLabel("HelloWorld");

		jp.add(jb);
		jp.add(jt);
		jp.add(jr1);
		jp.add(jr2);
		jp.add(jl);
		this.add(jp);
	}

	public static void main(String[] args) {
		JieMian1 a = new JieMian1();

	}
}