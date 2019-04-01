package java21;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Dier extends JFrame{
	public Dier(){
		setSize(600,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		into();
		setVisible(true);
	}

	private void into() {
		JPanel ct=new JPanel();
		BorderLayout b1=new BorderLayout();
		ct.setLayout(b1);
		JPanel d=new JPanel();
		JButton j1=new JButton("+");
		d.add(j1);
		JPanel n=new JPanel();
		JButton j2=new JButton("-");
		n.add(j2);
		JPanel x=new JPanel();
		JButton j3=new JButton("*");
		x.add(j3);
		JPanel b=new JPanel();
		JButton j4=new JButton("/");
		b.add(j4);
		JPanel zj=new JPanel();
		GridLayout bd=new GridLayout(4,3,1,1);
		zj.setLayout(bd);
		for(int i=1;i<=12;i++){
			JButton j8=new JButton("1"+i);
			zj.add(j8);
		}

		ct.add(d,BorderLayout.WEST);
		ct.add(n,BorderLayout.NORTH);
		ct.add(x,BorderLayout.EAST);
		ct.add(b,BorderLayout.SOUTH);
		ct.add(zj,BorderLayout.CENTER);
		this.add(ct);

	}
	public static void main(String[] args) {
		Dier z=new Dier();
	}


}
