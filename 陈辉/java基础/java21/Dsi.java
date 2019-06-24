package java21;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Dsi extends JFrame {
	public Dsi (){
		setSize(720,530);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}

	private void into() {
		Container pane = getContentPane();
		pane.setLayout(null);
		JLabel j1=new JLabel("学号");
		j1.setBounds(20, 20, 30, 30);
		JTextField t1=new JTextField();
		t1.setBounds(60, 20, 180, 30);
		JLabel j2=new JLabel("姓名");
		j2.setBounds(260, 20, 30, 30);
		JTextField t2=new JTextField();
		t2.setBounds(310,20, 180, 30);
		JLabel j3=new JLabel("性别");
		j3.setBounds(510,20, 30, 30);
		JRadioButton r1=new JRadioButton("男");
		r1.setBounds(570,20, 50, 30);
		JRadioButton r2=new JRadioButton("女");
		r2.setBounds(640,20, 50, 30);
		ButtonGroup  b1=new ButtonGroup();
		r1.setSelected(true);
		JLabel j4=new JLabel("年龄");
		j4.setBounds(80, 70, 30, 30);
		JTextField t3=new JTextField();
		t3.setBounds(130,70,180, 30);
		JLabel j5=new JLabel("住址");
		j5.setBounds(340,70, 30, 30);
		JTextField t4=new JTextField();
		t4.setBounds(400,70,180, 30);
		JButton jb1 =new JButton("添加");
		jb1.setBounds(90,140, 80, 30);
		JButton jb2 =new JButton("删除");
		jb2.setBounds(230,140,80, 30);
		JButton jb3 =new JButton("修改");
		jb3.setBounds(370,140,80, 30);
		JButton jb4 =new JButton("查询");
		jb4.setBounds(510,140,80, 30);
		JTextArea a1=new JTextArea();
		a1.setBounds(20, 210, 650,230);
		b1.add(r1);
		b1.add(r2);
		pane.add(j1);
		pane.add(t1);
		pane.add(j2);
		pane.add(t2);
		pane.add(j3);
		pane.add(r1);
		pane.add(r2);
		pane.add(j4);
		pane.add(t3);
		pane.add(j5);
		pane.add(t4);
		pane.add(jb1);
		pane.add(jb2);
		pane.add(jb3);
		pane.add(jb4);
		pane.add(a1);

	}
	public static void main(String[] args) {
		Dsi z=new Dsi();
	}

}
