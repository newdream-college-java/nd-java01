package com.nd.zuoye.yl.yi;

public class Penguin extends Pet {
	public void eat() {
		System.out.println("企鹅楠楠吃饱啦！健康值加5。");
		setHealth(getHealth()+5);
		
	}

	public void bPlay() {
		System.out.println("企鹅楠楠正在游泳，健康值减少10，亲密度增加5。");
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		
	}
}
