package ��20��Swing���ֹ�����;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame01	extends JFrame {
	//�̳У���ǿһ���ࣨ��д����д������������
	public MyJFrame01(){
		JFrame jFrame =new JFrame();
		setSize(600,800);
		Container contentPane =jFrame.getContentPane();
		contentPane.setBackground(Color.red);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
	/*�������
	 * */
	private void init(){
		//1.�õ�Ĭ�����
		JPanel jPanel=(JPanel)getContentPane();
		//2.���ò��֣��ܶ��֣��������ʽ���֣������ص��Ǵ������ң����������в��ܻ��С����ϵ��£�
		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);//FlowLayout.LEFT�������������ʾ��ť���������Ե�����������ȥ��
		jPanel.setLayout(f1);
		
		//2.����һ����ť
		JButton jButton = new JButton("��ť");
		//3.���ð�ť�ĳߴ�jButton.setSize(100,50)���������ʱ�ˣ�������������������ô�С
		jButton.setPreferredSize(new Dimension(100,50));
		//��ʱ�Ѿ����óɹ�����������û�����ò��ֵĸ�ʽ���������ҳ�涼�������ť���޷��ı��С
		//3.��Ӱ�ť
		jPanel.add(jButton);
	}
	public static void main(String[] args) {
		MyJFrame01 my01 =new MyJFrame01();
	}
}	
