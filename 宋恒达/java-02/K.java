//输入两个整数，放入两个变量a和b中，编程将a和b中的值进行交换，并输出
import java.util.Scanner;
public class K{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数a");
		int a=input.nextInt();
		System.out.println("请输入一个整数b");
		int b=input.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("a和b值交换后a的值为"+a+"，b的值为"+b);
	}
}