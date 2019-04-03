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
	private Fish fish;  //�����
	List<Fish> fishList = new ArrayList<>();	//Ұ��
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
		// �����߳�
		FishThread fishThread = new FishThread();
		fishThread.start();
		FishUtil.createNPCFish(fishList);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.RED);
		g.setFont(new Font("����",Font.BOLD,30));
		while(count>0) {
			g.drawString("��ʼ��һ����", 400, 300);
			count--;
		}
		Image bg = FishUtil.IMAGES.get("FF201311.jpg");
		// ��ȡ���Сͼ
		Image leftPlayer = ((BufferedImage) fish.getImage()).getSubimage(fish.getCurIndex() * fish.getWidth(), 0,
				fish.getWidth(), fish.getHeight());
		;
		// ���ź�Ŀ��
		int width = (int) (fish.getWidth() * (1 - 1.0 / fish.getSize()));
		int height = (int) (fish.getHeight() * (1 - 1.0 / fish.getSize()));
		// �����������ͼƬ��ɷ�������
		Image rightPlayer = FishUtil.getOppoImage((BufferedImage) leftPlayer);
		// ���Ʊ���
		g.drawImage(bg, 0, 0, this);
		//1,swim -1,turn����
		if ((fish.getDirection() == 1&&fish.getStatus().equals(FishUtil.FISH_SWIM)) ||(fish.getDirection()==-1&&fish.getStatus().equals(FishUtil.FISH_TURN))) { // ��������
			// ������ҽ�ɫ
			g.drawImage(rightPlayer, (int) (fish.getPoint().getX()), (int) (fish.getPoint().getY()), width, height,
					this);
		} else { // ��������
			g.drawImage(leftPlayer, (int) (fish.getPoint().getX()), (int) (fish.getPoint().getY()), width, height,
					this);
		}
		//����Ұ��߽�
		Rectangle rectangle1=new Rectangle();
		fish.setRectangle(rectangle1);
//		g.drawRect((int)rectangle1.getX(), (int)rectangle1.getY(), (int)rectangle1.getWidth(), (int)rectangle1.getHeight());
		for(int i=0;i<fishList.size();i++) {
			//�õ�Ұ�����
			Fish wFish=fishList.get(i);
			Rectangle rectangle=new Rectangle();
			wFish.setRectangle(rectangle);
			//����Ұ����ײ�߽�
//			g.drawRect((int)rectangle2.getX(), (int)rectangle2.getY(), (int)rectangle2.getWidth(), (int)rectangle2.getHeight());
			//�õ����Ƶ�Ұ��ͼƬ
			BufferedImage leftWFishImage=(BufferedImage) wFish.getImage();
			//��ȡͼƬ
			BufferedImage leftWFish=leftWFishImage.getSubimage(wFish.getWidth()*wFish.getCurIndex(), 0, wFish.getWidth(), wFish.getHeight());
			//����������ı������
			BufferedImage rightFish=FishUtil.getOppoImage(leftWFish);
			if ((wFish.getDirection() == 1&&wFish.getStatus().equals(FishUtil.FISH_SWIM)) ||(wFish.getDirection()==-1&&wFish.getStatus().equals(FishUtil.FISH_TURN))) { // ��������
				// ����NPC���ɫ
				g.drawImage(rightFish, (int) (wFish.getPoint().getX()), (int) (wFish.getPoint().getY()), (int)(wFish.getWidth()*(1-1.0/wFish.getSize())), (int)(wFish.getHeight()*(1-1.0/wFish.getSize())),
						this);
			} else { // ��������
				g.drawImage(leftWFish, (int) (wFish.getPoint().getX()), (int) (wFish.getPoint().getY()), (int)(wFish.getWidth()*(1-1.0/wFish.getSize())), (int)(wFish.getHeight()*(1-1.0/wFish.getSize())),
						this);
			}
		}
		//���Ʒ���
		g.setColor(Color.RED);
		g.setFont(new Font("����",Font.BOLD,30));
		g.drawString(fish.getScore()+"", 100, 100);
		
	}

	/**
	 * �ζ�
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
				// �л�ͼƬ������1
				int index = fish.getCurIndex();
				fish.setCurIndex(index + 1);
				// ����л������һ��ͼƬ��������һ��
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
				//ʵ��Ұ���ζ��Ķ���
				for(int i=0;i<fishList.size();i++) {
					Fish wFish=fishList.get(i);
					int wIndex=wFish.getCurIndex();
					//ͼƬ�±�+1
					wFish.setCurIndex(wIndex+1);
					//�ж��Ƿ����һ��ͼƬ������������һ��ͼƬ����Ϊ0
					if(wFish.getCurIndex()==wFish.getCount()) {
						if (wFish.getStatus().equals(FishUtil.FISH_TURN)) {
							wFish.setStatus(FishUtil.FISH_SWIM);
						}
						wIndex = 0;
						wFish.setCurIndex(0);
					}
					//�õ�Ұ������
					Point point=wFish.getPoint();
					//�õ�Ŀ��λ��
					Point targetPoint=wFish.getTargetPoint();
					//��X�᷽�����
					int dx=(int)(targetPoint.getX()-point.getX());
					//��Y�᷽�����
					int dy=(int)(targetPoint.getY()-point.getY());
					//��Ŀ��λ��ֱ�߾���
					int distance=(int)Math.hypot(dx, dy);
					//100ms��x���εľ���
					int tx=(int)((FishUtil.SPEED*dx/distance)+point.getX());
					//100ms��Y�᷽���εľ���
					int ty=(int)((FishUtil.SPEED*dy/distance)+point.getY());
					point=new Point(tx,ty);
					if(Math.abs(distance)<80) { //�������С��80���ٴ��������Ŀ��λ��
						//�������Ұ��Ŀ��λ��
						int ntx=random.nextInt((int)( Contacts.JFRAME_WIDTH-wFish.getWidth()*(1-1.0/wFish.getSize())));
						int nty=random.nextInt((int)( Contacts.JFRAME_HEIGHT-wFish.getHeight()*(1-1.0/wFish.getSize())));
						targetPoint=new Point(ntx,nty);
						wFish.setTargetPoint(targetPoint);
					}
					//�����εķ���
					int oldDirection=wFish.getDirection();//ԭ���εķ���
					//���������εķ���
					wFish.setDirection(FishUtil.calDirection(point, targetPoint));
					if(oldDirection!=wFish.getDirection()) {
						wFish.setStatus(FishUtil.FISH_TURN);
					}
					//Ұ����Χ���õ���ײ�߽�
					Rectangle rectangle2=new Rectangle();
					wFish.setRectangle(rectangle2);
					wFish.setPoint(point);
				}
				// �߳�˯��100����
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// �ػ�
				repaint();
			}
		}
	}
}
