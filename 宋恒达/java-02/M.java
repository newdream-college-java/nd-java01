import java.util.Scanner;
public class M{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����λ��������");
		int num=input.nextInt();
		int a=num%10;
		int b=num/10%10;
		int c=num/100;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		int d=a;
		a=c;
		c=d;
		System.out.println("����ֵ�����Ϊ"+c+""+b+""+a);
	}
}