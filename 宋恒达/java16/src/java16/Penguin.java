package java16;

public class Penguin extends Pet{
	public Penguin() {
		setType("企鹅");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		setHealth(getHealth()+5);
		System.out.println(getType()+getName()+"吃饱啦，健康值增加5！");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println(getType()+getName()+"正在游泳，健康值减少10，亲密度增加5！");
	}

}
