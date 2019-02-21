import java.util.Scanner;
public class N{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个小数");
		double a=input.nextDouble();
		int b=(int)a;
		double c=a-b;
		System.out.println("整数部分为"+b+"小数部分为"+c);
	}
}