package 人与宠物;

public class Penguin extends Pet{
	public void eat() {
		System.out.println("企鹅楠楠吃饱啦，健康值增加5.....");
		setHealth(getHealth()+5);
	}
	public void eat1(){
		System.out.println("企鹅楠楠正在游泳。健康值减少10，亲密值增加5！");
		setAffinity(getAffinity()+5);
		setHealth(getHealth()-10);
	}
}
