package ��20��Swing���ֹ�����;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame03 extends JFrame{
	public MyJFrame03(){
		//���������ֶ���ʹ�ô�д��ĸ
		setSize(new Dimension(600,800));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intit();
		setVisible(true);
	}

	private void intit() {
		// TODO Auto-generated method stub
		//
		JPanel jPanel =new JPanel();
		//�������񲼾ֹ�����
		GridLayout grid=new GridLayout(5,4,0,0);
		jPanel.setLayout(grid);
		//������ť
		for(int i=1;i<=6;i++){
			JButton j=new JButton(i+"");
			jPanel.add(j);
		}
		this.add(jPanel);
		
	}
	public static void main(String[] args) {
		MyJFrame03 m3=new MyJFrame03();
	}
	
}
