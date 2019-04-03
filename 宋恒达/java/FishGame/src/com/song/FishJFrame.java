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
		// ���ñ���
		setTitle("������Ϸ");
		// ���ô�С
		// ����͸�����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image iCursor = FishUtil.IMAGES.get("cursor.png");
		Cursor cursor = toolkit.createCustomCursor(iCursor, new Point(0, 0), "͸�����");
		setCursor(cursor);
		setSize(Contacts.JFRAME_WIDTH, Contacts.JFRAME_HEIGHT);
		// ���ô��ڲ��ɸı��С
		setResizable(false);
		// �رմ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���þ���
		setLocationRelativeTo(null);
		// ��ʼ����Ϸ
		init();
		// ���ô��ڿɼ�
		setVisible(true);
	}

	/**
	 * ��ʼ��
	 */
	private void init() {
		FishJPanel fishJPanel = new FishJPanel();
		/**
		 * ������ҽ�ɫ����
		 */
		Fish fish = new Fish();
		// �õ����Image����
		Image bufferedImage = FishUtil.IMAGES.get(FishUtil.PLAYER);
		// �����������
		fish.setId(FishUtil.INDEX[0]);
		// �����������id�õ����Ŀ�͸�
		String wd = FishUtil.FISHES.get(fish.getId());
		String[] wds = wd.split("-");
		// �������width��height����
		fish.setWidth(Integer.parseInt(wds[0]));
		fish.setHeight(Integer.parseInt(wds[1]));
		// ������������
		fish.setSize(Integer.parseInt(wds[2]));
		fish.setDirection(FishUtil.STATUS_LEFT);
		// �������Image����
		fish.setImage(bufferedImage);
		fish.setStatus(FishUtil.FISH_SWIM);
		// �������Point����
		fish.setPoint(new Point((Contacts.JFRAME_WIDTH - fish.getWidth()) / 2,
				(Contacts.JFRAME_HEIGHT - fish.getHeight()) / 2));
		// ���ô�ͼ�г�Сͼ�ĸ���
		fish.setCount(((BufferedImage) fish.getImage()).getWidth() / fish.getWidth());
		// ��ӵ������
		fishJPanel.setFish(fish);
		this.add(fishJPanel);
		/**
		 * ������ 1.���¼�Դ 2.���� 3.��
		 */
		fishJPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseMoved(e);
				// �õ���������
				Fish fish = fishJPanel.getFish();
				Point MPoint = e.getPoint();
				// �õ���������
				Point FPoint = fish.getPoint();
				if (MPoint.x < FPoint.x) { // ����������ߣ���ͷ����
					fish.setDirection(FishUtil.STATUS_LEFT);
				} else if (MPoint.x > FPoint.x) {// ���������ұߣ���ͷ����
					fish.setDirection(FishUtil.STATUS_RIGHT);
				}
				int n=fishJPanel.getFishList().size();
				if(n!=0) {
				for (int i = 0; i < n; i++) {
					Fish wFish = fishJPanel.getFishList().get(i);
					Rectangle rectangle = fish.getRectangle();
					Rectangle rectangle1 = wFish.getRectangle();
					if (rectangle1.intersects(rectangle)) { // ������ײ
						fishJPanel.getFish().setStatus(FishUtil.FISH_EAT);
						fishJPanel.getFish().setScore(fishJPanel.getFish().getScore()+wFish.getScore()); // ������
						fishJPanel.getFishList().remove(i);
						break;
					}
				}
				}else {
					FishJPanel.count=20;
					FishUtil.createNPCFish(fishJPanel.getFishList());
				}
				// �������������ó��������
				fishJPanel.getFish().setPoint(MPoint);
				// �ػ�
				repaint();
			}
		});
	}

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(FishJFrame.class);
		new FishJFrame();
		logger.debug("����");
	}
}
