package Test4; 

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Test04 extends JFrame{
	public Test04(){
		setTitle("Test04");
		setSize(450,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init() {
		Container jf=getContentPane();
		jf.setLayout(null);
		JLabel jl=new JLabel("学号");
		jl.setBounds(30, 10,30, 20);
		JTextField jt=new JTextField("",10);
		jt.setBounds(60,10,60,20);
		JLabel jl1=new JLabel("姓名");
		jl1.setBounds(150,10,30,20);
		JTextField jt1=new JTextField("",10);
		jt1.setBounds(180, 10, 60, 20);
		JLabel jl2=new JLabel("性别");
		jl2.setBounds(270, 10, 30, 20);
		JRadioButton jr=new JRadioButton("男");
		jr.setBounds(300, 10, 40, 20);
		JRadioButton jr1=new JRadioButton("女");
		jr1.setBounds(340, 10, 40, 20);
		JLabel jl3=new JLabel("年龄");
		jl3.setBounds(70, 60, 30, 20);
		JTextField jt3=new JTextField("",10);
		jt3.setBounds(100, 60, 60, 20);
		JLabel jl4=new JLabel("住址");
		jl4.setBounds(190, 60, 30, 20);
		JTextField jt4=new JTextField("",15);
		jt4.setBounds(220,60, 90, 20);
		JButton jb=new JButton("添加");
		jb.setBounds(70, 110, 60, 25);
		JButton jb1=new JButton("删除");
		jb1.setBounds(140, 110, 60, 25);
		JButton jb2=new JButton("修改");
		jb2.setBounds(210, 110, 60, 25);
		JButton jb3=new JButton("查询");
		jb3.setBounds(280, 110, 60, 25);
		JTextField jt5=new JTextField();
		jt5.setBounds(30, 165, 340, 135);
		jf.add(jl);
		jf.add(jt);
		jf.add(jl1);
		jf.add(jt1);
		jf.add(jl2);
		jf.add(jr);
		jf.add(jr1);
		jf.add(jl3);
		jf.add(jt3);
		jf.add(jl4);
		jf.add(jt4);
		jf.add(jb);
		jf.add(jb1);
		jf.add(jb2);
		jf.add(jb3);
		jf.add(jt5);
	}
	public static void main(String[] args) {
		new Test04();
	}
}
