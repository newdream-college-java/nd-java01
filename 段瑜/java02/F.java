import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("����һ������");
		int a=input.nextInt();
		System.out.println("��������һ������");
		int b=input.nextInt();
		System.out.println("a="+a+"\tb="+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+"\tb="+b);
}
}