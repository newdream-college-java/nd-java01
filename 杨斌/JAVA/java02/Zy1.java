import java.util.Scanner;
public class Zy1{
	public static void main(String[] args){
		Scanner input =new Scanner (System.in);
		System.out.print("请输入a的值：");
		double a =input.nextDouble();
		System.out.print("请输入b的值：");
		double b =input.nextDouble();
		double c;
		c=a;
		a=b;
		b=c;
		System.out.print("a="+a+"\nb="+b);
		
	}
}