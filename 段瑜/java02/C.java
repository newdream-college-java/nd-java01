import java.util.Scanner;
public class C{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��С����");
		double a=input.nextDouble();
		System.out.println("������һ��С����");
		double b=input.nextDouble();
		double c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+"\tb="+b);
}
}