package Test2019_3_24_z22;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Enter_3 extends JFrame implements ActionListener{
	JButton jb = new JButton("确定");
	JButton jb2 = new JButton("取消");
	JTextField jtf = new JTextField(20);
	JTextField jtf2 = new JTextField(20);
	public Enter_3() {
		setSize(280, 230);
		setLayout(null);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	public void init() {
		JLabel jl = new JLabel("用户名");
		JLabel jl2= new JLabel("用户密码");
		jl.setBounds(20, 30, 50, 20);
		jtf.setBounds(90, 30, 150, 20);
		jl2.setBounds(20, 80, 60, 20);
		jtf2.setBounds(90, 80, 150, 20);
		jb.setBounds(40, 130, 60, 30);
		jb2.setBounds(160, 130, 60, 30);
		add(jb);
		add(jb2);
		add(jl);
		add(jl2);
		add(jtf);
		add(jtf2);
		//addActionListener
		jb.addActionListener(this);
		jb2.addActionListener(this);
        jb.setActionCommand("1");
        jb2.setActionCommand("2");
		
	}
	public void actionPerformed(ActionEvent e) {
	    String command = e.getActionCommand(); 
        if(command.equals("1")) {
            if(jtf.getText().equals(jtf2.getText())) {
                System.out.println("提示：相同");
            }else {
            	System.out.println("提示：不相同");
            }
        }else if(command.equals("2")) {
        	jtf.setText("");
        	jtf2.setText("");
        }
       
    }
	public static void main(String[] args) {
		new Enter_3();
	}
}
