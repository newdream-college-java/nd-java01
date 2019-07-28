package com.java.java21;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Z1 extends JFrame{
	JTextField jT;
	public Z1(){
		setSize(600,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}

	private void into() {
		JPanel jP=new JPanel();
		jT=new JTextField(20);
		jT.setPreferredSize(new Dimension(0,30));
		JButton jL=new JButton("显示消息");
		jL.setFocusPainted(false);
		jL.setPreferredSize(new Dimension(130,30));
		jP.add(jT);
		jP.add(jL);
		add(jP);
		jL.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,jT.getText(),"消息框",JOptionPane.PLAIN_MESSAGE);
				
			}
		});
		
	}
	public static void main(String[] args) {
		new Z1();
	}

	
}
	