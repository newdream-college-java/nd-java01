package ×÷Òµ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test1 extends JFrame{
	public Test1(){
		setSize(600,800);
		getContentPane().setBackground(Color.green);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	public void init(){
		JPanel jPanel=(JPanel)getContentPane();
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		jPanel.setLayout(fl);
		JButton jb=new JButton("ÄÐ");
		JButton jb1=new JButton("Å®");
		JTextField jft=new JTextField("HellWorld",10);
		jb1.setPreferredSize(new Dimension(100,50));
		jb.setPreferredSize(new Dimension(100,50));
		jft.setBounds(0,0,500,100);
		jPanel.add(jb);
		jPanel.add(jb1);
		jPanel.add(jft);
		
	}
	public static void main(String[] args){
		Test1 test=new Test1();
	}

	
}
