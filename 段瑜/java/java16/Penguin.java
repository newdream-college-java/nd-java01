package �������;

public class Penguin extends Pet{
	public void eat() {
		System.out.println("����骳Ա���������ֵ����5.....");
		setHealth(getHealth()+5);
	}
	public void eat1(){
		System.out.println("�����������Ӿ������ֵ����10������ֵ����5��");
		setAffinity(getAffinity()+5);
		setHealth(getHealth()-10);
	}
}
