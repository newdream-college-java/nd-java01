package Test1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Test01 extends JFrame{
	public Test01(){
		//���ڱ�ǩ
		setTitle("Test01");
		//����ߴ�
		setSize(400,500);
		//���ô���رշ�ʽ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���þ���
		setLocationRelativeTo(null);
		init();
		//����ɼ�
		setVisible(true);
	}
	private void init() {
		//���һ������
		Container jl=getContentPane();
		//������岼��
		jl.setLayout(new FlowLayout());
		JButton jb=new JButton("button");
		//���ð�ť�ߴ�
		//jb.setPreferredSize(new Dimension(100,100));
		JTextArea jt=new JTextArea(0,10);
		JRadioButton jr=new JRadioButton("��");
		JRadioButton jr1=new JRadioButton("Ů");
		JLabel j=new JLabel("HelloWorld");
		jl.add(jb);
		jl.add(jt);
		jl.add(jr);
		jl.add(jr1);
		jl.add(j);
	}
	public static void main(String[] args) {
		new Test01();
	}
}
