package hwDogCat;

public class Penguin extends Pet{
	public void eat(){
		System.out.println("����骳Ա���������ֵ����5��");
		setHealth(getHealth()+5);
	}
	public void play(){
		System.out.println("�����������Ӿ������ֵ����10������ֵ����5��");
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		System.out.println("��ǰ����ֵΪ��"+getHealth()+"��ǰ���ܶ�Ϊ��"+getLove());
	}
}
