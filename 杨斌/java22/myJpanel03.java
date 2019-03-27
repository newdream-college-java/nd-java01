package com.java.java22;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class myJpanel03 extends JPanel{
@Override
public void paint(Graphics g) {
	
	super.paint(g);
	File file=new File("resource/FF201311.jpg");
	File fish=new File("resource/swim_0.png");
	BufferedImage image=null;
	try {
		image=ImageIO.read(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	BufferedImage fishImg=null;
	try {
		fishImg=ImageIO.read(fish);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	BufferedImage smallFishImg=fishImg.getSubimage(0, 0, 200, 180);
	g.drawImage(image, 0, 0, this);
	g.drawImage(smallFishImg,350,200, 200,180,this);
	
	
}
}
