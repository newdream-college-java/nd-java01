package java13;
import java.util.Scanner;
public class Sxuejia {
	int a,p;
	int b;
	int c;
	int d;
	public void show(){
		int max=0;
		Scanner input=new Scanner(System.in);
		System.out.println("输入2个整数");
		a=input.nextInt();
		p=input.nextInt();
		if(a>b){
			max=a;
			System.out.println("最大值为："+max);
		}else{
			max=b;
			System.out.println("最大值为："+max);
		}
	}
	public void show1(){
		int k=0;
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个整数");
		b=input.nextInt();
		k=b%10;
		System.out.println(k);
	}
	public void show2(){
		int op=0;
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个整数");
		c=input.nextInt();
		op=c*c*c;
		System.out.println("立方为："+op);
	}
	public void show3(){
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个整数");
		d=input.nextInt();
		for(int i=1;i<=d;i++){
			sum+=i;
		}
		System.out.println("和为："+sum);
	}
}
