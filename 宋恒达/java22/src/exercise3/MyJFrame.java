package exercise3;

/**
 * 实现如下界面
 */
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyJFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyJFrame() {
		this.setTitle("系统登录");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}
	private void init() {
		JPanel jPanel=new JPanel();
		jPanel.setLayout(null);
		JPanel jPanel1=new JPanel();
		JPanel jPanel2=new JPanel();
		FlowLayout flowLayout=new FlowLayout(1);
		flowLayout.setHgap(30);
		flowLayout.setVgap(20);
		jPanel1.setBounds(100, 100, 300,80);
		jPanel1.setLayout(flowLayout);
		jPanel2.setBounds(100, 140, 300,80);
		jPanel2.setLayout(new FlowLayout(1,20,20));
		JLabel jLabel1=new JLabel("用户名");
		JTextField jTextField1=new JTextField(15);
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField1);
		
		JLabel jLabel2=new JLabel("用户密码");
		JPasswordField jPasswordField=new JPasswordField(15);
		jPanel2.add(jLabel2);
		jPanel2.add(jPasswordField);	
		
		JPanel jPanel3=new JPanel();
		jPanel3.setBounds(100, 200, 300,80);
		jPanel3.setLayout(flowLayout);
		JButton jButton1=new JButton("确定");
		JButton jButton2=new JButton("取消");
		jPanel3.add(jButton1);
		jPanel3.add(jButton2);
		
		jPanel.add(jPanel1);
		this.add(jPanel2);
		jPanel.add(jPanel3)                                                                                                                                ;
		this.add(jPanel);
		jButton1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				String userName=jTextField1.getText();
				String password=jPasswordField.getText();
				if(userName.equals(password)) {
					JOptionPane.showConfirmDialog(null, "用户名和密码相同","",JOptionPane.OK_CANCEL_OPTION);
				}else {
					JOptionPane.showConfirmDialog(null, "用户名和密码不同","",JOptionPane.OK_CANCEL_OPTION);	
				}
			}
		});
	}
	public static void main(String[] args) {
		MyJFrame jFrame=new MyJFrame();
	}
}
