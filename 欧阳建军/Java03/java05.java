import java.util.Scanner;
public class java05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������������");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d;
		if(a>b){
			d=a;
			a=b;
			b=d;

		}if(a>c){
			d=a;
			a=c;
			c=d;
			
		}if(b>c){
			d=b;
			b=c;
			c=d;


		}
		System.out.print("��������С��������Ϊ��\n"+a+"\n"+b+"\n"+c+"\n");

	}



}