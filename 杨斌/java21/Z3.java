package com.java.java21;

import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Z3 extends JFrame{
	JTextField j1;
	JTextField j2;
	public Z3(){
		setSize(500,380);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}

	private void into() {
		Container panel=getContentPane();
		panel.setLayout(null);
		j1=new JTextField(50);
		j2=new JTextField(50);
		JLabel l1=new JLabel("用户名");
		JLabel l2=new JLabel("用户密码");
		JButton b1=new JButton("确认");
		JButton b2=new JButton("取消");
		l1.setBounds(30, 60, 80, 30);		
		j1.setBounds(110, 60, 180, 30);
		l2.setBounds(30,130,80, 30);
		j2.setBounds(110,130,180,30);
		b1.setBounds(90,180,60,30);
		b2.setBounds(210,180,60,30);		
		panel.add(j1);
		panel.add(j2);
		panel.add(l1);
		panel.add(l2);
		panel.add(b1);
		panel.add(b2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(j1.getText().equals(j2.getText())){
					JOptionPane.showMessageDialog(null,"登陆成功","消息框",JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "账户与密码不匹配","消息框",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j1.setText("");
				j2.setText("");
			}
		});

		
		
	}
	public static void main(String[] args) {
		new Z3();
	}
}
