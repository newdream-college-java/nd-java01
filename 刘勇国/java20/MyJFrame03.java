package 第20章Swing布局管理器;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame03 extends JFrame{
	public MyJFrame03(){
		//常量的名字都是使用大写字母
		setSize(new Dimension(600,800));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intit();
		setVisible(true);
	}

	private void intit() {
		// TODO Auto-generated method stub
		//
		JPanel jPanel =new JPanel();
		//设置网格布局管理器
		GridLayout grid=new GridLayout(5,4,0,0);
		jPanel.setLayout(grid);
		//创建按钮
		for(int i=1;i<=6;i++){
			JButton j=new JButton(i+"");
			jPanel.add(j);
		}
		this.add(jPanel);
		
	}
	public static void main(String[] args) {
		MyJFrame03 m3=new MyJFrame03();
	}
	
}
