package exercise2;

public class NewPhoneImpl extends Phone implements NewPhone{

	@Override
	public void playMusic(String name) {
		// TODO Auto-generated method stub
		System.out.println("���ڲ������֡�"+name+"��");
	}

	@Override
	public void playVideo(String name) {
		// TODO Auto-generated method stub
		System.out.println("���ڲ�����Ƶ"+name);
	}

	@Override
	public void playPhoto() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	public void playWifi() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	@Override
	public void Call() {
		// TODO Auto-generated method stub
		System.out.println("��������ͨ��");
	}

	@Override
	public void SetWord() {
		// TODO Auto-generated method stub
		System.out.println("���ڷ�������");
	}

	@Override
	public void setImage() {
		// TODO Auto-generated method stub
		System.out.println("���ʹ�ͼƬ��������Ϣ");
	}

}
