package Test2019_3_23_z21;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GridLayoutDemo_2 extends JFrame{
	public GridLayoutDemo_2() {
		setSize(400, 300);
		setLayout(new GridLayout(4,3,1,1));
        setLocationRelativeTo(null);
		//点击右上角关闭按钮，即会结束程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
		setVisible(true);
	}
	public void init() {
		for (int i = 0; i < 12; i++) {
			add(new Button((i+1)+""));
		}
	}
	public static void main(String[] args) {
		new GridLayoutDemo_2();
	}
}
