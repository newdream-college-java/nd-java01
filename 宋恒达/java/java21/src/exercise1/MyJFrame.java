package exercise1;
/**
 * 绘制界面，使用流式布局，在界面中添加
 * 1.按钮：button
 * 2.文本框：宽度为10
 * 3.单选按钮：男  女
 * 4.标签：HelloWorld
 */
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyJFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	public MyJFrame() {
		this.setTitle("swing开始");
		this.setSize(new Dimension(900, 800));
		init();
		this.setVisible(true);
	}
	public void init() {
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new FlowLayout(3));
		JButton jButton=new JButton("button");
		jPanel.add(jButton);
		JTextField jTextField=new JTextField(10);
		jPanel.add(jTextField);
		JRadioButton j1=new JRadioButton("男");
		j1.setSelected(true);
		JRadioButton j2=new JRadioButton("女");
		ButtonGroup b1=new ButtonGroup();
		b1.add(j1);
		b1.add(j2);
		jPanel.add(j1);
		jPanel.add(j2);
		JLabel jLabel=new JLabel("HelloWorld");
		jPanel.add(jLabel);
		this.add(jPanel);
	}
	public static void main(String[] args) {
		MyJFrame myJFrame=new MyJFrame();
	}
}
