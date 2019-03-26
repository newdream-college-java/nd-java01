package Test1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Test01 extends JFrame{
	public Test01(){
		//窗口标签
		setTitle("Test01");
		//窗体尺寸
		setSize(400,500);
		//设置窗体关闭方式
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置居中
		setLocationRelativeTo(null);
		init();
		//窗体可见
		setVisible(true);
	}
	private void init() {
		//获得一个容器
		Container jl=getContentPane();
		//设置面板布局
		jl.setLayout(new FlowLayout());
		JButton jb=new JButton("button");
		//设置按钮尺寸
		//jb.setPreferredSize(new Dimension(100,100));
		JTextArea jt=new JTextArea(0,10);
		JRadioButton jr=new JRadioButton("男");
		JRadioButton jr1=new JRadioButton("女");
		JLabel j=new JLabel("HelloWorld");
		jl.add(jb);
		jl.add(jt);
		jl.add(jr);
		jl.add(jr1);
		jl.add(j);
	}
	public static void main(String[] args) {
		new Test01();
	}
}
