package ��ʮ������ҵ;

public class ShuXueJia {
	public void s(int a,int b){
		if(a>b){
			System.out.println("���ֵΪ��"+a);
		}else{
			System.out.println("���ֵΪ��"+b);
		}
	}
	public void sh(int a){
		System.out.println(a+"�ĸ�λ��Ϊ"+a%10);
	}
	public void sho(int a){
		System.out.println("a������Ϊ"+(a*a*a));
	}
	public int show(int a){
		int sum=0;
		if(a>0){
			for(int i=1;i<=a;i++){
				sum+=i;
			}
			
		}else{
			System.out.println("����������������������");
		}
		System.out.println(sum);
		return sum;
	}
}
