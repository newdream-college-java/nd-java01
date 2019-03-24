package exercise4;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyJFrame extends JFrame {

	/**
	 * 绘制学生管理界面
	 */
	private static final long serialVersionUID = 1L;
	public MyJFrame() {
		this.setTitle("练习四");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		JPanel jPanel=new JPanel();
		FlowLayout flowLayout=new FlowLayout();
		flowLayout.setHgap(10);
		flowLayout.setVgap(20);
		jPanel.setLayout(flowLayout);
		JLabel jLabel1=new JLabel("学号");
		JTextField jTextField1=new JTextField(15);
		JLabel jLabel2=new JLabel("姓名");
		JTextField jTextField2=new JTextField(15);
		JLabel jLabel3=new JLabel("性别");
		JRadioButton jRadioButton1=new JRadioButton("男");
		jRadioButton1.setSelected(true);
		JRadioButton jRadioButton2=new JRadioButton("女");
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		jPanel.add(jLabel1);
		jPanel.add(jTextField1);
		jPanel.add(jLabel2);
		jPanel.add(jTextField2);
		jPanel.add(jLabel3);
		jPanel.add(jRadioButton1);
		jPanel.add(jRadioButton2);
		JLabel jLabel4=new JLabel("年龄    ");
		JTextField jTextField3=new JTextField(15);
		JLabel jLabel5=new JLabel("住址    ");
		JTextField jTextField4=new JTextField(15);
		jPanel.add(jLabel4);
		jPanel.add(jTextField3);
		jPanel.add(jLabel5);
		jPanel.add(jTextField4);
		JPanel jPanel2=new JPanel();
		FlowLayout flowLayout2=new FlowLayout();
		flowLayout2.setHgap(20);
		jPanel2.setLayout(flowLayout2);
		JButton jButton1=new JButton("添加");
		JButton jButton2=new JButton("删除");
		JButton jButton3=new JButton("修改");
		JButton jButton4=new JButton("查询");
		jPanel2.add(jButton1);
		jPanel2.add(jButton2);
		jPanel2.add(jButton3);
		jPanel2.add(jButton4);
		jPanel.add(jPanel2);
		JTextField jTextField5=new JTextField();
		jTextField5.setPreferredSize(new Dimension(500,150));
		jPanel.add(jTextField5);
		this.add(jPanel);
	}
	public static void main(String[] args) {
		MyJFrame jFrame=new MyJFrame();
	}
}
