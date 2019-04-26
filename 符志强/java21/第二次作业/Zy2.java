package 作业2;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Zy2 extends JFrame implements ActionListener {
	JTextField j1 ;
	JTextField j2 ;
	public Zy2() {
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		init();
		setVisible(true);
	}
	private void init() {
		// TODO Auto-generated method stub
		Container panel = this.getContentPane();
        panel.setLayout(null);
		JLabel x=new JLabel("半径");
		x.setBounds(50, 0, 100, 20);
		add(x);		
		j1=new JTextField();
		j1.setBounds(100, 0, 200, 20);
		add(j1);
		JButton b=new JButton("计算");
		b.setBounds(150, 30, 100, 30);
		add(b);
		JLabel x2=new JLabel("圆面积");
		x2.setBounds(50, 80, 100, 20);
		add(x2);
		j2=new JTextField();
		j2.setBounds(100, 80, 200, 20);
		add(j2);
		 b.addActionListener(this);
         b.setActionCommand("1");
	}
	public static void main(String[] args) {
		Zy2 a=new Zy2();
	}
	public void actionPerformed(ActionEvent e) {		
		String command = e.getActionCommand(); 
        if(command.equals("1")) {
            	Integer a=Integer.parseInt(j1.getText());
            	double h=a*a*3.14;
            	j2.setText(String.valueOf(h));
        }
	}

}
