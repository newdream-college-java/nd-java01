package java21;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Disan extends JFrame implements ActionListener,KeyListener{
	JButton j8;
	JTextField t1;
	int q =0;
	int w =0;
	public Disan(){
		setSize(600,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}
	private void into() {
		Container panel=new JPanel();
		BorderLayout bd=new BorderLayout();
		panel.setLayout(bd);
		JPanel p1=new JPanel();
		t1=new JTextField(35);
	//	t1.setText();
		t1.setHorizontalAlignment(JTextField.RIGHT);
		t1.setFont(new Font("ËÎÌå",Font.BOLD,28));
		t1.setPreferredSize(new Dimension(50,80)); 
		p1.add(t1);
		JPanel p2=new JPanel();
		GridLayout g1=new GridLayout(5,3,1,1);
		p2.setLayout(g1);
		//JButton j8 = null;
		String[] bT=new String[]{"0","1","2","3","4","5","6","7","8","9","+","-","*","/","="};

		for(String st:bT){
			j8=new JButton(st);
			j8.setActionCommand(st);
			p2.add(j8);
			j8.setFont(new Font("ËÎÌå",Font.BOLD,20));
			j8.setFocusPainted(false);
			j8.addActionListener(this);
		}
		panel.add(p1,BorderLayout.NORTH);
		panel.add(p2,BorderLayout.CENTER);
		this.add(panel);

	}
	public static void main(String[] args) {
		Disan z=new Disan();
	}
	public void actionPerformed(ActionEvent e) {	

	}
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}



}
