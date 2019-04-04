package com.java.java22;
import javax.swing.JFrame;

public class Z2 extends JFrame{
	public Z2(){
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}

	private void into() {
		MyJPanel02 j1=new MyJPanel02();
		this.add(j1);
		
	}
	public static void main(String[] args) {
		new Z2();
	}
}
