package ʮ������ҵ;
class Base{		
	public Base(){
		System.out.println("base");
	}
}
class Child extends Base{
	public Child(){
		System.out.println("Child");
	}
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
	}

}
/*���н��Ϊ base���� Child ��ΪChild��new�˶���c��
 * �����Զ����ø�����޲ι��췽�����base��Ȼ���ڵ���Chlid���޲ι��췽�����Chile*/
