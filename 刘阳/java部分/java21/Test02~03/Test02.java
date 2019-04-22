import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test02	extends JFrame {
	public Test02(){
		//常量的名字都是使用大写字母
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
		JButton kj=new JButton("东");
		JButton kj1=new JButton("西");
		JButton kj2=new JButton("南");
		JButton kj3=new JButton("北");
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