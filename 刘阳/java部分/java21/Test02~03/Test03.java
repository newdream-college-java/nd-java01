import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test03	extends JFrame {
	public Test03(){
		setSize(new Dimension(600,800));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init() {
		JPanel mb =new JPanel();
		GridLayout bj=new GridLayout(4,3,0,0);
		mb.setLayout(bj);
		//´´½¨°´Å¥
		for(int i=1;i<13;i++){
			JButton j=new JButton(i+"");
			mb.add(j);
		}
		this.add(mb);
	}
	public static void main(String[] args) {
		Test03 test03 =new Test03();
	
	}
}