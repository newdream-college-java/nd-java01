package ��21��Swing���ֹ�����;

import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyJFrameHome3 extends JFrame{
	public MyJFrameHome3(){
		setSize(new Dimension(800,550));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intit();
		setVisible(true);
	}

	private void intit() {
		Container panel = this.getContentPane();
		panel.setLayout(null);
		Label labNo = new Label("ѧ ��"); 
		labNo.setFont(new Font("����", 5, 20));
		JTextField no =new JTextField();
		no.setFont(new Font("����", 5, 20));
		labNo.setBounds(50,30,70,30);
		no.setBounds(120, 30,150,30);
		Label lname =new Label("����");
		lname.setFont(new Font("����", 5, 20));
		lname.setBounds(300, 30,70,30);
		JTextField tname =new JTextField();
		tname.setFont(new Font("����", 5, 20));
		tname.setBounds(370, 30,150,30);
		Label lSex=new Label("�Ա�");
		lSex.setFont(new Font("����", 5, 20));
		lSex.setBounds(550, 30, 50, 30);
		JRadioButton jrb1=new JRadioButton("��");
		JRadioButton jrb2=new JRadioButton("Ů");
		jrb1.setSelected(true);
		jrb1.setBounds(630, 30, 60, 30);
		jrb2.setBounds(700, 30, 50, 30);
		Label labAge =new Label("�� ��");
		labAge.setBounds(140, 90, 70, 30);
		labAge.setFont(new Font("����", 5, 20));
		JTextField tAge =new JTextField();
		tAge.setFont(new Font("����", 5, 20));
		tAge.setBounds(210, 90, 150, 30);
		Label labAdress =new Label("סַ");
		labAdress.setFont(new Font("����", 5, 20));
		labAdress.setBounds(400, 90, 40, 30);
		JTextField tAdress =new JTextField();
		tAdress.setFont(new Font("����", 5, 20));
		tAdress.setBounds(480, 90, 230, 30);
		Button add=new Button("�� ��");
		add.setBounds(140, 180, 80, 30);
		add.setFont(new Font("�� ��", 5, 20));
		Button delete=new Button("ɾ ��");
		delete.setFont(new Font("�� ��", 5, 20));
		delete.setBounds(280, 180, 80, 30);
		Button revise=new Button("�� ��");
		revise.setFont(new Font("�� ��", 5, 20));
		revise.setBounds(420, 180, 80, 30);
		Button seek=new Button("�� ��");
		seek.setFont(new Font("�� ��", 5, 20));
		seek.setBounds(560, 180, 80, 30);
		JTextField jt0=new JTextField();
		jt0.setFont(new Font("�� ��", 5, 20));
		jt0.setBounds(50, 250, 700, 200);
		this.add(labNo);
		this.add(no);
		this.add(lname);
		this.add(tname);
		this.add(lSex);
		this.add(jrb1);
		this.add(jrb2);
		this.add(labAge);
		this.add(tAge);
		this.add(labAdress);
		this.add(tAdress);
		this.add(delete);
		this.add(revise);
		this.add(seek);
		this.add(add);
		this.add(jt0);
		
	}
	public static void main(String[] args) {
		MyJFrameHome3 my3=new MyJFrameHome3();
	}
}
