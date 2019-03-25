package 作业;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Zy4 extends JFrame {
	public  Zy4() {
		setSize(480,360);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init() {
		JPanel p = (JPanel) getContentPane();
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        p.setLayout(fl);
		JLabel xh=new JLabel("学号");	
		add(xh);
		JTextField h=new JTextField();
		h.setPreferredSize(new Dimension(130,20));
		
		add(h);
		JLabel xm=new JLabel("姓名");
		add(xm);
		JTextField m=new JTextField();
		m.setPreferredSize(new Dimension(130,20));
		add(m);
		JLabel xb=new JLabel("性别");
		add(xb);
		JRadioButton r=new JRadioButton("男");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r);
		add(r);
		r.setSelected(true);		
		JRadioButton r1=new JRadioButton("女");	
		bg.add(r1);
		add(r1);
		JLabel nl=new JLabel("年龄");
		add(nl);
		JTextField n=new JTextField();
		n.setPreferredSize(new Dimension(150,20));
		add(n);
		JLabel zz=new JLabel("住址");
		add(zz);
		JTextField z=new JTextField();
		z.setPreferredSize(new Dimension(200,20));
		add(z);
		JButton tj=new JButton("添加");	
		tj.setPreferredSize(new Dimension(100,50));
		add(tj);
		JButton sc=new JButton("删除");	
		sc.setPreferredSize(new Dimension(100,50));
		add(sc);
		JButton xg=new JButton("修改");	
		xg.setPreferredSize(new Dimension(100,50));
		add(xg);
		JButton cx=new JButton("查询");	
		cx.setPreferredSize(new Dimension(100,50));
		add(cx);
		JTextField t=new JTextField();	
		t.setPreferredSize(new Dimension(450,200));
		add(t);	
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zy4 a=new Zy4();
	}

}
