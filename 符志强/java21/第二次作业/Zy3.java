package 作业2;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Zy3 extends JFrame implements ActionListener {
	JTextField j1 ;
	JTextField j2 ;
	public Zy3() {
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}
	private void init() {
		Container panel = this.getContentPane();
        panel.setLayout(null);
		JLabel x=new JLabel("用户名");
		x.setBounds(50, 50, 100, 20);
		add(x);		
		j1=new JTextField();
		j1.setBounds(150, 50, 200, 20);
		add(j1);
		JButton b=new JButton("确定");
		b.setBounds(150, 150, 100, 30);
		add(b);
		JButton b1=new JButton("取消");
		b1.setBounds(300, 150, 100, 30);
		add(b1);
		JLabel x2=new JLabel("用户密码");
		x2.setBounds(50, 90, 100, 20);
		add(x2);
		j2=new JTextField();
		j2.setBounds(150, 90, 200, 20);
		add(j2);
		 b.addActionListener(this);
         b.setActionCommand("1");
	}
	public static void main(String[] args) {
		Zy3 a=new Zy3();
	}
	public void actionPerformed(ActionEvent e) {		
		String command = e.getActionCommand(); 
        if(command.equals("1")) {          	
            	if (j1.getText().equals(j2.getText())) {
					System.out.println("用户名和用户密码是相同的");
				}else{
					System.out.println("用户名和用户密码是不相同的");
				}
            	
        }
	}

}
