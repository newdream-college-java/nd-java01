package ��ҵ;

public class SmartPhone implements Gointernet,PlayMusic,TakePhoto,SendText,Converse {

	
	public void nb(){
		System.out.println("����һ���ͺ�Ϊ����Note��С���ֻ�");
	}
	public void converse() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��Ƶͨ����������");
	}

	@Override
	public void sendtext() {
		// TODO Auto-generated method stub
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ��������");
	}

	@Override
	public void takephoto() {
		// TODO Auto-generated method stub
		System.out.println("�ǲ��������������ճɹ�");
	}

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ������Ƶ��Сʱ������������");
	}

	@Override
	public void gointernet() {
		// TODO Auto-generated method stub
		System.out.println("�Ѿ������ƶ�����");
	}
	
}
