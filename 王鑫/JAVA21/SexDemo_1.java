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
		//����
		setLayout(new FlowLayout());
        setLocationRelativeTo(null);
		//������Ͻǹرհ�ť�������������
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setVisible(true);
	}
	public void init() {
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("��", cbg, true);
		Checkbox cb2 = new Checkbox("Ů",cbg, false);
		this.add(new JButton("����һ����ť"));
		this.add(new TextField("�����ı���"));
		this.add(cb1);
		this.add(cb2);
		this.add(new Label("����һ����ǩ"));
	}
	public static void main(String[] args) {
		new SexDemo_1();
	}
}
