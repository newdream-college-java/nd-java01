package hwDogCat;

public class Cat extends Pet {
	public void eat(){
		System.out.println("è����ķ�Ա���������ֵ����4��");
		setHealth(getHealth()+4);
	}
	public void play(){
		System.out.println("è����ķ����ץ���𣬽���ֵ����20������ֵ����5��");
		setHealth(getHealth()-20);
		setLove(getLove()+5);
		System.out.println("��ǰ����ֵΪ��"+getHealth()+"��ǰ���ܶ�Ϊ��"+getLove());
	}
}
