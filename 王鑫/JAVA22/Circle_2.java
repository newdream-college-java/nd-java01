package Test2019_3_24_z22;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Circle_2 extends JFrame{
	JTextField jtf = new JTextField(20);
	JTextField jtf2 = new JTextField(20);
	public Circle_2() {
		setSize(300,240);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		init();
		setVisible(true);
	}
	public void init(){
		JLabel jl = new JLabel("°ë¾¶ ");
		JButton jb = new JButton("¼ÆËã");
		JLabel jl2 = new JLabel("Ô²Ãæ»ý");
		jl.setBounds(40, 40, 40,40);
		jtf.setBounds(100, 50, 150,20);
		jb.setBounds(190, 80, 60,20);
		jl2.setBounds(40, 100, 40,40);
		jtf2.setBounds(100, 110, 150,20);
        jb.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {				
			}
			public void mouseEntered(MouseEvent e) {				
			}
			public void mouseClicked(MouseEvent e) {				
				String s = jtf.getText();
				double n = Math.pow(Integer.parseInt(s), 2)*Math.PI;
				jtf2.setText(n+"");				
			}
		});
		add(jl);
		add(jtf);
		add(jb);
		add(jl2);
		add(jtf2);
	}
	public static void main(String[] args) {
		new Circle_2();
	}
}
