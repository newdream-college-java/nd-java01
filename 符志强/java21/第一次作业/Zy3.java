package 作业;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Zy3 extends JFrame {
	JButton a2;
	public Zy3() {
		setSize(315,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init() {
		JPanel p=new JPanel();
		p.setLayout(new BorderLayout(50,0));		
		JTextField t = new JTextField();		
		add(t);
		JPanel p1=new JPanel();
        GridLayout g1=new GridLayout(5,3,1,1);
		p1.setLayout(g1);
        String[] a={"0","1","2","3","4","5","6","7","8","9","+","-","*","/","="};
        for (String a1 : a) {
			a2=new JButton(a1);
			p1.add(a2);
			a2.setFocusPainted(false);
		}
        p.add(t,BorderLayout.NORTH);
        p.add(p1,BorderLayout.CENTER);
        this.add(p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zy3 a=new Zy3();
	}

}
