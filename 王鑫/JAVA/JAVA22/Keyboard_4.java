package Test2019_3_24_z22;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Keyboard_4 extends JFrame{
	JTextField jtf = new JTextField(20);
	JLabel jl = new JLabel("��ʾ��ť����");
	JLabel jl2 = new JLabel();
	public Keyboard_4() {
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		//���ô��������
//		setUndecorated(true);
		setVisible(true);
	}
	public void init() {
		jtf.setBounds(20, 20, 100, 20);
		jl.setBounds(50, 80, 100, 20);
		jl2.setBounds(200, 100, 100, 20);
		
		jtf.addKeyListener(new KeyAdapter() {
			 public void keyPressed(KeyEvent e) {
				 jl2.setText("�㰴����"+KeyEvent.getKeyText(e.getKeyCode())+"��");
			 }
		});
		add(jtf);
		add(jl);
		add(jl2);
	}
	public static void main(String[] args) {
		new Keyboard_4();
	}
}
