package ��21��Swing���ֹ������¼���ҵ;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomeWork1 extends JFrame implements ActionListener{
	JTextField jtf1 =new JTextField("�ı���");
	JButton jb=new JButton("��ʾ��Ϣ");
	public HomeWork1(){
		setSize(600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}

	private void init() {
		JPanel jp =new JPanel();
		
		jtf1.setFont(new Font("", 5, 30));
		jtf1.setPreferredSize(new Dimension(270,50));
		jp.add(jtf1);
		
		jb.setFont(new Font("",5,30));
		jb.setSize(100, 50);
		jp.add(jb);
		this.add(jp);
		//�¼�ԴΪjb��һ����jb�ı������ʾ�ı����е�����  �����ı�����lyg
		jb.addActionListener(this);
		
	}
	public static void main(String[] args) {
		HomeWork1 h=new HomeWork1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jtf1.setText("lyg");
	}
}
