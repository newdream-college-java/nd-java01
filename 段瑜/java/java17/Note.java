package ��ҵ;

public class Note extends Cellphone implements Broadcast, Shooting, Internet{

	@Override
	public void sending() {
		// TODO Auto-generated method stub
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ......");
	}

	@Override
	public void Dialing() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��Ƶͨ��......");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		setType("����Note");
		System.out.println("����һ���ź�Ϊ"+getType()+"��С���ֻ�");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("�ѿ����ƶ�����");
	}

	@Override
	public void shooting() {
		// TODO Auto-generated method stub
		System.out.println("����......���ճɹ�");
	}

	@Override
	public void broadcast() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ������Ƶ��Сʱ����.....");
	}

}
