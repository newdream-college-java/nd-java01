package 作业;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test2 extends JFrame{	
	JTextField jf;
	JTextField jg=new JTextField("面积结果");
	public Test2(){
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		Container panel=getContentPane();
		panel.setLayout(null);
		JLabel bj=new JLabel("半径");
		bj.setBounds(30, 30,80, 30);
		jf=new JTextField();
		jf.setBounds(120, 30, 180, 30);
		jf.setFont(new Font("宋体",Font.BOLD,20));
		JButton jx=new JButton("计算");
		jx.setBounds(210, 70, 90, 30);
		jx.setFocusPainted(false);
		JLabel mj=new JLabel("圆面积");
		mj.setBounds(30, 130, 80, 30);
		jg=new JTextField();
		jg.setFont(new Font("宋体",Font.BOLD,20));
		jg.setBounds(120, 130, 180, 30);
		panel.add(bj);
		panel.add(jf);
		panel.add(jx);
		panel.add(mj);
		panel.add(jg);
		jx.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try{
					double a=0;
					a=Double.parseDouble(jf.getText());
					double g=a*a*3.14;
					jg.setText(String.valueOf(g));
				}catch (Exception e2) {
					JOptionPane.showConfirmDialog(null, "请确定输入的数字");
					
				}
			}
		}) ;
		
											
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test2();
	}
	
	

}
