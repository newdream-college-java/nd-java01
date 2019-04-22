package cn.zuoye;

public class Sxj {
	public int Max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	public int G(int a){
		int sum=0;
		sum=a%10;
		return sum;
	}
	public int Lf(int a){
		int sum=0;
		sum=a*a*a;
		return sum;
	}
	public int H(int a){
		int sum=0;
		for (int i = 1; i <=a; i++) {
			sum+=i;	
		}
		return sum;
	}
}
