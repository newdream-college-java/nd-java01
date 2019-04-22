package hwDogCat;

public class Dog extends Pet{
	public void eat(){
		System.out.println("狗狗欧欧吃饱啦！健康值增加3。");
		setHealth(getHealth()+3);
	}
	public void play(){
		System.out.println("狗狗欧欧正在接飞盘，健康值减少10，亲密值增加5！");
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println("当前健康值为："+getHealth()+"当前亲密度为："+getLove());
	}
}
