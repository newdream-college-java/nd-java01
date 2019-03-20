package com.java.java20;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Z1 extends JFrame{
	public Z1(){
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}
	private void into() {
		Container panel=this.getContentPane();
		FlowLayout f1=new FlowLayout();
		panel.setLayout(f1);		
		JButton jb=new JButton("按钮");
		jb.setPreferredSize(new Dimension(100,50));
		JTextField j2=new JTextField(10);
		JRadioButton jr1=new JRadioButton("单选1");
		JRadioButton jr2=new JRadioButton("单选2");
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(jr1);
		bg1.add(jr2);
		JLabel ja1=new JLabel("HelloWorld");
		panel.add("HelloWorld",ja1);	
		panel.add(jb);
		panel.add(j2);
		panel.add(jr1);
		panel.add(jr2);
		
		
	}
	public static void main(String[] args) {
		Z1 m1=new Z1();
	}
}
