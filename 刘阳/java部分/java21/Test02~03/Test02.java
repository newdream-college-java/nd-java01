import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test02	extends JFrame {
	public Test02(){
		//���������ֶ���ʹ�ô�д��ĸ
		setSize(new Dimension(600,800));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init() {
		JPanel mb =new JPanel();
		BorderLayout bj=new BorderLayout();
		mb.setLayout(bj);
		JButton kj=new JButton("��");
		JButton kj1=new JButton("��");
		JButton kj2=new JButton("��");
		JButton kj3=new JButton("��");
		mb.add(kj,BorderLayout.EAST);
		mb.add(kj1,BorderLayout.WEST);
		mb.add(kj2,BorderLayout.SOUTH);
		mb.add(kj3,BorderLayout.NORTH);
		this.add(mb);
	}
	public static void main(String[] args) {
		Test02 test02 =new Test02();
	
	}
}