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
		System.out.println("����2������");
		a=input.nextInt();
		p=input.nextInt();
		if(a>b){
			max=a;
			System.out.println("���ֵΪ��"+max);
		}else{
			max=b;
			System.out.println("���ֵΪ��"+max);
		}
	}
	public void show1(){
		int k=0;
		Scanner input=new Scanner(System.in);
		System.out.println("����һ������");
		b=input.nextInt();
		k=b%10;
		System.out.println(k);
	}
	public void show2(){
		int op=0;
		Scanner input=new Scanner(System.in);
		System.out.println("����һ������");
		c=input.nextInt();
		op=c*c*c;
		System.out.println("����Ϊ��"+op);
	}
	public void show3(){
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("����һ������");
		d=input.nextInt();
		for(int i=1;i<=d;i++){
			sum+=i;
		}
		System.out.println("��Ϊ��"+sum);
	}
}
