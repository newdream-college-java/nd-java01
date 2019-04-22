import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Test01 extends JFrame{
	public Test01(){
	setSize(600,800);
	getContentPane().setBackground(Color.gray);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	init();
	setVisible(true);
	}
	public void init(){
		//得到面板对象mb
		JPanel mb=(JPanel)getContentPane();
		//导入流式布局靠左fl
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		//设置组件间距
		fl.setHgap(50);
		//设置面板布局
		mb.setLayout(fl);
		//创建一个按钮
		JButton button=new JButton("Button");
		//设置按钮尺寸
		button.setPreferredSize(new Dimension(100,40));
		//更改按钮颜色
		button.setForeground(Color.red);
		//面板里面假如按钮button
		mb.add(button);
		//创建一个文本框；
		JTextField wb=new JTextField();
		//设置文本框
		wb.setPreferredSize(new Dimension(100,40));
		//加入文本框
		mb.add(wb);
		//添加单选按钮
		JRadioButton dx1=new JRadioButton("男");
		JRadioButton dx2=new JRadioButton("女");
		mb.add(dx1);
		mb.add(dx2);
		//添加标签
		JLabel bq=new JLabel("HelloWorld");
		bq.setForeground(Color.blue);
		//加入面板
		mb.add(bq);
	}
	
	
	public static void main(String[] args) {
		Test01 tx=new Test01();
	}
}
