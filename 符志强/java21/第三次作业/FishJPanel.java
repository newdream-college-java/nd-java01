package 作业3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import xm.Fish;

public class FishJPanel extends JPanel {
	private Fish myFish;
	public Fish getMyFish() {
		return myFish;
	}
	public void setMyFish(Fish myFish) {
		this.myFish = myFish;
	}
	//重写JPanel类的paint方法
	public void paint(Graphics g) {
		//画控件
		super.paint(g);
		//增强：画图片
		//1.得到图片对应的Image
		//背景图片
		BufferedImage bg=FishUtil.IMAGES.get("FF201311.jpg");
		//得到玩家鱼图片image
		BufferedImage bigFishImg=myFish.getImage();
//		//画背景
		g.drawImage(bg, 0, 0, this);
//		//画玩家鱼
		g.drawImage(bigFishImg, myFish.getPoint().x,myFish.getPoint().y, this);
	}
}
