package Test02;

public class Dog extends Pet{

	@Override
	public void game() {
		// TODO Auto-generated method stub
		setHealth(10);
		setLove(5);
		System.out.println("����ŷŷ���ڽӷ��̡�����ֵ����"+getHealth()+"����ֵ����"+getLove());
	}
	
}
