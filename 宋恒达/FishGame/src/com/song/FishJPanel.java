package com.song;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;

public class FishJPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Fish fish;  //玩家鱼
	List<Fish> fishList = new ArrayList<>();	//野鱼
	public static int count=0;
	public List<Fish> getFishList() {
		return fishList;
	}

	public void setFishList(List<Fish> fishList) {
		this.fishList = fishList;
	}

	public Fish getFish() {
		return fish;
	}

	public void setFish(Fish fish) {
		this.fish = fish;
		// 启动线程
		FishThread fishThread = new FishThread();
		fishThread.start();
		FishUtil.createNPCFish(fishList);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.RED);
		g.setFont(new Font("宋体",Font.BOLD,30));
		while(count>0) {
			g.drawString("开始下一波鱼", 400, 300);
			count--;
		}
		Image bg = FishUtil.IMAGES.get("FF201311.jpg");
		// 截取玩家小图
		Image leftPlayer = ((BufferedImage) fish.getImage()).getSubimage(fish.getCurIndex() * fish.getWidth(), 0,
				fish.getWidth(), fish.getHeight());
		;
		// 缩放后的宽高
		int width = (int) (fish.getWidth() * (1 - 1.0 / fish.getSize()));
		int height = (int) (fish.getHeight() * (1 - 1.0 / fish.getSize()));
		// 将方向向左的图片变成方向向右
		Image rightPlayer = FishUtil.getOppoImage((BufferedImage) leftPlayer);
		// 绘制背景
		g.drawImage(bg, 0, 0, this);
		//1,swim -1,turn镜像
		if ((fish.getDirection() == 1&&fish.getStatus().equals(FishUtil.FISH_SWIM)) ||(fish.getDirection()==-1&&fish.getStatus().equals(FishUtil.FISH_TURN))) { // 方向向左
			// 绘制玩家角色
			g.drawImage(rightPlayer, (int) (fish.getPoint().getX()), (int) (fish.getPoint().getY()), width, height,
					this);
		} else { // 方向向右
			g.drawImage(leftPlayer, (int) (fish.getPoint().getX()), (int) (fish.getPoint().getY()), width, height,
					this);
		}
		//设置野鱼边界
		Rectangle rectangle1=new Rectangle();
		fish.setRectangle(rectangle1);
//		g.drawRect((int)rectangle1.getX(), (int)rectangle1.getY(), (int)rectangle1.getWidth(), (int)rectangle1.getHeight());
		for(int i=0;i<fishList.size();i++) {
			//得到野鱼对象
			Fish wFish=fishList.get(i);
			Rectangle rectangle=new Rectangle();
			wFish.setRectangle(rectangle);
			//设置野鱼碰撞边界
//			g.drawRect((int)rectangle2.getX(), (int)rectangle2.getY(), (int)rectangle2.getWidth(), (int)rectangle2.getHeight());
			//得到绘制的野鱼图片
			BufferedImage leftWFishImage=(BufferedImage) wFish.getImage();
			//截取图片
			BufferedImage leftWFish=leftWFishImage.getSubimage(wFish.getWidth()*wFish.getCurIndex(), 0, wFish.getWidth(), wFish.getHeight());
			//将方向向左的变成向右
			BufferedImage rightFish=FishUtil.getOppoImage(leftWFish);
			if ((wFish.getDirection() == 1&&wFish.getStatus().equals(FishUtil.FISH_SWIM)) ||(wFish.getDirection()==-1&&wFish.getStatus().equals(FishUtil.FISH_TURN))) { // 方向向左
				// 绘制NPC鱼角色
				g.drawImage(rightFish, (int) (wFish.getPoint().getX()), (int) (wFish.getPoint().getY()), (int)(wFish.getWidth()*(1-1.0/wFish.getSize())), (int)(wFish.getHeight()*(1-1.0/wFish.getSize())),
						this);
			} else { // 方向向右
				g.drawImage(leftWFish, (int) (wFish.getPoint().getX()), (int) (wFish.getPoint().getY()), (int)(wFish.getWidth()*(1-1.0/wFish.getSize())), (int)(wFish.getHeight()*(1-1.0/wFish.getSize())),
						this);
			}
		}
		//绘制分数
		g.setColor(Color.RED);
		g.setFont(new Font("宋体",Font.BOLD,30));
		g.drawString(fish.getScore()+"", 100, 100);
		
	}

	/**
	 * 游动
	 * 
	 * @author mo
	 *
	 */
	class FishThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			Random random=new Random();

			while (true) {
				// 切换图片，自增1
				int index = fish.getCurIndex();
				fish.setCurIndex(index + 1);
				// 如果切换到最后一张图片就跳到第一章
				if (fish.getCurIndex() == fish.getCount()) {

					if (fish.getStatus().equals(FishUtil.FISH_TURN)) {
						fish.setStatus(FishUtil.FISH_SWIM);
					}
					if(fish.getStatus().equals(FishUtil.FISH_EAT)) {
						fish.setStatus(FishUtil.FISH_SWIM);
					}
					index = 0;
					fish.setCurIndex(0);
				}
				Rectangle rectangle1=new Rectangle();
				fish.setRectangle(rectangle1);
				//实现野鱼游动的动作
				for(int i=0;i<fishList.size();i++) {
					Fish wFish=fishList.get(i);
					int wIndex=wFish.getCurIndex();
					//图片下标+1
					wFish.setCurIndex(wIndex+1);
					//判断是否到最好一张图片，如果到了最后一张图片，设为0
					if(wFish.getCurIndex()==wFish.getCount()) {
						if (wFish.getStatus().equals(FishUtil.FISH_TURN)) {
							wFish.setStatus(FishUtil.FISH_SWIM);
						}
						wIndex = 0;
						wFish.setCurIndex(0);
					}
					//得到野鱼坐标
					Point point=wFish.getPoint();
					//得到目标位置
					Point targetPoint=wFish.getTargetPoint();
					//沿X轴方向距离
					int dx=(int)(targetPoint.getX()-point.getX());
					//沿Y轴方向距离
					int dy=(int)(targetPoint.getY()-point.getY());
					//和目标位置直线距离
					int distance=(int)Math.hypot(dx, dy);
					//100ms沿x轴游的距离
					int tx=(int)((FishUtil.SPEED*dx/distance)+point.getX());
					//100ms沿Y轴方向游的距离
					int ty=(int)((FishUtil.SPEED*dy/distance)+point.getY());
					point=new Point(tx,ty);
					if(Math.abs(distance)<80) { //如果距离小于80，再次设置随机目标位置
						//随机设置野鱼目标位置
						int ntx=random.nextInt((int)( Contacts.JFRAME_WIDTH-wFish.getWidth()*(1-1.0/wFish.getSize())));
						int nty=random.nextInt((int)( Contacts.JFRAME_HEIGHT-wFish.getHeight()*(1-1.0/wFish.getSize())));
						targetPoint=new Point(ntx,nty);
						wFish.setTargetPoint(targetPoint);
					}
					//设置游的方向
					int oldDirection=wFish.getDirection();//原先游的方向
					//设置现在游的方向
					wFish.setDirection(FishUtil.calDirection(point, targetPoint));
					if(oldDirection!=wFish.getDirection()) {
						wFish.setStatus(FishUtil.FISH_TURN);
					}
					//野鱼周围设置的碰撞边界
					Rectangle rectangle2=new Rectangle();
					wFish.setRectangle(rectangle2);
					wFish.setPoint(point);
				}
				// 线程睡眠100毫秒
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 重绘
				repaint();
			}
		}
	}
}
