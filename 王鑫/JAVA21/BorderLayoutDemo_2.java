package Test2019_3_23_z21;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;
import javax.xml.transform.Source;

public class BorderLayoutDemo_2 extends JFrame{
	public BorderLayoutDemo_2() {
		setSize(200,200);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		init();
		setVisible(true);
	}
	public void init() {
		add(new Button("��"),BorderLayout.EAST);
		add(new Button("��"),BorderLayout.SOUTH);
		add(new Button("��"),BorderLayout.WEST);
		add(new Button("��"),BorderLayout.NORTH);
		
	}
	public static void main(String[] args) {
		new BorderLayoutDemo_2();
	}
}
