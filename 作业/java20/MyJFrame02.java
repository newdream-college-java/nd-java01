package ��20��Swing���ֹ�����;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame02	extends JFrame {
	public MyJFrame02(){
		//���������ֶ���ʹ�ô�д��ĸ
		setSize(new Dimension(600,800));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intit();
		setVisible(true);
	}
	//�߿򲼾ֹ�����

	private void intit() {
		// TODO Auto-generated method stub
		
		//1.�����µ����   Ҳ����ֱ��ʹ���������ϵ�Ĭ�����
		JPanel jPanel =new JPanel();
		//2.���ò��ֹ�����
		BorderLayout b1=new BorderLayout();
		jPanel.setLayout(b1);
		//���ؼ��ŵ����
		JButton jb1=new JButton("�ϵ�");
		JButton jb2=new JButton("��ؤ");
		JButton jb3=new JButton("��а");
		JButton jb4=new JButton("����");
		JButton jb5=new JButton("�в�ͨ");
		JButton jb6=new JButton();
		JButton jb7=new JButton();
		//�ѿؼ��ŵ������
		jPanel.add(jb1,BorderLayout.SOUTH);
		
		//�ѻ���ӵ������
		this.add(jPanel);
		
	}
	public static void main(String[] args) {
		MyJFrame02 myJFrame02 =new MyJFrame02();
	
	}
}
