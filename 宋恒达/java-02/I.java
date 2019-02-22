//输入一个变量保存正方形的边长，计算此正方形的周长及面积
import java.util.Scanner;
public class I{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入正方形的边长");
		double a=input.nextDouble();
		System.out.println("正方形的周长为"+(a*4));
		System.out.println("正方形的面积为"+(a*a));
	}
}