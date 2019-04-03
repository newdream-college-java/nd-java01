package Test2019_3_23_z21;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Students_4 extends JFrame{
	public Students_4() {
		setSize(600,300);
		setLayout(new FlowLayout());
        setLocationRelativeTo(null);
		//点击右上角关闭按钮，即会结束程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setVisible(true);		
	}
	public void init(){
		add(new Label("学号"));
		add(new TextField(20));
		add(new Label("姓名"));
		add(new TextField(20));
		add(new Label("性别"));
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("男     ",cbg,true);
		Checkbox cb2 = new Checkbox("女",cbg,false);
		add(cb1);
		add(cb2);
		add(new Label("年龄"));
		add(new TextField(28));
		add(new Label("住址"));
		add(new TextField(28));
		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT, 60, 5));		
		p2.add(new JButton("添加"));
		p2.add(new JButton("删除"));
		p2.add(new JButton("修改"));
		p2.add(new JButton("查询"));
		add(p2);
		add(new TextArea(8,70));
	}
	public static void main(String[] args) {
		new Students_4();
	}
}
