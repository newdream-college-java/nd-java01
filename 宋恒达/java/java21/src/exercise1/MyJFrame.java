package exercise1;
/**
 * ���ƽ��棬ʹ����ʽ���֣��ڽ��������
 * 1.��ť��button
 * 2.�ı��򣺿��Ϊ10
 * 3.��ѡ��ť����  Ů
 * 4.��ǩ��HelloWorld
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
		this.setTitle("swing��ʼ");
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
		JRadioButton j1=new JRadioButton("��");
		j1.setSelected(true);
		JRadioButton j2=new JRadioButton("Ů");
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
