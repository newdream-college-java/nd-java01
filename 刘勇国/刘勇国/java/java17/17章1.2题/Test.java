package ��17�½ӿ��ֻ�1_2��ҵ;

public class Test {
	public static void main(String[] args) {
		MobilePhone mp =new OldMobilePhone("�ͺ�ΪG502c�����ᰮ�����ֻ�:");
		mp.show();
		//��Ҫǿת
		OldMobilePhone omp=(OldMobilePhone)mp;
		omp.playMusic();
		omp.sendMessage();
		omp.callSomeone();
		MobilePhone mp1=new ModernPhone("�ͺ�Ϊ����Note��С���ֻ���");
		mp1.show();
		//ǿת
		System.out.print("\n");
		ModernPhone mmp=(ModernPhone)mp1;
		mmp.startInternet();
		mmp.Vedio();
		mmp.takePhotoes();
		mmp.sendMessage();
		mmp.callSomeone();
	}	
}
