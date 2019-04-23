package march25;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Hw01 extends JFrame{
	public Hw01() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		this.setVisible(true);
	}

	private void init() {
		Hw01JPanel mp = new Hw01JPanel();

		// 2.,将面板添加到窗体
		this.add(mp);

		mp.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				System.out.println(e.getPoint());
			}
		});
	}

	public static void main(String[] args) {
		new Hw01();
	}

}
