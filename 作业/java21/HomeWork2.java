package ��21��Swing���ֹ������¼���ҵ;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomeWork2 extends JFrame implements ActionListener{
	JTextField jtf1=new JTextField("������뾶");
	JTextField jtf2 =new JTextField("������");
	public HomeWork2(){
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}
	private void init() {
		JLabel j1 =new JLabel("�뾶");
		j1.setFont(new Font("",5,30));
		j1.setSize(150, 50);
		
		jtf1.setFont(new Font("", 5, 30));
		jtf1.setSize(150, 50);
		JButton jb=new JButton("����");
		jb.setFont(new Font("", 5, 80));
		jb.setSize(300, 50);
		JLabel j2=new JLabel("Բ���");
		j2.setFont(new Font("", 5,30));
		j2.setSize(150, 50);
		
		jtf2.setFont(new Font("", 5,30));
		jtf2.setSize(150, 50);
		JPanel jp =new JPanel();
		jp.add(j1);
		jp.add(jtf1);
		jp.add(jb);
		jp.add(j2);
		jp.add(jtf2);
		this.add(jp);
		jb.addActionListener(this);
		
	}
	public static void main(String[] args) {
		HomeWork2 h=new HomeWork2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double a=0;
		a = Double.parseDouble(jtf1.getText());
		double s= a*a*3.14;
		jtf2.setText(s+"");
	}

}
