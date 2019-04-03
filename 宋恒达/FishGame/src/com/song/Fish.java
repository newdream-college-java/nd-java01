package com.song;

import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/*
 * ����
 */
public class Fish {
	private Image image; // ͼƬ����
	private Point point; // ͼƬλ��
	private int width; // ͼƬ��
	private int height; // ͼƬ��
	private int id; // ͼƬ���
	private int curIndex = 0; // ͼƬ�±�
	private int count; // ͼƬ����
	private int size; // ͼƬ���ű���
	private int direction; // ���򣬷�Ϊ����
	private String status; // ״̬����Ϊ��Ӿ��ת��
	private Point targetPoint; // Ұ��Ŀ��λ��
	private int score; // Ұ�����
	private Rectangle rectangle;// ��ײ�߽�

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		if (this.id == 0) {// �����߽�����
			if (this.getDirection() == -1) {
				rectangle.setRect((int) this.getPoint().getX(), (int) this.getPoint().getY(),
						this.getWidth() * (1 - 1.0 / this.getSize()) * FishUtil.RATE,
						this.getHeight() * (1 - 1.0 / this.getSize()));
			} else if (this.getDirection() == 1) {
				rectangle.setRect((int) this.getPoint().getX() + this.getWidth() * (0.75 - FishUtil.RATE),
						(int) this.getPoint().getY(), this.getWidth() * (1 - 1.0 / this.getSize()) * FishUtil.RATE,
						this.getHeight() * (1 - 1.0 / this.getSize()));
			}
		} else { // Ұ��߽�����
			rectangle.setRect((int) this.getPoint().getX(), (int) this.getPoint().getY(),
					this.getWidth() * (1 - 1.0 / this.getSize()), this.getHeight() * (1 - 1.0 / this.getSize()));
		}
		this.rectangle = rectangle;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		if (this.direction != 0) {
			if (this.direction != direction) {
				this.setStatus(FishUtil.FISH_TURN);
			}
		}
		this.direction = direction;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (this.status != null) {
			if (this.status != status) {
				BufferedImage image = (BufferedImage) FishUtil.IMAGES.get(status + "_" + this.getId() + ".png");
				this.setCount(image.getWidth() / this.getWidth());
				this.setCurIndex(0);
				this.setImage(image);
			}
		}
		this.status = status;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCurIndex() {
		return curIndex;
	}

	public void setCurIndex(int curIndex) {
		this.curIndex = curIndex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Point getTargetPoint() {
		return targetPoint;
	}

	public void setTargetPoint(Point targetPoint) {
		this.targetPoint = targetPoint;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
