package com.song;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

import org.apache.log4j.Logger;

public class FishJFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public FishJFrame() {
		// 设置标题
		setTitle("吃鱼游戏");
		// 设置大小
		// 设置透明光标
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image iCursor = FishUtil.IMAGES.get("cursor.png");
		Cursor cursor = toolkit.createCustomCursor(iCursor, new Point(0, 0), "透明光标");
		setCursor(cursor);
		setSize(Contacts.JFRAME_WIDTH, Contacts.JFRAME_HEIGHT);
		// 设置窗口不可改变大小
		setResizable(false);
		// 关闭窗口
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置居中
		setLocationRelativeTo(null);
		// 初始化游戏
		init();
		// 设置窗口可见
		setVisible(true);
	}

	/**
	 * 初始化
	 */
	private void init() {
		FishJPanel fishJPanel = new FishJPanel();
		/**
		 * 设置玩家角色属性
		 */
		Fish fish = new Fish();
		// 得到玩家Image对象
		Image bufferedImage = FishUtil.IMAGES.get(FishUtil.PLAYER);
		// 设置鱼的属性
		fish.setId(FishUtil.INDEX[0]);
		// 根据鱼的属性id得到它的宽和高
		String wd = FishUtil.FISHES.get(fish.getId());
		String[] wds = wd.split("-");
		// 设置鱼的width和height属性
		fish.setWidth(Integer.parseInt(wds[0]));
		fish.setHeight(Integer.parseInt(wds[1]));
		// 设置缩放属性
		fish.setSize(Integer.parseInt(wds[2]));
		fish.setDirection(FishUtil.STATUS_LEFT);
		// 设置鱼的Image属性
		fish.setImage(bufferedImage);
		fish.setStatus(FishUtil.FISH_SWIM);
		// 设置鱼的Point属性
		fish.setPoint(new Point((Contacts.JFRAME_WIDTH - fish.getWidth()) / 2,
				(Contacts.JFRAME_HEIGHT - fish.getHeight()) / 2));
		// 设置大图切成小图的个数
		fish.setCount(((BufferedImage) fish.getImage()).getWidth() / fish.getWidth());
		// 添加到面板类
		fishJPanel.setFish(fish);
		this.add(fishJPanel);
		/**
		 * 监听器 1.找事件源 2.监听 3.绑定
		 */
		fishJPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseMoved(e);
				// 得到鼠标的坐标
				Fish fish = fishJPanel.getFish();
				Point MPoint = e.getPoint();
				// 得到鱼的坐标点
				Point FPoint = fish.getPoint();
				if (MPoint.x < FPoint.x) { // 鼠标在鱼的左边，鱼头朝左
					fish.setDirection(FishUtil.STATUS_LEFT);
				} else if (MPoint.x > FPoint.x) {// 鼠标在鱼的右边，鱼头朝右
					fish.setDirection(FishUtil.STATUS_RIGHT);
				}
				int n=fishJPanel.getFishList().size();
				if(n!=0) {
				for (int i = 0; i < n; i++) {
					Fish wFish = fishJPanel.getFishList().get(i);
					Rectangle rectangle = fish.getRectangle();
					Rectangle rectangle1 = wFish.getRectangle();
					if (rectangle1.intersects(rectangle)) { // 矩形碰撞
						fishJPanel.getFish().setStatus(FishUtil.FISH_EAT);
						fishJPanel.getFish().setScore(fishJPanel.getFish().getScore()+wFish.getScore()); // 分数加
						fishJPanel.getFishList().remove(i);
						break;
					}
				}
				}else {
					FishJPanel.count=20;
					FishUtil.createNPCFish(fishJPanel.getFishList());
				}
				// 将鼠标的做做设置成鱼的坐标
				fishJPanel.getFish().setPoint(MPoint);
				// 重绘
				repaint();
			}
		});
	}

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(FishJFrame.class);
		new FishJFrame();
		logger.debug("结束");
	}
}
