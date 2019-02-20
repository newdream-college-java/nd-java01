import java.util.Scanner;
public class L{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a = input.nextInt();
		int b=a/24;
		int c=a%24;
		System.out.print(b+"天零"+c+"个小时");

	}



}