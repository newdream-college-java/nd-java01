package com.java.java22;

import javax.swing.JFrame;

public class Z3 extends JFrame{
	public Z3(){
		setSize(800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}

	private void into() {
		myJpanel03 j1=new myJpanel03();
		this.add(j1);
		
	}
	public static void main(String[] args) {
		new Z3();
	}
}
