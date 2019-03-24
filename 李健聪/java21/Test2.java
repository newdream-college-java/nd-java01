package 作业;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 extends JFrame{
	public Test2(){
		setSize(600, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}

	private void init() {
		JPanel jp = new JPanel();
		// 为什么不能用setLayout(new BorderLayout())?
		BorderLayout bl = new BorderLayout();
		jp.setLayout(bl);

		JButton jb = new JButton("东");
		JButton jb1 = new JButton("南");
		JButton jb2 = new JButton("西");
		JButton jb3 = new JButton("北");

		jb.setPreferredSize(new Dimension(100, 100));
		jb1.setPreferredSize(new Dimension(100, 100));
		jb2.setPreferredSize(new Dimension(100, 100));
		jb3.setPreferredSize(new Dimension(100, 100));

		jp.add(jb, BorderLayout.EAST);
		jp.add(jb1, BorderLayout.SOUTH);
		jp.add(jb2, BorderLayout.WEST);
		jp.add(jb3, BorderLayout.NORTH);

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		GridLayout gl = new GridLayout(3, 3, 1, 1);

		jp1.setLayout(gl);
		jp2.setLayout(gl);
		jp3.setLayout(gl);
		jp4.setLayout(gl);

		for (int i = 0; i < 3; i++) {
			JButton jbt1 = new JButton();
			jp1.add(jbt1);

		}
		for (int i = 0; i < 3; i++) {
			JButton jbt2 = new JButton();
			jp2.add(jbt2);

		}
		for (int i = 0; i < 3; i++) {
			JButton jbt3 = new JButton();
			jp3.add(jbt3);

		}
		for (int i = 0; i < 3; i++) {
			JButton jbt4 = new JButton();
			jp4.add(jbt4);

		}
		// JButton jbt1 = new JButton();

		// jp1.add(jbt1);
		jb.add(jp1);
		jb1.add(jp2);
		jb2.add(jp3);
		jb3.add(jp4);

		this.add(jp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test2();
	}

}
