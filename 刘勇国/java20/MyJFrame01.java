package 第20章Swing布局管理器;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame01	extends JFrame {
	//继承：增强一个类（重写，重写，其他方法）
	public MyJFrame01(){
		JFrame jFrame =new JFrame();
		setSize(600,800);
		Container contentPane =jFrame.getContentPane();
		contentPane.setBackground(Color.red);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}
	/*设置面板
	 * */
	private void init(){
		//1.得到默认面板
		JPanel jPanel=(JPanel)getContentPane();
		//2.设置布局（很多种，这里举流式布局）他的特点是从左往右，放满了整行才能换行。从上到下，
		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT);//FlowLayout.LEFT括号里这个，表示按钮居左对齐可以点进这个方法里去看
		jPanel.setLayout(f1);
		
		//2.创建一个按钮
		JButton jButton = new JButton("按钮");
		//3.设置按钮的尺寸jButton.setSize(100,50)这个方法过时了，不能再用这个方法设置大小
		jButton.setPreferredSize(new Dimension(100,50));
		//此时已经设置成功，但是由于没有设置布局的格式，因此整个页面都是这个按钮，无法改变大小
		//3.添加按钮
		jPanel.add(jButton);
	}
	public static void main(String[] args) {
		MyJFrame01 my01 =new MyJFrame01();
	}
}	
