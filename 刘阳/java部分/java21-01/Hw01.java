import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;


import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Hw01 extends JFrame{
	
	public Hw01(){
		setSize(600,800);
		getContentPane().setBackground(Color.gray);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}
	JTextField wb;
	private void into() {
		JPanel jP=new JPanel();
		jP.setBackground(Color.gray);
		wb=new JTextField(20);
		wb.setPreferredSize(new Dimension(0,30));
		JButton jb=new JButton("œ‘ æœ˚œ¢");
		jb.setFocusPainted(false);
		jb.setPreferredSize(new Dimension(100,30));
		jP.add(wb);
		jP.add(jb);
		add(jP);
		jb.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,wb.getText(),"",JOptionPane.PLAIN_MESSAGE);
			}
		});
		
	}
	public static void main(String[] args) {
		Hw01 h1=new Hw01();

	}

}
