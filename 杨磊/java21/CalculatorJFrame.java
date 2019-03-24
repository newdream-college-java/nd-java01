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

		// 得到默认的画板

		Container contentPane = getContentPane();

		// 创建一个面板

		JPanel mb = new JPanel(new BorderLayout());
		// 上面的框为文本框
		JTextField wb = new JTextField("");
		// 设置文本框内字体大小
		wb.setFont(new Font("", 0, 50));
		// 设置文本框的大小
		wb.setPreferredSize(new Dimension(200, 100));
		// 把文本框放入到mb这个画板中
		mb.add(wb, BorderLayout.NORTH);
		// 把mb放入到默认画板中
		contentPane.add(mb, BorderLayout.NORTH);

		// 下面的计算数字框
		JPanel mb2 = new JPanel(new GridLayout(5, 3, 5, 5));
		for (int i = 1; i <= 15; i++) {

			// 确定每一行的按钮应该写入什么内容

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