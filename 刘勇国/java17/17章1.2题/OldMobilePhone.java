package ��17�½ӿ��ֻ�1_2��ҵ;

public class OldMobilePhone extends MobilePhone implements CallSomeone,PlayMusic,SendMessage{

	public OldMobilePhone(String type) {
		setType(type);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("����һ��"+getType());
		
	}

	@Override
	public void callSomeone() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����ͨ��........");
		
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ�������֡���ѩ��........");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����������Ϣ........");
	}

}
