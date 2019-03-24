package ×÷Òµ;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class Test1 extends JFrame {
	public Test1(){
		JFrame jf=new JFrame();
		jf.setLayout(new FlowLayout());
		jf.setBounds(500, 500, 700, 700);
		JButton jb=new JButton("button");
		JTextField jt=new JTextField();
		jt.setPreferredSize(new Dimension(10,10));
		jt.setPreferredSize(new Dimension(10,10));
		JRadioButton jr=new JRadioButton();
		JRadioButton jr1=new JRadioButton();
		jr.setText("ÄÐ");
		jr1.setText("Å®");
		JLabel jl=new JLabel("HelloWorld");
		jf.add(jb);
		jf.add(jl);
		jf.add(jr);
		jf.add(jt);
		jf.add(jr1);
		jf.add(jl);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1();
	}

}
