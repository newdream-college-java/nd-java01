package 第21章Swing布局管理器事件作业;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomeWork1 extends JFrame implements ActionListener{
	JTextField jtf1 =new JTextField("文本框");
	JButton jb=new JButton("显示消息");
	public HomeWork1(){
		setSize(600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}

	private void init() {
		JPanel jp =new JPanel();
		
		jtf1.setFont(new Font("", 5, 30));
		jtf1.setPreferredSize(new Dimension(270,50));
		jp.add(jtf1);
		
		jb.setFont(new Font("",5,30));
		jb.setSize(100, 50);
		jp.add(jb);
		this.add(jp);
		//事件源为jb，一按到jb文本框就显示文本框中的内容  比如文本框中lyg
		jb.addActionListener(this);
		
	}
	public static void main(String[] args) {
		HomeWork1 h=new HomeWork1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jtf1.setText("lyg");
	}
}
