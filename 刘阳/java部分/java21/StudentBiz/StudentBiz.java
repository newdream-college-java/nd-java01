import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class StudentBiz extends JFrame {
	public StudentBiz(){
		setSize(600,400);
//		getContentPane().setBackground(Color.gray);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	private void init(){
		Container panel = this.getContentPane();
		panel.setLayout(null);
		//插入学号标签
		Label stuno = new Label("学 号"); 
		stuno.setFont(new Font("", 5, 15));
		//设置文本框wb
		JTextField wb =new JTextField();
		wb.setFont(new Font("", 5, 15));
		stuno.setBounds(20,30,70,30);
		wb.setBounds(85, 30,100,30);
		this.add(stuno);
		this.add(wb);
		Label name =new Label("姓名");
		name.setFont(new Font("", 5, 15));
		name.setBounds(200, 30,70,30);
		JTextField wb1 =new JTextField();
		wb1.setFont(new Font("", 5, 15));
		wb1.setBounds(265, 30,100,30);
		this.add(name);
		this.add(wb1);
		Label sex=new Label("性别");
		sex.setFont(new Font("", 5, 15));
		sex.setBounds(367, 30, 50, 30);
		this.add(sex);
		//设置单选按钮dx
		JRadioButton dx=new JRadioButton("男");
		JRadioButton dx1=new JRadioButton("女");
		dx.setSelected(true);
		dx.setBounds(420, 30, 60, 30);
		dx1.setBounds(480, 30, 50, 30);
		this.add(dx);
		this.add(dx1);
		Label age =new Label("年 龄");
		age.setBounds(80, 90, 70, 30);
		age.setFont(new Font("", 5, 15));
		JTextField wb2 =new JTextField();
		wb2.setFont(new Font("", 5, 15));
		wb2.setBounds(145, 90, 100, 30);
		Label adress =new Label("住址");
		adress.setFont(new Font("", 5, 15));
		adress.setBounds(300, 90, 40, 30);
		this.add(age);
		this.add(wb2);
		this.add(adress);
		JTextField tAdress =new JTextField();
		tAdress.setFont(new Font("", 5, 15));
		tAdress.setBounds(380, 90, 150, 30);
		Button add=new Button("添 加");
		add.setBounds(100, 180, 80, 30);
		add.setFont(new Font("", 5, 15));
		this.add(add);
		Button delete=new Button("删 除");
		delete.setFont(new Font("", 5, 15));
		delete.setBounds(200, 180, 80, 30);
		this.add(tAdress);
		this.add(delete);
		Button revise=new Button("修 改");
		revise.setFont(new Font("", 5, 15));
		revise.setBounds(300, 180, 80, 30);
		Button find=new Button("查 询");
		find.setFont(new Font("", 5, 15));
		find.setBounds(400, 180, 80, 30);
		this.add(revise);
		this.add(find);
		JTextField wb5=new JTextField();
		wb5.setFont(new Font("", 5, 15));
		wb5.setBounds(50, 250, 480, 100);
		this.add(wb5);
		
	}
	public static void main(String[] args) {
		StudentBiz haha=new StudentBiz();
	}
}
