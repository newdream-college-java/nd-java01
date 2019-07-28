package com.java.java16;

public class QiE extends Pet {
	public void show() {
		setName("楠楠");
		System.out.println("企鹅"+getName()+"吃饱了！"+"健康值增加5。");
		setHeath(getHeath()+5);
		
	}

	@Override
	public void Ser() {
		System.out.println("企鹅"+getName()+"正在游泳。健康值减少10，"+"亲密度加5！");
		setLove(getLove()+5);
		
	}

}
