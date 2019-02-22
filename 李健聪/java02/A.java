import java.util.Scanner;
public class A{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入一个四位数的整数");
	int a = input.nextInt();
	int b =a%10;
	int c =a/10%10;
	int d =a/100%10;
	int e =a/1000%10;
	System.out.println("该整数的个位十位百位千位分别为");
	System.out.println("个位"+b+"\t十位"+c+"\t百位"+d+"\t千位"+e);
	}
}