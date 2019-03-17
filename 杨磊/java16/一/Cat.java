package com.nd.zuoye.yl.yi;

public class Cat extends Pet {
	public void eat() {
		System.out.println("猫咪汤姆吃饱啦！健康值加4。");
		setHealth(getHealth()+4);
		
	}

	public void bPlay() {
		System.out.println("猫咪汤姆正在玩毛线，健康值减少8，亲密度增加4。");
		setHealth(getHealth()-8);
		setLove(getLove()+4);
		
	}
}
