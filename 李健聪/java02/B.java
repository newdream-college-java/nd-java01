import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入两个整数");
		int a = input.nextInt();
		int b =input.nextInt();
		System.out.println("a与b的值交换前为"+a+"\t"+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a与b的值交换后为"+a+"\t"+b);
	}
}
