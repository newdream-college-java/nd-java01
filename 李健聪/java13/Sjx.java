package ��ʮ������ҵ;

public class Sjx {
	public Sjx(int a,int b,int c){
		if(a+b>c&&a+c>b&&b+c>a){
			if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b){
				System.out.println("���Ǹ�ֱ��������");
				System.exit(-1);
			}
			if(a*a>b*b+c*c||b*b>a*a+c*c||c*c>a*a+b*b){
				System.out.println("���Ǹ��۽�������");
				System.exit(-1);
			}else{
				System.out.println("���Ǹ����������");
				System.exit(-1);
			}
		}else{
			System.out.println("�ⲻ�Ǹ�������");
			System.exit(-1);
		}
		
			
		
	}
}
