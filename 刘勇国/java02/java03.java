/*输入一个四位整数求每位上的数*/
import java.util.Scanner;
public class java03{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("输入一个四位整数");
	int n = input.nextInt();
	int gw = n%10;
	int sw = n/10%10;
	int bw = n/100%10;
	int qw = n/1000;
	System.out.println("个位为："+gw+"十位为："+sw+"百位为："+bw+"千位为："+qw);
	}
}