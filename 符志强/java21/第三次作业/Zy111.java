package 作业3;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Zy111  extends JFrame{
    public Zy111() {
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        this.setVisible(true);
    }
    private void init() {
         //  JPanel jp =new JPanel();
        //1.创建我们自定一定的面板
    	Zy11 mp = new Zy11();       
        //2.,将面板添加到窗体
        this.add(mp);
    }
    public static void main(String[] args) {
        new Zy111();
    }
}
