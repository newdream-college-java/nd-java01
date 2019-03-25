package exercise4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 用实现接口和适配器方式实现如下功能：
 *  KeyListener KeyAdapter
 *  在文本框按下某个键时，在下面的标签中显示对应的按钮信息
 * @author mo
 *
 */
public class MyJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyJFrame() {
		this.setTitle("练习2");
		this.setSize(300, 400);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}

	private void init() {
		JPanel jPanel = new JPanel();
		jPanel.setLayout(null);
		JTextField jTextField = new JTextField(15);
		jTextField.setBounds(50, 50, 100, 20);
		JLabel jLabel = new JLabel("显示按钮过程");
		jLabel.setBounds(50, 100, 100, 20);
		JLabel jLabel2 = new JLabel();
		jLabel2.setBounds(80, 120, 100, 20);
		jPanel.add(jTextField);
		jPanel.add(jLabel);
		jPanel.add(jLabel2);
		this.add(jPanel);
		jTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
				jLabel2.setText("你按下了"+e.getKeyChar());
			}
		});
	}

	public static void main(String[] args) {
		MyJFrame myJFrame = new MyJFrame();
	}
}
