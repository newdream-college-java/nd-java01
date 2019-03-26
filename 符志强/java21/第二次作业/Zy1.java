package 作业2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Zy1 extends JFrame implements ActionListener {
	JTextField j1;
	public  Zy1() {
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}
	private void init() {
		JPanel p=(JPanel) getContentPane();
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
	    p.setLayout(fl);
		j1=new JTextField("");
		j1.setPreferredSize(new Dimension(300,20));
		add(j1);
		p.add(j1,BorderLayout.CENTER);
		JButton b=new JButton("显示信息");
		b.setBounds(300, 0, 100, 50);
		add(b);
		b.addActionListener(this);
        b.setActionCommand("1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zy1 a=new Zy1();
	}
	 public void actionPerformed(ActionEvent e) {
         //获取动作指令
        String command = e.getActionCommand(); 
         if(command.equals("1")) {
             if(j1.getText().equals("")) {
            	 j1.setText("什么都灭有");
             }else {
            	 j1.setText("");
             }
         }
        
     }
}
