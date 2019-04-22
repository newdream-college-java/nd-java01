package 第20章Swing布局管理器;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class MyJFrameHome1 extends JFrame{
	public MyJFrameHome1(){
		setSize(new Dimension(400,300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intit();
		setVisible(true);
	}

	private void intit() {
		//创建一个主面板
		Container contentPane =getContentPane();
		
		//文本框
		JPanel jp=new JPanel();
		JTextField jtf1=new JTextField("请输入姓名");
		jtf1.setFont(new Font("", 5, 60));
		jtf1.setPreferredSize(new Dimension(400,100));

		jp.add(jtf1);
		contentPane.add(jp,BorderLayout.NORTH);
		
		//单选框
		JPanel jp2=new JPanel();
		jp2.setLayout(new GridLayout(1,2));
		jp2.setBorder(BorderFactory.createTitledBorder("选择你的性别"));
		JRadioButton jb1=new JRadioButton("男");
		JRadioButton jb2=new JRadioButton("女");
		jp2.add(jb1);
		jp2.add(jb2);
		jb1.setSelected(true);
		contentPane.add(jp2,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		MyJFrameHome1 my=new MyJFrameHome1();
	}
}
