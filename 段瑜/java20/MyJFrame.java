package ×÷Òµ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyJFrame extends JFrame{
	public MyJFrame(){
		setSize(600,800);
		getContentPane().setBackground(Color.green);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init() {
		Container contentPane=getContentPane();
		JPanel jPanel=new JPanel();
		BorderLayout bl=new BorderLayout();
		jPanel.setLayout(bl);
		JTextField jf=new JTextField("1");
		jf.setFont(new Font("",5,60));
		jf.setPreferredSize(new Dimension(400,100));
		jPanel.add(jf,BorderLayout.NORTH);
		contentPane.add(jPanel,BorderLayout.NORTH);
		JPanel jpanel=new JPanel();
		GridLayout g1=new GridLayout(5,5,4,4);
		jpanel.setLayout(g1);
		JButton j=new JButton("C");
		JButton j1=new JButton("/");
		JButton j2=new JButton("*");
		JButton j3=new JButton("¡Á");
		jpanel.add(j);
		jpanel.add(j1);
		jpanel.add(j2);
		jpanel.add(j3);
		for (int i=1; i<=15; i++) {
			if(i<4){
				JButton b=new JButton((i+6)+"");
				b.setPreferredSize(new Dimension(20,20));
				jpanel.add(b);
			}else if(i==4){
				JButton b=new JButton("-");
				b.setPreferredSize(new Dimension(20,20));
				jpanel.add(b);
			}else if(5<i&&i<8){
				JButton b=new JButton((i-1)+"");
				b.setPreferredSize(new Dimension(20,20));
				jpanel.add(b);
			}else if(i==8){
				JButton b=new JButton("+");
				b.setPreferredSize(new Dimension(20,20));
				jpanel.add(b);
			}else if(9<=i&&i<12){
				JButton b=new JButton((i-8)+"");
				b.setPreferredSize(new Dimension(20,20));
				jpanel.add(b);
			}else if(i==12){
				JButton b=new JButton("=");
				b.setPreferredSize(new Dimension(40,20));
				jpanel.add(b);
			}else if(i==13){
				JButton b=new JButton("%");
				b.setPreferredSize(new Dimension(20,20));
				jpanel.add(b);
			}else if(i==14){
				JButton b=new JButton(0+"");
				b.setPreferredSize(new Dimension(20,20));
				jpanel.add(b);
			}else{
				JButton b=new JButton(".");
				b.setPreferredSize(new Dimension(20,20));
				jpanel.add(b);
			}
			contentPane.add(jPanel,BorderLayout.NORTH);
			contentPane.add(jpanel,BorderLayout.CENTER);
		}
	}
	public static void main(String[] args){
		MyJFrame j=new MyJFrame();
	}
}
