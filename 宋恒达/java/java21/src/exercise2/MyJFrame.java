package exercise2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 二.绘制界面
 * 使用边界布局，BorderLayout()在界面四周放置四个按钮，东 南 西 北
 * 使用网格布局，GrideLayout(4,3,1,1):在界面上添加4×3 12个按钮
 * @author mo
 *
 */
public class MyJFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyJFrame() {
		this.setTitle("作业2");
		this.setSize(800, 600);
		init();
		this.setVisible(true);
	}
	private void init() {
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new BorderLayout(10, 10));
		JButton j1=new JButton("东");
		JButton j2=new JButton("南");
		JButton j3=new JButton("西");
		JButton j4=new JButton("北");
		JPanel jPanel1=new JPanel();
		jPanel1.setLayout(new GridLayout(4,3,1,1));
		for(int i=0;i<12;i++) {
			JButton j5=new JButton("按钮");
			jPanel1.add(j5);
		}
		jPanel.add(j1,BorderLayout.EAST);
		jPanel.add(j2,BorderLayout.SOUTH);
		jPanel.add(j3,BorderLayout.WEST);
		jPanel.add(j4,BorderLayout.NORTH);
		jPanel.add(jPanel1,BorderLayout.CENTER);
		this.add(jPanel);
	}
	public static void main(String[] args) {
		MyJFrame myJFrame=new MyJFrame();
	}
}
