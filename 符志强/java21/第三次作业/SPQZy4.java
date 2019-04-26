package 作业3;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class SPQZy4 extends JFrame  {
    JTextField f ;
    JTextField j1 ;
    public SPQZy4() {
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        init();
        setVisible(true);
    }
    private void init() {
        JPanel pane= new JPanel(); 
        final JLabel f=new JLabel("  ");
		f.setBounds(50, 100, 100, 20);
		add(f);	
		j1=new JTextField();
		j1.setBounds(150, 50, 200, 20);
		add(j1);            
       //将面板放入框架
        add(pane);      
        //绑定监听器
        //pane.add(j1,BorderLayout.CENTER);
        
        j1.addKeyListener(new KeyAdapter() {
			 public void keyPressed(KeyEvent e) {
				 f.setText("你按下了"+KeyEvent.getKeyText(e.getKeyCode())+"键");
			 }
		});
    }
    public static void main(String[] args) {
        SPQZy4 my = new SPQZy4();
    }
}













