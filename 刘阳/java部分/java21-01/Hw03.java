import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Hw03 extends JFrame{
	public Hw03(){
		setSize(600,400);
		getContentPane().setBackground(Color.gray);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	JTextField wb;
	JTextField wjb;
	private void init() {
		Container panel=getContentPane();
		panel.setLayout(null);
		wb=new JTextField(50);
		wjb=new JTextField(50);
		JLabel bq=new JLabel("用户名");
		bq.setBounds(30, 60, 80, 30);	
		panel.add(bq);
		wb.setBounds(110, 60, 180, 30);
		panel.add(wb);
		JLabel bq1=new JLabel("用户密码");
		bq1.setBounds(30,130,80, 30);
		panel.add(bq1);
		wjb.setBounds(110,130,180,30);
		panel.add(wjb);
		JButton jb=new JButton("确认");
		jb.setBounds(90,180,60,30);
		panel.add(jb);
		JButton jb1=new JButton("取消");
		jb1.setBounds(210,180,60,30);		
		panel.add(jb1);
		ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(wb.getText().equals(wjb.getText())){
					JOptionPane.showMessageDialog(null,"密码与账户相同","",JOptionPane.PLAIN_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "密码与账户不相同","",JOptionPane.PLAIN_MESSAGE);
				}
			}
		};
		jb.addActionListener(al);
		ActionListener bl=new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				wb.setText("");
				wjb.setText("");
			}
		};
		jb1.addActionListener(bl);
	}
	public static void main(String[] args) {
		Hw03 hw=new Hw03();
}

}
