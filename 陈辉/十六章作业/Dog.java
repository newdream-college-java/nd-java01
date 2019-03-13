package java16;

public class Dog extends Pet {	
	public void eat(){
		System.out.println("狗狗欧欧吃饱了！健康值增加"+3);
		System.out.println("主人和狗狗玩接飞盘，健康值减少"+(-10)+"亲密值增加"+5);
	}
}
