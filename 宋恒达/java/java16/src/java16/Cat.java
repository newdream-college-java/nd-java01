package java16;

public class Cat extends Pet{
	public Cat() {
		setType("è��");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		setHealth(getHealth()+4);
		System.out.println(getType()+getName()+"�Ա���������ֵ����4��");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println(getType()+getName()+"����ֵ����10�����ܶ�����5��");
	}

}
