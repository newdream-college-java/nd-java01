/*输入一个整数，代表有n个小时，计算n个小时等于多少天零多少个小时。比如输入25，那么输出“1天零1个小时”*/
import java.util.Scanner;
public class Ah{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int a=input.nextInt();
		int b,c;
		b=a/24;
		c=a%24;
		System.out.print(b+"天零"+c+"个小时");
	}
}