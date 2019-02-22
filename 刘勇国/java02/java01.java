import java.util.Scanner;
public class java01{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入两个小数");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c;
	c = a;
	a = b;
	b = c;
	System.out.println("a="+a+"\t\tb="+b);
	}
}