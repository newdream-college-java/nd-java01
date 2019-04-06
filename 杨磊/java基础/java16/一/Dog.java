package com.nd.zuoye.yl.yi;

public class Dog extends Pet {

	public void eat() {
		System.out.println("狗狗欧欧吃饱啦！健康值加3。");
		setHealth(getHealth()+3);
		
	}

	public void bPlay() {
		System.out.println("狗狗欧欧正在接飞盘，健康值减少10，亲密度增加5。");
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		
	}

}
