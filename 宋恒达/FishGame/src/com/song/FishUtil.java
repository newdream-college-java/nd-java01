package com.song;

import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * ������
 * 
 * @author mo
 *
 */
public class FishUtil {
	// ����ͼƬ����ȡӳ��Image����
	public final static Map<String, Image> IMAGES = new HashMap<>();
	// �洢ͼƬ��Ϣ
	public final static Map<Integer, String> FISHES = new HashMap<>();

	public final static String PLAYER = "swim_0.png";
	// ͼƬ�±�
	public final static int[] INDEX = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	// ת��
	public final static String FISH_TURN = "turn";
	// ��Ӿ
	public final static String FISH_SWIM = "swim";
	// ��
	public final static String FISH_EAT = "eat";
	// ������
	public final static int STATUS_LEFT = -1;
	// ������
	public final static int STATUS_RIGHT = 1;
	// Ұ���ζ��ٶ�
	public final static int SPEED = 10;
	// �����߽��ȱ�
	public final static double RATE = 0.3;
	public static int score_num = 0;

	static {
		/**
		 * 1.�õ�File���� 2.����File����õ�Ŀ¼���ļ���Ӧ������File���� 3.����File����õ�Image����
		 * 4.��ӵ�Map���ϣ�ӳ���ϵ���ļ���-----��Image����
		 */
		File file = new File("resource");
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			Image image = null;
			try {
				// ����File����õ�Image����
				image = ImageIO.read(files[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			IMAGES.put(files[i].getName(), image);
		}
		/**
		 * ��Һ�npc��Ϣ
		 */
		FISHES.put(0, "200-180-3-0"); // 3000��180 15
		FISHES.put(1, "125-105-1-10"); // 1875��105 15
		FISHES.put(2, "200-145-4-40"); // 2800��145 14
		FISHES.put(3, "180-120-2-20"); // 2520��120 14
		FISHES.put(4, "270-120-7-100"); // 3780��120 14
		FISHES.put(5, "250-175-2-20"); // 3750��175 15
		FISHES.put(6, "240-120-5-60"); // 3600��120 15
		FISHES.put(7, "170-105-6-80"); // 2380��105 14
		FISHES.put(8, "375-140-8-150"); // 5250��140 14
		FISHES.put(9, "190-120-9-30"); // 2660��120 14
	}

	// ��ȡ����ͼƬ:����һ��ͼƬ��������ķ�תͼƬ
	public static BufferedImage getOppoImage(BufferedImage img) {
		int width = img.getWidth();
		int height = img.getHeight();
		BufferedImage dstImage = new BufferedImage(width, height, 2);
		AffineTransform at = new AffineTransform(-1, 0, 0, 1, width, 0);
		AffineTransformOp ato = new AffineTransformOp(at, 1);
		return ato.filter(img, dstImage);
	}

	public static void createNPCFish(List<Fish> fishList) {
		Random random = new Random();
		int count = random.nextInt(5) + 5; // ��������������
		for (int i = 0; i < count; i++) {
			int wIndex = random.nextInt(FishUtil.INDEX.length - 1) + 1; // ���ѡ��Ұ�������
			Fish fish = new Fish();
			fish.setId(wIndex);
			fish.setCurIndex(0);
			fish.setStatus(FishUtil.FISH_SWIM);
			String[] info = FishUtil.FISHES.get(wIndex).split("-");
			fish.setWidth(Integer.parseInt(info[0]));
			fish.setHeight(Integer.parseInt(info[1]));
			fish.setSize(Integer.parseInt(info[2]));
			fish.setScore(Integer.parseInt(info[3]));
			BufferedImage image = (BufferedImage) FishUtil.IMAGES.get(fish.getStatus() + "_" + wIndex + ".png");
			fish.setImage(image);
			fish.setCount(image.getWidth() / fish.getWidth());
			// �������Ұ���ʼλ��
			// (int)(Contacts.JFRAME_WIDTH-image.getWidth()*(1-1.0/fish.getSize()))
			// (int)(Contacts.JFRAME_HEIGHT-image.getHeight()*(1-1.0/fish.getSize()))
			int xr = (int) (Contacts.JFRAME_WIDTH - fish.getWidth() * (1 - 1.0 / fish.getSize()));
			int yr = (int) (Contacts.JFRAME_HEIGHT - fish.getHeight() * (1 - 1.0 / fish.getSize()));
			int x = random.nextInt(xr);
			int y = random.nextInt(yr);
			Point point = new Point(x, y);
			fish.setPoint(point);
			// �������Ұ��Ŀ��λ��
			int tx = random.nextInt((int) (Contacts.JFRAME_WIDTH - fish.getWidth() * (1 - 1.0 / fish.getSize())));
			int ty = random.nextInt((int) (Contacts.JFRAME_HEIGHT - fish.getHeight() * (1 - 1.0 / fish.getSize())));
			Point targetPoint = new Point(tx, ty);
			fish.setTargetPoint(targetPoint);
			// ������ʼλ�ú�Ŀ��λ��������ķ���
			fish.setDirection(calDirection(point, targetPoint));
			// ���Ұ�����
			fishList.add(fish);
		}
	}

	/**
	 * ������ʼλ�ú�Ŀ��λ��������ķ���
	 * 
	 * @param point       ��ʼλ��
	 * @param targetPoint Ŀ��λ��
	 * @return ���ط���ֵ
	 */
	public static int calDirection(Point point, Point targetPoint) {
		if (point.x < targetPoint.x) {
			return 1;
		} else if (point.x > targetPoint.x) {
			return -1;
		}
		return -1;
	}
}
