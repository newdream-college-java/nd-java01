package ��17�½ӿڳ���Ա1_1��ҵ;

public class SoftEngineer extends Programmer implements WriteCode,IntroduceBusiness {
	private String job;
	@Override
	public void showMyJob() {
		job="�������ʦ";
		// TODO Auto-generated method stub
		System.out.println("����һ��"+job+"�ҵ����ֽ�"+getName());
		
	}
	@Override
	public void writeCode() {
		// TODO Auto-generated method stub
		System.out.println("�һ�д����");
		
	}
	@Override
	public void introduceBusiness() {
		// TODO Auto-generated method stub
		System.out.println("�һὲҵ��");
		
	}
	
}
