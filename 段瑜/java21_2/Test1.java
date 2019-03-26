package job;

import javax.swing.JFrame;

public class Test1 extends JFrame{
	public Test1(){
		setSize(500,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		MyJPane_1 m=new MyJPane_1();
		add(m);
		
	}
	public static void main(String[] args) {
		new Test1();
	}

	
}
