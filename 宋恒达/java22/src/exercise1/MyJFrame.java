package exercise1;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 一.实现以下界面，点显示消息时，用消息框显示文本框中的内容
 * @author mo
 *
 */
public class MyJFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyJFrame() {
		this.setTitle("Form1");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}
	private void init() {
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new FlowLayout(1));
		JTextField jTextField=new JTextField(20);
		JButton jButton=new JButton("显示消息");
		jPanel.add(jTextField);
		jPanel.add(jButton);
		this.add(jPanel);
		jButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				JOptionPane.showConfirmDialog(null, jTextField.getText(), "提示框",JOptionPane.OK_CANCEL_OPTION);
			}
		});
		
	}
	public static void main(String[] args) {
		MyJFrame myJFrame=new MyJFrame();
	}
}
