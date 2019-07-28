package com.java.java21;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Z4 extends JFrame{
	JLabel l1;
	JTextField j1;
	JTextField j2;
	public Z4(){
		setSize(500,380);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}

	private void into() {
		Panel p1=new Panel();
		p1.setLayout(null);
		j1=new JTextField(180);
		j1.setBounds(30, 50, 180, 30);
		l1=new JLabel();
		l1.setBounds(110, 120,180, 30);
		p1.add(j1);
		p1.add(l1);
		add(p1);
		j1.addKeyListener(new KeyAdapter() {
			 public void keyPressed(KeyEvent e) {
				 l1.setText("你按下了"+KeyEvent.getKeyText(e.getKeyCode())+"键");
			 }
		});
		
	}
	public static void main(String[] args) {
		new Z4();
	}
}