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
 * һ.ʵ�����½��棬����ʾ��Ϣʱ������Ϣ����ʾ�ı����е�����
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
		JButton jButton=new JButton("��ʾ��Ϣ");
		jPanel.add(jTextField);
		jPanel.add(jButton);
		this.add(jPanel);
		jButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				JOptionPane.showConfirmDialog(null, jTextField.getText(), "��ʾ��",JOptionPane.OK_CANCEL_OPTION);
			}
		});
		
	}
	public static void main(String[] args) {
		MyJFrame myJFrame=new MyJFrame();
	}
}
