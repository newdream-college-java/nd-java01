package ��21��Swing���ֹ�����;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculate extends JFrame {
	public Calculate(){
		
		setSize(new Dimension(400,500));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intit();
		setVisible(true);
	}

	private void intit() {
		//����һ�������
		Container contentPane =getContentPane();
		//����һ������
		JPanel jP1 =new JPanel();		
		//�����������Ĳ���Ϊ�߿򲼾�
		BorderLayout b1=new BorderLayout();		
		jP1.setLayout(b1);
		//����Ŀ�Ϊ�ı���
		JTextField jtf1=new JTextField("����������");
		//�����ı���Ĵ�С
		jtf1.setFont(new Font("", 5, 60));
		jtf1.setPreferredSize(new Dimension(400,100));
		//�����ı����������С????
		
		//���ı�����뵽jp1���������
		jP1.add(jtf1,BorderLayout.NORTH);
		//�ѻ�����뵽�����
		contentPane.add(jP1,BorderLayout.NORTH);
		
		
		//����ļ������ֿ�
		JPanel jP2 =new JPanel();
		GridLayout g1 =new GridLayout(4,4,5,5);
		jP2.setLayout(g1);
		for(int i=1;i<=16;i++){
			if(i==4){
				JButton j=new JButton("+");
				jP2.add(j);
				
			}else if(i==8){
				JButton j=new JButton("-");
				jP2.add(j);
				
			}else if(i==12){
				JButton j=new JButton("*");
				jP2.add(j);
				
			}else if(i<=3){
				JButton j=new JButton(i+"");
				jP2.add(j);
			}else if(i<=7&&i>=5){
				JButton j=new JButton((i-1)+"");
				jP2.add(j);
			}else if(i<=11&&i>=9){
				JButton j=new JButton((i-2)+"");
				jP2.add(j);
			}else if(i==13){
				JButton j=new JButton(0+"");
				jP2.add(j);
			}else if(i==14){
				JButton j=new JButton(".");
				jP2.add(j);
			}else if(i==15){
				JButton j=new JButton("=");
				jP2.add(j);
			}else{
				JButton j=new JButton("/");
				jP2.add(j);
			}
		}
		contentPane.add(jP2,BorderLayout.CENTER);
		
		//������������ʾ0  .   =�����ַ�
//		JPanel jP3=new JPanel();
//		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);
		
//		jP3.setLayout(f1);
//		JButton j1=new JButton(0+"");
//		j1.setPreferredSize(new Dimension(160,100));
//		jP3.add(j1);
//		JButton j2=new JButton(".");
//		j2.setPreferredSize(new Dimension(100,100));
//		jP3.add(j2);
//		JButton j3=new JButton("=");
//		j3.setPreferredSize(new Dimension(100,100));
//		jP3.add(j3);
//		contentPane.add(jP3,BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		Calculate ca1=new Calculate();
	}
	
}
