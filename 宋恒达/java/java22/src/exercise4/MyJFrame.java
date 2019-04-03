package exercise4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * ��ʵ�ֽӿں���������ʽʵ�����¹��ܣ�
 *  KeyListener KeyAdapter
 *  ���ı�����ĳ����ʱ��������ı�ǩ����ʾ��Ӧ�İ�ť��Ϣ
 * @author mo
 *
 */
public class MyJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyJFrame() {
		this.setTitle("��ϰ2");
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
		JLabel jLabel = new JLabel("��ʾ��ť����");
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
				jLabel2.setText("�㰴����"+e.getKeyChar());
			}
		});
	}

	public static void main(String[] args) {
		MyJFrame myJFrame = new MyJFrame();
	}
}
