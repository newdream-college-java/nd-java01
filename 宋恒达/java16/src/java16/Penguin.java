package java16;

public class Penguin extends Pet{
	public Penguin() {
		setType("���");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		setHealth(getHealth()+5);
		System.out.println(getType()+getName()+"�Ա���������ֵ����5��");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println(getType()+getName()+"������Ӿ������ֵ����10�����ܶ�����5��");
	}

}
