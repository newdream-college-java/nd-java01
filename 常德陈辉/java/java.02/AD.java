/*输入两个小数，存入a,b中，编程实现a与b变量中的值交换，最后输出a与b中的值。double*/
import java.util.Scanner;
public class AD{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		//提示double
		System.out.print("请输入数值a=");
		double a=input.nextDouble();
		System.out.print("请输入数值b=");
		double b=input.nextDouble();
		System.out.println("交换前a="+a+"\tb="+b);
		double c;
		c=a;
		a=b;
		b=c;
		System.out.print("交换后");
		System.out.println("a="+a+"\tb="+b);
		
	}

}