package java16;

public class Cat extends Pet{
	public Cat() {
		setType("猫咪");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		setHealth(getHealth()+4);
		System.out.println(getType()+getName()+"吃饱啦，健康值增加4！");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println(getType()+getName()+"健康值减少10，亲密度增加5！");
	}

}
