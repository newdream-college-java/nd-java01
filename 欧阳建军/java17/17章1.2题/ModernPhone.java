package ��17�½ӿ��ֻ�1_2��ҵ;

public class ModernPhone extends MobilePhone implements PlayMusic,SendMessage,CallSomeone,Vedio,TakePhotoes,MobileInternet{
	
	public ModernPhone(String type){
		setType(type);
	}
	@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("����һ��"+getType());
			
		}
	

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("����Ÿ���.....");
		
		
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ");
		
	}

	@Override
	public void callSomeone() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��Ƶͨ��");
	}

	@Override
	public void Vedio() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ������Ƶ��Сʱ����");
	}

	@Override
	public void takePhotoes() {
		// TODO Auto-generated method stub
		System.out.println("����......���ճɹ�");
		
	}


	@Override
	public void startInternet() {
		// TODO Auto-generated method stub
		System.out.println("�Ѿ������ƶ�����.....");
	}
	
}
