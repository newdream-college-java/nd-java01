package com.java.java16;

public class Dog extends Pet {
	public Dog(){
		setName("欧欧");
		setHeath(60);
		setLove(80);
	}

	public void show() {		
		System.out.println("狗狗"+getName()+"吃饱了！"+"健康值增加3。");
		setHeath(getHeath()+3);
	}
	public void Ser(){
		System.out.println("狗狗"+getName()+"正在接飞盘。健康值减少10，"+"亲密度加5！");
		setLove(getLove()+5);
	}

}
