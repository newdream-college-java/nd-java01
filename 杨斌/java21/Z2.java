package com.java.java21;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Z2 extends JFrame{
	JTextField t1;
	JTextField t2;
	public Z2(){
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}

	private void into() {
		Container panel=getContentPane();
		panel.setLayout(null);
		JLabel l1=new JLabel("半径");
		l1.setBounds(30, 30,80, 30);
		l1.setFont(new Font("宋体",Font.BOLD,20));
		t1=new JTextField();
		t1.setBounds(120, 30, 180, 30);
		t1.setFont(new Font("宋体",Font.BOLD,20));
		JButton b1=new JButton("计算");
		b1.setBounds(210, 80, 90, 30);
		b1.setFocusPainted(false);
		JLabel l2=new JLabel("圆面积");
		l2.setBounds(30, 130, 80, 30);
		l2.setFont(new Font("宋体",Font.BOLD,20));
		t2=new JTextField();
		t2.setBounds(120, 130, 180, 30);
		t2.setFont(new Font("宋体",Font.BOLD,20));
		panel.add(l1);
		panel.add(t1);
		panel.add(b1);
		panel.add(l2);
		panel.add(t2);
		b1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Integer i=Integer.parseInt(t1.getText());
					Double j=i*i*3.14;
					t2.setText(String.valueOf(j));
				} catch (Exception e2) {
					JOptionPane.showConfirmDialog(null, "请确定输入的数字");
					
				}
				
			}
		});
	}
	public static void main(String[] args) {
		new Z2();
	}



	
}
	