package 作业;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test4 extends JFrame{	
	public Test4(){
		setSize(600,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		Container panel=getContentPane();
		panel.setLayout(null);
		JTextField k=new JTextField();
		k.setBounds(30,60,80,30);
		final JLabel w=new JLabel();
		w.setBounds(110, 120,180,30);
		panel.add(k);
		panel.add(w);
		k.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				w.setText("你按下了"+KeyEvent.getKeyText(e.getKeyCode())+"键");
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test4();
	}
	
	

}
