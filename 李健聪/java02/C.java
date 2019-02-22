import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数，输入的整数就代表多少个小时");
		int a = input.nextInt();
		int b;
		b=a/24;
		int c;
		c=a%24;
		System.out.println("\""+b+"天零"+c+"个小时\"");
	}
}