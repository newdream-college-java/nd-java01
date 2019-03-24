package 作业;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test3 extends JFrame {
	public Test3(){
		JFrame jf=new JFrame("我的第一个窗体");
		JPanel jp1=new JPanel();
		jf.setLayout(null);
		JTextField jt=new JTextField();
		jp1.setBounds(0, 0, 700, 700);
		jt.setPreferredSize(new Dimension(500,30));
		jp1.add(jt);
		JPanel jp2=new JPanel(new GridLayout(5, 3));
		jp2.setBounds(0, 100, 700, 550);
		for(int i=0;i<=14;i++){
			if(i==11){
				JButton jbi=	new JButton("十");
				jp2.add(jbi);
			}else if(i==12){
				JButton jbi=	new JButton("——");
				jp2.add(jbi);
			}else if(i==13){
				JButton jbi=	new JButton("X");
				jp2.add(jbi);
			}else if(i==14){
				JButton jbi=	new JButton("/");
				jp2.add(jbi);
			}else if(i==15){
				JButton jbi=	new JButton("===");
				jp2.add(jbi);
			}else{
				JButton jbi=	new JButton(i+"");
				jp2.add(jbi);
			}
		
		
		}
		jf.add(jp1);
		jf.add(jp2);
		jf.setBounds(200, 200, 700, 700);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test3();
	}

}
