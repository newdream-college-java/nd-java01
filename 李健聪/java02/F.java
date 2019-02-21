//互换值
import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示
		System.out.println("请输入一个小数");
		double a = input.nextDouble();
		System.out.println("再输入一个小数");
		double b =input.nextDouble();
		double c;
		c=a;
		a=b;
		b=c;
		System.out.println("互换后a与b的值为"+a+"\t"+b);
	}
}
/*

*/