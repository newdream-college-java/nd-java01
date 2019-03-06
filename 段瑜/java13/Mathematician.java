package ื๗าต;

public class Mathematician {
	int sum;
	public int show(int a,int b){
		if(a>=b){
			sum=a;
			System.out.println(sum);
		}else {
			sum=b;
			System.out.println(sum);
		}
		return b;	
	}
	public int show1(int a){
		sum=a%10;
		System.out.println(sum);
		return a;
	}
	public int show2(int a){
		sum=a*a*a;
		System.out.println(sum);
		return a;
	}
	public int show3(int a){
		for (int i = 0; i <=a; i++) {
			sum+=i;
		}
		System.out.println(sum);
		return a;
	}
}
