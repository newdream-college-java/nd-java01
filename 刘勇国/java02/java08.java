import java.util.Scanner;
public class java08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个小数");
		double n = input.nextDouble();
		int a = (int)n;
		double b = n-a;
		System.out.println("整数部分为："+a+"\t\t小数部分为："+b);
	}
}