//输入两个小数，存入a和b中，编程实现a与b变量中的值的交换
//最后输出a与b中的值
import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个小数a");
		double a=input.nextDouble();
		System.out.println("请输入一个小数b");
		double b=input.nextDouble();
		double c=a;
		a=b;
		b=c;
		System.out.println("a和b交换后a的值为"+a+",b的值为"+b);		
	}
}