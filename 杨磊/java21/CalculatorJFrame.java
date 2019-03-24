package com.nd.yl.demo1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorJFrame extends JFrame {

	public CalculatorJFrame() {

		setSize(600, 500);

		getContentPane().setBackground(Color.gray);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		init();

		setVisible(true);

	}

	public void init() {

		// �õ�Ĭ�ϵĻ���

		Container contentPane = getContentPane();

		// ����һ�����

		JPanel mb = new JPanel(new BorderLayout());
		// ����Ŀ�Ϊ�ı���
		JTextField wb = new JTextField("");
		// �����ı����������С
		wb.setFont(new Font("", 0, 50));
		// �����ı���Ĵ�С
		wb.setPreferredSize(new Dimension(200, 100));
		// ���ı�����뵽mb���������
		mb.add(wb, BorderLayout.NORTH);
		// ��mb���뵽Ĭ�ϻ�����
		contentPane.add(mb, BorderLayout.NORTH);

		// ����ļ������ֿ�
		JPanel mb2 = new JPanel(new GridLayout(5, 3, 5, 5));
		for (int i = 1; i <= 15; i++) {

			// ȷ��ÿһ�еİ�ťӦ��д��ʲô����

			if (i <= 10) {

				JButton j = new JButton((i - 1) + "");

				mb2.add(j);

			} else if (i == 11) {

				JButton j = new JButton("+");

				mb2.add(j);

			} else if (i == 12) {

				JButton j = new JButton("-");

				mb2.add(j);

			} else if (i == 13) {

				JButton j = new JButton("*");

				mb2.add(j);

			} else if (i == 14) {

				JButton j = new JButton("/");

				mb2.add(j);

			} else if (i == 15) {

				JButton j = new JButton("=");

				mb2.add(j);

			}

		}

		contentPane.add(mb2, BorderLayout.CENTER);

	}

	public static void main(String[] args) {

		CalculatorJFrame good = new CalculatorJFrame();

	}

}