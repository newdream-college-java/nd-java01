package ��ҵ;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Test4 extends JFrame{
	public Test4(){
		setSize(new Dimension(600,800));
		setLocationRelativeTo(null);
		//�ܽ᣺���������ֶ���ʹ�ô�д��ĸ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init(){
		Container panel=this.getContentPane();
		panel.setLayout(null);
		JPanel jPanel=new JPanel();
		Label jf=new Label("ѧ��:");
		jf.setFont(new Font("����",5,20));
		JTextField jf1=new JTextField("");
		jf1.setFont(new Font("����",10,20));
		jf.setBounds(50,30,70,30);
		jf1.setBounds(120,30,150,30);
		this.add(jf);
		this.add(jf1);
		Label jf2=new Label("����:");
		jf2.setFont(new Font("����",5,20));
		JTextField jf3=new JTextField("");
		jf3.setFont(new Font("����",10,20));
		jf2.setBounds(300,30,70,30);
		jf3.setBounds(370,30,150,30);
		this.add(jf2);
		this.add(jf3);
		Label lSex=new Label("�Ա�");
		lSex.setFont(new Font("����", 5, 20));
		lSex.setBounds(550, 30, 50, 30);
		JRadioButton jrb1=new JRadioButton("��");
		JRadioButton jrb2=new JRadioButton("Ů");
		jrb1.setSelected(true);
		jrb1.setBounds(630, 30, 60, 30);
		jrb2.setBounds(700, 30, 50, 30);
		this.add(lSex);
		this.add(jrb1);
		this.add(jrb2);
		Label age=new Label("���䣺");
		JTextField jf4=new JTextField("");
		age.setFont(new Font("����",5,20));
		age.setBounds(100,90,70,30);
		jf4.setFont(new Font("����",10,20));
		jf4.setBounds(150,90,150,30);
		this.add(age);
		this.add(jf4);
		Label zz=new Label("סַ��");
		zz.setFont(new Font("����",5,20));
		zz.setBounds(350,90,70,30);
		JTextField jf5=new JTextField("");
		jf5.setFont(new Font("����",10,20));
		jf5.setBounds(420,90,200,30);
		this.add(zz);
		this.add(jf5);
		JButton add=new JButton("���");
		add.setFont(new Font("����",5,20));
		add.setBounds(100,180,80,30);
		this.add(add);
		JButton delete=new JButton("ɾ��");
		delete.setFont(new Font("����",5,20));
		delete.setBounds(260,180,80,30);
		this.add(delete);
		JButton xg=new JButton("�޸�");
		xg.setFont(new Font("����",5,20));
		xg.setBounds(420,180,80,30);
		this.add(xg);
		JButton cx=new JButton("��ѯ");
		cx.setFont(new Font("����",5,20));
		cx.setBounds(580,180,80,30);
		this.add(cx);
		JTextField jf6=new JTextField("");
		jf6.setFont(new Font("����",10,20));
		jf6.setBounds(60,250,650,300);
		this.add(jf6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Test4 j=new Test4();
	}

}
