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
		//����ѧ�ű�ǩ
		Label stuno = new Label("ѧ ��"); 
		stuno.setFont(new Font("", 5, 15));
		//�����ı���wb
		JTextField wb =new JTextField();
		wb.setFont(new Font("", 5, 15));
		stuno.setBounds(20,30,70,30);
		wb.setBounds(85, 30,100,30);
		this.add(stuno);
		this.add(wb);
		Label name =new Label("����");
		name.setFont(new Font("", 5, 15));
		name.setBounds(200, 30,70,30);
		JTextField wb1 =new JTextField();
		wb1.setFont(new Font("", 5, 15));
		wb1.setBounds(265, 30,100,30);
		this.add(name);
		this.add(wb1);
		Label sex=new Label("�Ա�");
		sex.setFont(new Font("", 5, 15));
		sex.setBounds(367, 30, 50, 30);
		this.add(sex);
		//���õ�ѡ��ťdx
		JRadioButton dx=new JRadioButton("��");
		JRadioButton dx1=new JRadioButton("Ů");
		dx.setSelected(true);
		dx.setBounds(420, 30, 60, 30);
		dx1.setBounds(480, 30, 50, 30);
		this.add(dx);
		this.add(dx1);
		Label age =new Label("�� ��");
		age.setBounds(80, 90, 70, 30);
		age.setFont(new Font("", 5, 15));
		JTextField wb2 =new JTextField();
		wb2.setFont(new Font("", 5, 15));
		wb2.setBounds(145, 90, 100, 30);
		Label adress =new Label("סַ");
		adress.setFont(new Font("", 5, 15));
		adress.setBounds(300, 90, 40, 30);
		this.add(age);
		this.add(wb2);
		this.add(adress);
		JTextField tAdress =new JTextField();
		tAdress.setFont(new Font("", 5, 15));
		tAdress.setBounds(380, 90, 150, 30);
		Button add=new Button("�� ��");
		add.setBounds(100, 180, 80, 30);
		add.setFont(new Font("", 5, 15));
		this.add(add);
		Button delete=new Button("ɾ ��");
		delete.setFont(new Font("", 5, 15));
		delete.setBounds(200, 180, 80, 30);
		this.add(tAdress);
		this.add(delete);
		Button revise=new Button("�� ��");
		revise.setFont(new Font("", 5, 15));
		revise.setBounds(300, 180, 80, 30);
		Button find=new Button("�� ѯ");
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
