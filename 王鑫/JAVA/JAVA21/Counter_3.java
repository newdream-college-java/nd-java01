package Test2019_3_23_z21;

import java.awt.*;
import javax.swing.*;
import javax.naming.InitialContext;

public class Counter_3 extends JFrame{
	public Counter_3() {
		setSize(300,250);
		setLayout(new FlowLayout(FlowLayout.LEFT,40,5));
        setLocationRelativeTo(null);
		//������Ͻǹرհ�ť�������������
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel p1 = new Panel();	
		p1.add(new TextField(25));
		add(p1,BorderLayout.NORTH);
		init();
        setVisible(true);
	}
	public void init(){
		String[] arr ={"0","1","2","3","4","5","6","7","8","9","+","- ","��","/ ","="};
		for (int i = 0; i < arr.length; i++) {
			add(new JButton(arr[i]));
		}
	}
	public static void main(String[] args) {
		new Counter_3();
	}
}
