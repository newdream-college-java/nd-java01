package �������;

public  class Dog extends Pet{
	
	public void eat() {
		System.out.println("����ŷŷ�Ա���������ֵ����3.....");
		setHealth(getHealth()+3);
	}
	public void eat1(){
		System.out.println("����ŷŷ���ڽӷ��̡�����ֵ����10������ֵ����5��");
		setAffinity(getAffinity()+5);
		setHealth(getHealth()-10);
	}
}
