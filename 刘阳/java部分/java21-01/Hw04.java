import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Hw04 extends JFrame {
	public Hw04(){
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	JLabel bq=new JLabel();
	private void init() {
		JPanel mb=new JPanel();
		mb.setBackground(Color.gray);
		JTextField wb=new JTextField();
		mb.setLayout(null);
		wb=new JTextField(180);
		wb.setBounds(30, 50, 180, 30);
		mb.add(wb);
		bq.setBounds(110, 120,180, 30);
		bq.setForeground(Color.RED);
		mb.add(bq);
		add(mb);
		KeyAdapter ka=new KeyAdapter() {
			 public void keyPressed(KeyEvent e) {
				 bq.setText("Äã°´ÏÂÁË"+KeyEvent.getKeyText(e.getKeyCode())+"¼ü");
			 }
		};
		wb.addKeyListener(ka);
	}
	public static void main(String[] args) {
		Hw04 hw=new Hw04();
	}
}
