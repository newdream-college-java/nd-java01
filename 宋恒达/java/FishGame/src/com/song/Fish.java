package com.song;

import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/*
 * 鱼类
 */
public class Fish {
	private Image image; // 图片对象
	private Point point; // 图片位置
	private int width; // 图片宽
	private int height; // 图片高
	private int id; // 图片编号
	private int curIndex = 0; // 图片下标
	private int count; // 图片个数
	private int size; // 图片缩放比例
	private int direction; // 方向，分为左右
	private String status; // 状态，分为游泳和转向
	private Point targetPoint; // 野鱼目标位置
	private int score; // 野鱼分数
	private Rectangle rectangle;// 碰撞边界

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		if (this.id == 0) {// 玩家鱼边界设置
			if (this.getDirection() == -1) {
				rectangle.setRect((int) this.getPoint().getX(), (int) this.getPoint().getY(),
						this.getWidth() * (1 - 1.0 / this.getSize()) * FishUtil.RATE,
						this.getHeight() * (1 - 1.0 / this.getSize()));
			} else if (this.getDirection() == 1) {
				rectangle.setRect((int) this.getPoint().getX() + this.getWidth() * (0.75 - FishUtil.RATE),
						(int) this.getPoint().getY(), this.getWidth() * (1 - 1.0 / this.getSize()) * FishUtil.RATE,
						this.getHeight() * (1 - 1.0 / this.getSize()));
			}
		} else { // 野鱼边界设置
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
