package exercise2;

public class OldPhoneImpl extends Phone implements OldPhone{
	
	public OldPhoneImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OldPhoneImpl(String brand, String type) {
		super(brand, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Call() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����ͨ��");
	}

	@Override
	public void SetWord() {
		// TODO Auto-generated method stub
		System.out.println("����������Ϣ");
	}

}
