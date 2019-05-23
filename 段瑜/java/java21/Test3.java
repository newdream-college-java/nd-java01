package 作业;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test3 extends JFrame{	
	JTextField k1;
	JTextField k2;
	public Test3(){
		setSize(600,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		Container panel=getContentPane();
		panel.setLayout(null);
		k1=new JTextField();
		k2=new JTextField();
		JLabel user=new JLabel("用户名");
		JLabel UserPassword=new JLabel("用户密码");
		JButton determine=new JButton("确定");
		JButton cancel=new JButton("取消");
		user.setBounds(30,50,80,30);
		k1.setBounds(120,50,180,30);
		UserPassword.setBounds(30, 130, 80, 30);
		k2.setBounds(120, 130, 180, 30);
		determine.setBounds(90,180,60,30);
		cancel.setBounds(210,180,60,30);
		panel.add(user);
		panel.add(UserPassword);
		panel.add(k1);
		panel.add(k2);
		panel.add(determine);
		panel.add(cancel);
		determine.addActionListener(new  ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(k1.getText().equals(k2.getText())){
					JOptionPane.showMessageDialog(null, "登录成功", "消息框", JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "登录失败", "消息框", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test3();
	}
	
	

}
