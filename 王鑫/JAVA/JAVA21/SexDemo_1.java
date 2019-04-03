package Test2019_3_23_z21;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SexDemo_1 extends JFrame{
	public SexDemo_1() {
		
		setSize(600, 400);
		//居中
		setLayout(new FlowLayout());
        setLocationRelativeTo(null);
		//点击右上角关闭按钮，即会结束程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setVisible(true);
	}
	public void init() {
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("男", cbg, true);
		Checkbox cb2 = new Checkbox("女",cbg, false);
		this.add(new JButton("我是一个按钮"));
		this.add(new TextField("我是文本框"));
		this.add(cb1);
		this.add(cb2);
		this.add(new Label("我是一个标签"));
	}
	public static void main(String[] args) {
		new SexDemo_1();
	}
}
