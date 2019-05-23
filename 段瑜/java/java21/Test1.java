package 作业;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test1 extends JFrame{	
	public Test1(){
		setSize(600,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		JPanel j=new JPanel();
		final JTextField jf=new JTextField("",5);
		jf.setPreferredSize(new Dimension(0,50));
		jf.setFont(new Font("",5,60));
		JButton x=new JButton("显示消息");
		j.add(jf);
		j.add(x);
		this.add(j);
		x.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, jf.getText(),"消息框", JOptionPane.CANCEL_OPTION);
				jf.setText("消息");
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1();
	}
	
	

}
