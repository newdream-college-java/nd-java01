package hwDogCat;

public class Penguin extends Pet{
	public void eat(){
		System.out.println("企鹅楠楠吃饱啦！健康值增加5。");
		setHealth(getHealth()+5);
	}
	public void play(){
		System.out.println("企鹅楠楠正在游泳，健康值减少10，亲密值增加5！");
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println("当前健康值为："+getHealth()+"当前亲密度为："+getLove());
	}
}
