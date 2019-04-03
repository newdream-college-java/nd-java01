package exercise2;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * ʵ�����½��棬����뾶������㰴ť��������������ʾ
 * @author mo
 *
 */
public class MyJFrame extends JFrame{

	/**
	 * ʵ�����½��棬����뾶��������㰴ť��������������ʾ
	 */
	private static final long serialVersionUID = 1L;
	public MyJFrame() {
		this.setTitle("Form1");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}
	private void init() {
		JPanel jPanel=new JPanel();
		jPanel.setLayout(null);
		JPanel jPanel1=new JPanel();
		FlowLayout flowLayout=new FlowLayout(4);
		flowLayout.setHgap(30);
		flowLayout.setVgap(10);
		jPanel1.setBounds(20, 20, 300, 200);
		jPanel1.setLayout(flowLayout);
		JLabel jLabel1=new JLabel("�뾶");
		JTextField jTextField1=new JTextField(15);
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField1);
		JButton jButton=new JButton("����");
		JPanel jPanel2=new JPanel();
		JLabel jLabel2=new JLabel("Բ���       ");
		JTextField jTextField2=new JTextField(15);
		jPanel2.add(jLabel2);
		jPanel2.add(jTextField2);
		jPanel1.add(jButton);
		jPanel.add(jPanel1);
		jPanel1.add(jPanel2);
		this.add(jPanel);
		jButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				double r=Double.parseDouble(jTextField1.getText());
				jTextField2.setText(String.valueOf(Math.PI*r*r));
			}
		});
	}
	public static void main(String[] args) {
		MyJFrame myJFrame=new MyJFrame();
	}
}
