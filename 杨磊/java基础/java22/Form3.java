package com.nd.yl.demo1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form3 extends JFrame {
	public Form3() {
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		// ���ÿɼ���
		this.setVisible(true);
	}

	private void init() {
		JPanel jp = new JPanel();
		jp.setLayout(null);

		JLabel jl1 = new JLabel("�û���");
		jl1.setBounds(50, 50, 100, 30);
		jp.add(jl1);

		JTextField jt1 = new JTextField();
		jt1.setBounds(150, 50, 200, 30);
		jp.add(jt1);

		JLabel jl2 = new JLabel("�û�����");
		jl2.setBounds(50, 100, 100, 30);
		jp.add(jl2);

		JTextField jt2 = new JTextField();
		jt2.setBounds(150, 100, 200, 30);
		jp.add(jt2);

		JButton jb1 = new JButton("ȷ��");
		jb1.setBounds(100, 150, 80, 30);
		jp.add(jb1);

		JButton jb2 = new JButton("ȡ��");
		jb2.setBounds(280, 150, 80, 30);
		jp.add(jb2);

		this.add(jp);
		jb1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (jt1.getText().equals("admin") && jt2.getText().equals("123456")) {
					JOptionPane.showConfirmDialog(null, "��¼�ɹ�", "��Ϣ��", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showConfirmDialog(null, "��¼ʧ��", "��Ϣ��", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
	}

	public static void main(String[] args) {
		new Form3();

	}

}
