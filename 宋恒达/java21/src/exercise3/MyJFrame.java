package exercise3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 编写简易计算机界面
 * @author mo
 *
 */
public class MyJFrame extends JFrame{
	List<JButton> js=new ArrayList<>();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyJFrame() {
		this.setTitle("练习三");
		this.setSize(600, 400);
		init();
		this.setVisible(true);
	}
	private void init() {
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new BorderLayout(10, 10));
		JTextField jTextField=new JTextField(30);
		JPanel jPanel2=new JPanel();
		jTextField.setSize(100, 30);
		jPanel2.add(jTextField);
		jPanel.add(jPanel2,BorderLayout.NORTH);
		JPanel jPanel1=new JPanel();
		jPanel1.setLayout(new GridLayout(5,3,1,1));
		addJButton("0",jPanel1);
		addJButton("1",jPanel1);
		addJButton("2",jPanel1);
		addJButton("3",jPanel1);
		addJButton("4",jPanel1);
		addJButton("5",jPanel1);
		addJButton("6",jPanel1);
		addJButton("7",jPanel1);
		addJButton("8",jPanel1);
		addJButton("9",jPanel1);
		addJButton("*",jPanel1);
		addJButton("-",jPanel1);
		addJButton("×",jPanel1);
		addJButton("/",jPanel1);
		addJButton("=",jPanel1);
		jPanel.add(jPanel1,BorderLayout.CENTER);
		this.add(jPanel);
	}
	public static void main(String[] args) {
		MyJFrame myJFrame=new MyJFrame();
	}
	private void addJButton(String text,JPanel j) {
		JButton j1=new JButton(text);
		j.add(j1);
		js.add(j1);
	}
}
