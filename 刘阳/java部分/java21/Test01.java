import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Test01 extends JFrame{
	public Test01(){
	setSize(600,800);
	getContentPane().setBackground(Color.gray);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	init();
	setVisible(true);
	}
	public void init(){
		//�õ�������mb
		JPanel mb=(JPanel)getContentPane();
		//������ʽ���ֿ���fl
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		//����������
		fl.setHgap(50);
		//������岼��
		mb.setLayout(fl);
		//����һ����ť
		JButton button=new JButton("Button");
		//���ð�ť�ߴ�
		button.setPreferredSize(new Dimension(100,40));
		//���İ�ť��ɫ
		button.setForeground(Color.red);
		//���������簴ťbutton
		mb.add(button);
		//����һ���ı���
		JTextField wb=new JTextField();
		//�����ı���
		wb.setPreferredSize(new Dimension(100,40));
		//�����ı���
		mb.add(wb);
		//��ӵ�ѡ��ť
		JRadioButton dx1=new JRadioButton("��");
		JRadioButton dx2=new JRadioButton("Ů");
		mb.add(dx1);
		mb.add(dx2);
		//��ӱ�ǩ
		JLabel bq=new JLabel("HelloWorld");
		bq.setForeground(Color.blue);
		//�������
		mb.add(bq);
	}
	
	
	public static void main(String[] args) {
		Test01 tx=new Test01();
	}
}
