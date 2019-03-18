package java16;

public class Dog extends Pet{
	public Dog() {
		setType("狗狗");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		setHealth(getHealth()+3);
		System.out.println(getType()+getName()+"吃饱啦，健康值增加3！");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println(getType()+getName()+"正在接飞盘，健康值减少10，亲密度增加5！");
	}

}
