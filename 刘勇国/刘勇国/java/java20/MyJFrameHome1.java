package ��20��Swing���ֹ�����;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class MyJFrameHome1 extends JFrame{
	public MyJFrameHome1(){
		setSize(new Dimension(400,300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intit();
		setVisible(true);
	}

	private void intit() {
		//����һ�������
		Container contentPane =getContentPane();
		
		//�ı���
		JPanel jp=new JPanel();
		JTextField jtf1=new JTextField("����������");
		jtf1.setFont(new Font("", 5, 60));
		jtf1.setPreferredSize(new Dimension(400,100));

		jp.add(jtf1);
		contentPane.add(jp,BorderLayout.NORTH);
		
		//��ѡ��
		JPanel jp2=new JPanel();
		jp2.setLayout(new GridLayout(1,2));
		jp2.setBorder(BorderFactory.createTitledBorder("ѡ������Ա�"));
		JRadioButton jb1=new JRadioButton("��");
		JRadioButton jb2=new JRadioButton("Ů");
		jp2.add(jb1);
		jp2.add(jb2);
		jb1.setSelected(true);
		contentPane.add(jp2,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		MyJFrameHome1 my=new MyJFrameHome1();
	}
}
