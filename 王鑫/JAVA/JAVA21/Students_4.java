package Test2019_3_23_z21;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Students_4 extends JFrame{
	public Students_4() {
		setSize(600,300);
		setLayout(new FlowLayout());
        setLocationRelativeTo(null);
		//������Ͻǹرհ�ť�������������
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setVisible(true);		
	}
	public void init(){
		add(new Label("ѧ��"));
		add(new TextField(20));
		add(new Label("����"));
		add(new TextField(20));
		add(new Label("�Ա�"));
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("��     ",cbg,true);
		Checkbox cb2 = new Checkbox("Ů",cbg,false);
		add(cb1);
		add(cb2);
		add(new Label("����"));
		add(new TextField(28));
		add(new Label("סַ"));
		add(new TextField(28));
		Panel p2 = new Panel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT, 60, 5));		
		p2.add(new JButton("���"));
		p2.add(new JButton("ɾ��"));
		p2.add(new JButton("�޸�"));
		p2.add(new JButton("��ѯ"));
		add(p2);
		add(new TextArea(8,70));
	}
	public static void main(String[] args) {
		new Students_4();
	}
}
