package 第20章Swing布局管理器;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame02	extends JFrame {
	public MyJFrame02(){
		//常量的名字都是使用大写字母
		setSize(new Dimension(600,800));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intit();
		setVisible(true);
	}
	//边框布局管理器

	private void intit() {
		// TODO Auto-generated method stub
		
		//1.创建新的面板   也可以直接使用这个框架上的默认面板
		JPanel jPanel =new JPanel();
		//2.设置布局管理器
		BorderLayout b1=new BorderLayout();
		jPanel.setLayout(b1);
		//将控件放到面板
		JButton jb1=new JButton("南帝");
		JButton jb2=new JButton("北丐");
		JButton jb3=new JButton("东邪");
		JButton jb4=new JButton("西毒");
		JButton jb5=new JButton("中伯通");
		JButton jb6=new JButton();
		JButton jb7=new JButton();
		//把控件放到面板中
		jPanel.add(jb1,BorderLayout.SOUTH);
		
		//把画板加到框架中
		this.add(jPanel);
		
	}
	public static void main(String[] args) {
		MyJFrame02 myJFrame02 =new MyJFrame02();
	
	}
}
