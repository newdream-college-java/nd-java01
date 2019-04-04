package com.java.java22;

import javax.swing.JFrame;

public class Z1 extends JFrame{
	public Z1(){
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}

	private void into() {
		MyJPanel j1=new MyJPanel();
		this.add(j1);
		
	}
	public static void main(String[] args) {
		new Z1();
	}
}
