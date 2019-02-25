import java.util.Scanner;
public class C{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个小数：");
		double a=input.nextDouble();
		System.out.println("请输入一个小数：");
		double b=input.nextDouble();
		double c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+"\tb="+b);
}
}