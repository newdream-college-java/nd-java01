package Test2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test02 extends JFrame{
	public Test02(){
		setTitle("Test02");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		//更改图标
	    File file  =new File("{G9VW~NY))KOIFC}A@_DPEL.gif");
        Image image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //设置窗体的图标
        setIconImage(image );
        //设置可见
		setVisible(true);
	}
	private void init() {
		Container jl=getContentPane();
		jl.setLayout(new BorderLayout(2,2));
		JPanel jp=new JPanel(new GridLayout(4,3,1,1));
		JPanel jp1=new JPanel(new GridLayout(4,3,1,1));
		JPanel jp2=new JPanel(new GridLayout(4,3,1,1));
		JPanel jp3=new JPanel(new GridLayout(4,3,1,1));
		for (int i = 0; i < 12; i++) {
			jp.add(new JButton(""+i));
			jp1.add(new JButton(""+i));
			jp2.add(new JButton(""+i));
			jp3.add(new JButton(""+i));
		}
		jl.add(jp,BorderLayout.NORTH);
		jl.add(jp1,BorderLayout.SOUTH);
		jl.add(jp2,BorderLayout.WEST);
		jl.add(jp3,BorderLayout.EAST);
		
	}
	public static void main(String[] args) {
		new Test02();
	}
}
