package ��ҵ;

public class G502c extends Cellphone implements Broadcast, Shooting, Internet {

	@Override
	public void internet() {
		System.out.println("�ѿ����ƶ�����");

	}

	@Override
	public void shooting() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void broadcast() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ�������֡���Ѫ��.....");
	}

	@Override
	public void sending() {
		// TODO Auto-generated method stub
		System.out.println("����������Ϣ��������");
	}

	@Override
	public void Dialing() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����ͨ��");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		setType("G502c");
		System.out.println("����һ���ͺ�Ϊ"+getType()+"�����ᰮ�����ֻ�");
	}

	

}
