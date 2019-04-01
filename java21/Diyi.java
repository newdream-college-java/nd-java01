package java21;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Diyi extends JFrame{
	public Diyi(){
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		//1.得到图片的对应的文件对象
        File file  =new File("{G9VW~NY))KOIFC}A@_DPEL.gif");
        Image image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    //设置窗体的图标
      this.setIconImage(image );

		setVisible(true);
	}
	private void into() {
		Container panel=this.getContentPane();
		FlowLayout f1=new FlowLayout();
		panel.setLayout(f1);		
		JButton jb=new JButton("10");
		jb.setPreferredSize(new Dimension(100,50));
		JTextField j2=new JTextField(10);
		JRadioButton jr1=new JRadioButton("男");
		JRadioButton jr2=new JRadioButton("女");
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(jr1);
		bg1.add(jr2);
		JLabel ja1=new JLabel("HelloWorld");
		panel.add("HelloWorld",ja1);	
		panel.add(jb);
		panel.add(j2);
		panel.add(jr1);
		panel.add(jr2);


	}
	public static void main(String[] args) {
		Diyi m1=new Diyi();
	}
}