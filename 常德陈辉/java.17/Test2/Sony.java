package Test2;

public class Sony implements Music,Note,Phone{

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ�������֡���Ѫ��������������");
	}

	@Override
	public void note() {
		// TODO Auto-generated method stub
		System.out.println("����������Ϣ������������");
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����ͨ��������������");
	}
	public void sj(){
		System.out.println("����һ���ͺ�ΪG502c�����ᰮ�����ֻ���");
	}
	
}
