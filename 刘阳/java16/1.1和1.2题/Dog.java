package hwDogCat;

public class Dog extends Pet{
	public void eat(){
		System.out.println("����ŷŷ�Ա���������ֵ����3��");
		setHealth(getHealth()+3);
	}
	public void play(){
		System.out.println("����ŷŷ���ڽӷ��̣�����ֵ����10������ֵ����5��");
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println("��ǰ����ֵΪ��"+getHealth()+"��ǰ���ܶ�Ϊ��"+getLove());
	}
}
