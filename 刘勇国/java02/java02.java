import java.util.Scanner;
public class java02{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("输入正方形的边长");
	int a = input.nextInt();
	System.out.println("正方形的周长为"+4*a);
	System.out.println("正方形的面积为"+a*a);
	}
}