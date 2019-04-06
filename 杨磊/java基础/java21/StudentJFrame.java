package com.nd.yl.demo1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class StudentJFrame extends JFrame {

	public StudentJFrame() {
		setSize(600, 450);
		getContentPane().setBackground(Color.gray);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();

		setVisible(true);
	}

	private void init() {
		JPanel panel = new JPanel();
		panel.setLayout(null);

		Label stuno = new Label("学 号");
		stuno.setFont(new Font("", 5, 15));
		stuno.setBounds(20, 30, 60, 30);
		panel.add(stuno);

		JTextField wb = new JTextField();
		wb.setFont(new Font("", 5, 15));
		wb.setBounds(85, 30, 100, 30);
		panel.add(wb);

		Label name = new Label("姓名");
		name.setFont(new Font("", 5, 15));
		name.setBounds(200, 30, 60, 30);
		panel.add(name);

		JTextField wb1 = new JTextField();
		wb1.setFont(new Font("", 5, 15));
		wb1.setBounds(265, 30, 100, 30);
		panel.add(wb1);

		Label sex = new Label("性别");
		sex.setFont(new Font("", 5, 15));
		sex.setBounds(367, 30, 50, 30);
		panel.add(sex);

		JRadioButton dx = new JRadioButton("男");
		JRadioButton dx1 = new JRadioButton("女");
		dx.setSelected(true);
		dx.setBounds(420, 30, 60, 30);
		dx1.setBounds(480, 30, 50, 30);
		ButtonGroup bt = new ButtonGroup();
		bt.add(dx);
		bt.add(dx1);
		panel.add(dx);
		panel.add(dx1);

		Label age = new Label("年 龄");
		age.setBounds(20, 90, 60, 30);
		age.setFont(new Font("", 5, 15));
		panel.add(age);

		JTextField wb2 = new JTextField();
		wb2.setFont(new Font("", 5, 15));
		wb2.setBounds(85, 90, 100, 30);
		panel.add(wb2);

		Label adress = new Label("住址");
		adress.setFont(new Font("", 5, 15));
		adress.setBounds(200, 90, 40, 30);
		panel.add(adress);

		JTextField tAdress = new JTextField();
		tAdress.setFont(new Font("", 5, 15));
		tAdress.setBounds(265, 90, 250, 30);
		panel.add(tAdress);

		Button add = new Button("添 加");
		add.setBounds(100, 180, 80, 30);
		add.setFont(new Font("", 5, 15));
		panel.add(add);

		Button delete = new Button("删 除");
		delete.setFont(new Font("", 5, 15));
		delete.setBounds(200, 180, 80, 30);
		panel.add(delete);

		Button revise = new Button("修 改");
		revise.setFont(new Font("", 5, 15));
		revise.setBounds(300, 180, 80, 30);
		panel.add(revise);

		Button find = new Button("查 询");
		find.setFont(new Font("", 5, 15));
		find.setBounds(400, 180, 80, 30);
		panel.add(find);

		JTextField wb5 = new JTextField();
		wb5.setFont(new Font("", 5, 15));
		wb5.setBounds(50, 250, 480, 100);
		panel.add(wb5);

		this.add(panel);
	}

	public static void main(String[] args) {

		StudentJFrame a = new StudentJFrame();

	}

}