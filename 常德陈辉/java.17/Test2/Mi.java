package Test2;

public class Mi implements Movie, Internet, Note,Photo,Phone {

	@Override
	public void movue() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ������Ƶ��Сʱ����������������");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("�������ƶ����硣����������");
	}

	@Override
	public void note() {
		// TODO Auto-generated method stub
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ������������");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("���ꡣ���������������ճɹ�");
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��Ƶͨ������������");
	}
	public void sj(){
		System.out.println("����һ���ͺ�Ϊ����Note��С���ֻ���");
	}
}
