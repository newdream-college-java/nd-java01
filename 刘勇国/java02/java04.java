import java.util.Scanner;
public class java04{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入两个整数");
	int a = input.nextInt();
	int b = input.nextInt();
	System.out.println("a="+a+"b="+b);
	int c;
	c = a;
	a = b;
	b = c;
	System.out.println("a="+a+"b="+b);
	}
}