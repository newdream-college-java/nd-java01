package exercise2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * ��.���ƽ���
 * ʹ�ñ߽粼�֣�BorderLayout()�ڽ������ܷ����ĸ���ť���� �� �� ��
 * ʹ�����񲼾֣�GrideLayout(4,3,1,1):�ڽ��������4��3 12����ť
 * @author mo
 *
 */
public class MyJFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyJFrame() {
		this.setTitle("��ҵ2");
		this.setSize(800, 600);
		init();
		this.setVisible(true);
	}
	private void init() {
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new BorderLayout(10, 10));
		JButton j1=new JButton("��");
		JButton j2=new JButton("��");
		JButton j3=new JButton("��");
		JButton j4=new JButton("��");
		JPanel jPanel1=new JPanel();
		jPanel1.setLayout(new GridLayout(4,3,1,1));
		for(int i=0;i<12;i++) {
			JButton j5=new JButton("��ť");
			jPanel1.add(j5);
		}
		jPanel.add(j1,BorderLayout.EAST);
		jPanel.add(j2,BorderLayout.SOUTH);
		jPanel.add(j3,BorderLayout.WEST);
		jPanel.add(j4,BorderLayout.NORTH);
		jPanel.add(jPanel1,BorderLayout.CENTER);
		this.add(jPanel);
	}
	public static void main(String[] args) {
		MyJFrame myJFrame=new MyJFrame();
	}
}
