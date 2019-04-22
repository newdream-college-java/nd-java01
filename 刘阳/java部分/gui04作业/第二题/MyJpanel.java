package march25;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyJpanel extends JPanel {
    
    public void paint(Graphics g) {
        super.paint(g);
       
        //»­±³¾°Í¼Æ¬
        File bg = new File("EXTWPQ~CSY056RTMZ$DGOQ2.jpg");
        Image image = null;
        try {
            image = ImageIO.read(bg);
        } catch (IOException e) {
           
            e.printStackTrace();
        }
        File cg = new File("{G9VW~NY))KOIFC}A@_DPEL.gif");
        Image imag = null;
        try {
            imag = ImageIO.read(cg);
        } catch (IOException e) {
           
            e.printStackTrace();
        }
        g.drawImage(image,0,0,600, 400, 0,0,800,600, this);
        g.drawImage(imag,350,250,100, 100, 0,0,100,100, this);
    }
}
