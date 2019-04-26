package 作业;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Zy1 extends JFrame {
	public Zy1(){
		setSize(600,500);
		getContentPane().setBackground(Color.green);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init() {
		JPanel p = (JPanel) getContentPane();
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        p.setLayout(fl);
		JButton b=new JButton("1");	
		b.setPreferredSize(new Dimension(100,50));
		add(b);
		JTextField t=new JTextField();	
		t.setPreferredSize(new Dimension(10,50));
		add(t);	
		JRadioButton r=new JRadioButton("男");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r);
		add(r);
		r.setSelected(true);		
		JRadioButton r1=new JRadioButton("女");	
		bg.add(r1);
		add(r1);
		JLabel l=new JLabel("HelloWord");
		add(l);
	}
	public static void main(String[] args) {
		Zy1 a=new Zy1();

	}

}
