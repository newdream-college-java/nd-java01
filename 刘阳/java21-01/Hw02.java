import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Hw02 extends JFrame implements ActionListener{
	public Hw02(){
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		double a=0;
		//����ΪԲ�İ뾶
		a = Double.parseDouble(wb.getText());
		//����Բ�������ʽ
		double mianji= a*a*3.14;
		wb1.setText(mianji+"");
	}
	//���������һ�����ȵ��ı���
	JTextField wb=new JTextField(10);
	JTextField wb1 =new JTextField(10);
	public void init() {
		JPanel jp =new JPanel();
		JLabel j1 =new JLabel("�뾶");
		j1.setFont(new Font("",5,20));
		j1.setSize(150, 50);
		jp.add(j1);
		wb.setFont(new Font("", 5, 20));
		wb.setSize(150, 50);
		jp.add(wb);
		JButton jb=new JButton("����");
		jb.setFont(new Font("", 5, 20));
		jb.setPreferredSize(new Dimension (250,30));
		jp.add(jb);
		JLabel j2=new JLabel("Բ���");
		j2.setFont(new Font("", 5,20));
		j2.setSize(150, 50);
		jp.add(j2);
		wb1.setFont(new Font("", 5,20));
		wb1.setSize(150, 50);
		jp.add(wb1);
		this.add(jp);
		jb.addActionListener(this);
		
	}
	public static void main(String[] args) {
		Hw02 hw=new Hw02();
	}
	
}
