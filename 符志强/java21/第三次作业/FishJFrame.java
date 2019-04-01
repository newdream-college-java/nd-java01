package 作业3;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import xm.Fish;

public class FishJFrame extends JFrame {
	public FishJFrame() {
		//大小
		setSize(800,600);
		//关闭
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//居中
		setLocationRelativeTo(null);
		//初始化
		init();
		//可见
		setVisible(true);
	}
	private void init() {
		//创建面板
		final FishJPanel fj=new FishJPanel();
		Fish myFish=new Fish();
		//2设置玩家鱼的图片
		BufferedImage myFishImg=FishUtil.IMAGES.get("FF201222.png");
		//2.1把图片导入到玩家鱼类
		myFish.setImage(myFishImg);
//		//2.2设置玩家鱼的位置
		myFish.setPoint(new Point(800/2,600/2));
//
//
//		//将玩家鱼放入面板
		fj.setMyFish(myFish);
		//将面板放入窗体
		this.add(fj);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FishJFrame();
	}

}
