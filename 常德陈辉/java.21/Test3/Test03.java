package Test3;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test03 extends JFrame{

	public Test03(){
		setTitle("Test03");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init() {
		Container pl=getContentPane();
		setLayout(new GridLayout(2,1,2,2));
		JTextField jt=new JTextField();
		JPanel jp=new JPanel(new GridLayout(5,3,2,2));
		for (int i = 0; i < 10; i++) {
			jp.add(new JButton(""+i));
		}
		jp.add(new JButton("+"));
		jp.add(new JButton("-"));
		jp.add(new JButton("x"));
		jp.add(new JButton("/"));
		jp.add(new JButton("="));
		pl.add(jt);
		pl.add(jp);
	}
	public static void main(String[] args) {
		new Test03();
	}

}
