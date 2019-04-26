package 作业;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Zy2 extends JFrame {
	public Zy2(){
		setSize(600,500);
		getContentPane().setBackground(Color.white);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init() {
		JPanel p = (JPanel) getContentPane();
		BorderLayout b = new BorderLayout(20,30);
        p.setLayout(b);
		JButton b1=new JButton("南");	
		JButton b2=new JButton("北");
		JButton b3=new JButton("东");
		JButton b4=new JButton("西");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
	    JPanel center = new JPanel();
        center.setLayout(new FlowLayout());
        GridLayout g=new GridLayout(4,3,1,1);
        center.setLayout(g);
	    for (int i = 1; i <= 12; i++) {
	    	JButton j = new JButton(i+"");
	    	center.add(j);
		}
		
		p.add(b1, BorderLayout.SOUTH);
	    p.add(b2,BorderLayout.NORTH);
	    p.add(b3, BorderLayout.EAST);
	    p.add(b4,BorderLayout.WEST);
		p.add(center,BorderLayout.CENTER);
		this.setContentPane(p);
	}
	public static void main(String[] args) {
		Zy2 a=new Zy2();

	}

}
