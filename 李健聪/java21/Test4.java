package ��ҵ;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Test4 extends JFrame {
	public Test4(){
		setLocationRelativeTo(null);
		Container c=getContentPane();
		c.setLayout(null);
		
		
		JLabel jl=new JLabel();
		jl.setText("ѧ��");
		jl.setBounds(50, 10, 50, 30);
		JTextField jt=new JTextField();
		jt.setBounds(100, 15, 100, 20);
		c.add(jl);
		c.add(jt);//ѧ������ok
		
		JLabel jl2=new JLabel("����");
		jl2.setBounds(220, 10, 50, 30);
		JTextField jt2=new JTextField();
		jt2.setBounds(250, 15, 100, 20);
		c.add(jl2);
		c.add(jt2);//����ok
		
		JLabel jl3=new JLabel("�Ա�");
		jl3.setBounds(360, 10, 50, 30);
		c.add(jl3);//����ok
		
		JRadioButton jr1=new JRadioButton("��");
		jr1.setBounds(400, 1, 50, 50);
		c.add(jr1);
		JRadioButton jr2=new JRadioButton("Ů");
		jr2.setBounds(470, 1, 50, 50);
		c.add(jr2);
		
		JLabel jl4=new JLabel("����");
		jl4.setBounds(130, 50, 50, 30);
		c.add(jl4);
		JTextField jt3=new JTextField();
		jt3.setBounds(180, 55, 100, 20);
		c.add(jt3);//����ok
		
		JLabel jl5=new JLabel("סַ");
		jl5.setBounds(300, 50, 50, 30);
		c.add(jl5);
		JTextField jt4=new JTextField();
		jt4.setBounds(360, 55, 160, 20);
		c.add(jt4);
		
		JButton jb1=new JButton("���");
		jb1.setBounds(70, 140, 80, 30);
		c.add(jb1);
		JButton jb2=new JButton("ɾ��");
		jb2.setBounds(180, 140, 80, 30);
		c.add(jb2);
		JButton jb3=new JButton("�޸�");
		jb3.setBounds(290, 140, 80, 30);
		c.add(jb3);
		JButton jb4=new JButton("��ѯ");
		jb4.setBounds(400, 140, 80, 30);
		c.add(jb4);
		
		JTextField jt5=new JTextField();
		jt5.setBounds(30, 200, 480, 130);
		c.add(jt5);
		
		setSize(550,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test4();
	}

}
