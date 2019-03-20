package 作业;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 extends JFrame{
	public Test2(){
		setSize(800,600);
		getContentPane().setBackground(Color.BLUE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
		
	}
	public void init(){
		JPanel jPanel=new JPanel();
		BorderLayout bl=new BorderLayout();
		jPanel.setLayout(bl);
		JButton jb=new JButton("东");
		JButton jb1=new JButton("南");
		JButton jb2=new JButton("西");
		JButton jb3=new JButton("北");
		jPanel.add(jb);
		jPanel.add(jb1);
		jPanel.add(jb2);
		jPanel.add(jb3);
		JPanel center=new JPanel();
		GridLayout gird=new GridLayout(4,3,1,1);
		center.setLayout(gird);
		for (int i = 1; i <13; i++) {
			JButton j=new JButton(i+"");
			
				j.setPreferredSize(new Dimension(20,20));
			
				center.add(j);
		}
		jPanel.add(jb1,BorderLayout.SOUTH);
		jPanel.add(jb,BorderLayout.NORTH);
		jPanel.add(jb3,BorderLayout.EAST);
		jPanel.add(jb2,BorderLayout.WEST);
		jPanel.add(center,BorderLayout.CENTER);
		this.add(jPanel);
	}
	public static void main(String[] args){
		Test2 test=new Test2();
	}
}
