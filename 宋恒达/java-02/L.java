//输入一个整数，代表有n个小时，计算n个小时等于多少天零多少个小时，比如输入
//25，那么输出“1天零1个小时”
import java.util.Scanner;
public class L{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入小时数");
		int a=input.nextInt();
		int b=a/24;
		int c=a%24;
		System.out.println(a+"个小时等于"+b+"天"+c+"个小时");
	}
}