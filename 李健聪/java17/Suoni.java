package ��ҵ;

public class Suoni implements PlayMusic,SendText,Converse {
	public void zishu(){
		System.out.println("����һ���ͺ�ΪG502c�����ᰮ�����ֻ�");
	}
	public void sendtext(){
		System.out.println("����������Ϣ");
	}

	@Override
	public void converse() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����ͨ������������");
	}

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
	System.out.println("�������֡���Ѫ����������");	
	}
}
