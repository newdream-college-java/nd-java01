package 第21章Swing布局管理器;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyJFrameHome2 extends JFrame{
	public MyJFrameHome2(){
		setSize(new Dimension(400,300));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		intit();
		setVisible(true);
	}

	private void intit() {
		
		JPanel j1=new JPanel();
		BorderLayout b=new BorderLayout();
		j1.setLayout(b);
		JButton jb1=new JButton("东");
		JButton jb2=new JButton("南");
		JButton jb3=new JButton("西");
		JButton jb4=new JButton("北");
	
		j1.add(jb1,BorderLayout.EAST);
		j1.add(jb2,BorderLayout.SOUTH);
		j1.add(jb3,BorderLayout.WEST);
		j1.add(jb4,BorderLayout.NORTH);
		//this.add(j1);
	
		
		//中间面板
//		JPanel j2=new JPanel();
//		GridLayout g=new GridLayout(4,3);
//		j2.setLayout(g);
//		j1.add(j2,BorderLayout.CENTER);
		
		JPanel jP2 =new JPanel();
		GridLayout g1 =new GridLayout(4,3);
		jP2.setLayout(g1);
		for(int i=1;i<=12;i++){
			JButton j=new JButton(i+"");
			jP2.add(j);
		}
		j1.add(jP2,BorderLayout.CENTER);
		this.add(j1);
		
	}
	public static void main(String[] args) {
		MyJFrameHome2 my=new MyJFrameHome2();
		
	}
}
