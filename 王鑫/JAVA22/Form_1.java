package Test2019_3_24_z22;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class Form_1 extends JFrame{
    JTextField tf = new JTextField(20);
	public Form_1() {
		setSize(400,200);
		setLayout(new FlowLayout());
        setLocationRelativeTo(null);
		//������Ͻǹرհ�ť�������������
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(tf);
        JButton b = new JButton("��ʾ��Ϣ");
        b.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				tf.setText("���Ե����ť");
			}
		});
        add(b);
        setVisible(true);
	}
	public static void main(String[] args) {
		new Form_1();
	}
}
