/*输入两个整数，放入到两个变量a与b中，编程将a与b中的值交换，输出。*/
import java.util.Scanner;
public class Ag{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入整数数值a=");
		int a=input.nextInt();
		System.out.print("请输入整数数值b=");
		int b=input.nextInt();
		System.out.println("交换前a="+a+"\tb="+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.print("交换后");
		System.out.print("a="+a+"\tb="+b);
	}
}