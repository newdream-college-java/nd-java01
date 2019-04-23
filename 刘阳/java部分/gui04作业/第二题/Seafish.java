package march25;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Seafish extends JFrame{
	
	 public Seafish() {
	        this.setSize(600, 400);
	        this.setLocationRelativeTo(null);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        init();
	        this.setVisible(true);
	    }
	    private void init() {
	        MyJpanel mp = new MyJpanel();
	        this.add(mp);
	    }
	    public static void main(String[] args) {
	        new Seafish();
	    }

}
