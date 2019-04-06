package com.nd.yl.demo1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form1 extends JFrame {
	public Form1() {
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		// 设置可见性
		this.setVisible(true);
	}

	private void init() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.LEFT));

		JTextField jt = new JTextField();
		jt.setPreferredSize(new Dimension(280, 30));
		jp.add(jt);

		JButton jb = new JButton("显示消息");
		jb.setPreferredSize(new Dimension(100, 30));
		jp.add(jb);

		this.add(jp);

		jb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showConfirmDialog(null, jt.getText(), "消息框", JOptionPane.PLAIN_MESSAGE);
			}
		});
	}

	public static void main(String[] args) {
		new Form1();

	}

}
