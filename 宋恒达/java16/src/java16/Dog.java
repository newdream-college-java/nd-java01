package java16;

public class Dog extends Pet{
	public Dog() {
		setType("����");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		setHealth(getHealth()+3);
		System.out.println(getType()+getName()+"�Ա���������ֵ����3��");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println(getType()+getName()+"���ڽӷ��̣�����ֵ����10�����ܶ�����5��");
	}

}
