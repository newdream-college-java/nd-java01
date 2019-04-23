import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Testcalculator extends JFrame {
	public Testcalculator(){
		setSize(300,500);
		getContentPane().setBackground(Color.gray);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	public void init(){
		//得到默认的画板
		Container contentPane =getContentPane();
		//创建一个面板
		JPanel mb =new JPanel();		
		////设置面板布局（边界）
		BorderLayout b1=new BorderLayout();		
		mb.setLayout(b1);
		//上面的框为文本框
		JTextField wb=new JTextField("请输入数字");
		//设置文本框内字体大小
		wb.setFont(new Font("", 0, 50));
		//设置文本框的大小
		wb.setPreferredSize(new Dimension(200,100));
		//把文本框放入到jp1这个画板中
		mb.add(wb,BorderLayout.NORTH);
		//把画板放入到框架中
		contentPane.add(mb,BorderLayout.NORTH);
		
		
		//下面的计算数字框
		JPanel mb2 =new JPanel();
		GridLayout g1 =new GridLayout(4,4,5,5);
		mb2.setLayout(g1);
		for(int i=1;i<=16;i++){
			//确定每一行的按钮应该写入什么内容
			if(i<=3){
				JButton j=new JButton(i+"");
				mb2.add(j);
			}else if(i<=7&&i>=5){
				JButton j=new JButton((i-1)+"");
				mb2.add(j);
			}else if(i<=11&&i>=9){
				JButton j=new JButton((i-2)+"");
				mb2.add(j);
			}else if(i==13){
				JButton j=new JButton(0+"");
				mb2.add(j);
			}else if(i==14){
				JButton j=new JButton("归零");
				mb2.add(j);
			}else if(i==4){
				JButton j=new JButton("+");
				mb2.add(j);
			}else if(i==8){
				JButton j=new JButton("-");
				mb2.add(j);
			}else if(i==15){
				JButton j=new JButton("=");
				mb2.add(j);
			}else if(i==12){
				JButton j=new JButton("*");
				mb2.add(j);
			}else{
				JButton j=new JButton("/");
				mb2.add(j);
			}
		}
		contentPane.add(mb2,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		Testcalculator good=new Testcalculator();
	}
}
