package ��ҵ;

public class Zilei extends Fulei implements Yingping,Shiping,Paizhao,Tongxun,Duanxin {
	public void name() {
		System.out.println("����һ���ͺ�ΪG502c�����ᰮ�����ֻ�");
	}

	public void sp() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ������Ƶ��Сʱ����");
	}
	@Override
	public void yp() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ�������֡���ѩ��");
	}
	public void dx() {
		// TODO Auto-generated method stub
		System.out.println("����������Ϣ");
	}
	@Override
	public void tx() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����ͨ��");
	}
	@Override
	public void pz() {
		// TODO Auto-generated method stub
		System.out.println("����----���ճɹ�");
	}
	public void sw() {
		System.out.println("��ʼ�����ƶ�����");
	}
}
