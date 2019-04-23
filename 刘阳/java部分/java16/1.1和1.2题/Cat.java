package hwDogCat;

public class Cat extends Pet {
	public void eat(){
		System.out.println("猫咪汤姆吃饱啦！健康值增加4。");
		setHealth(getHealth()+4);
	}
	public void play(){
		System.out.println("猫咪汤姆正在抓杰瑞，健康值减少20，亲密值增加5！");
		setHealth(getHealth()-20);
		setLove(getLove()+5);
		System.out.println("当前健康值为："+getHealth()+"当前亲密度为："+getLove());
	}
}
