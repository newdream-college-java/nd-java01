/**
**	编程实现迷你计算器：支持+、-、*、/，从控制台输入2个操作数，输出运算结果。
**/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner	input=new Scanner(System.in);
		System.out.println("1.\t+");
		System.out.println("2.\t-");
		System.out.println("3.\t*");
		System.out.println("3.\t/");
		System.out.println();
		System.out.print("请选择需要执行的操作（输入前面的数字）\t");
		int a=input.nextInt();
		System.out.println("请输入两个操作数");
		double b=input.nextDouble();
		double c=input.nextDouble();
		switch(a){
			case 1:
				System.out.println(b+" + "+c+" = "+(b+c));
				break;
			case 2:
				System.out.println(b+" - "+c+" = "+(b-c));
				break;
			case 3:
				System.out.println(b+" * "+c+" = "+(b*c));
				break;
			case 4:
				System.out.println(b+" / "+c+" = "+(b/c));
				break;
			default:
				System.out.println("无法进行此运算");
		}
	}
}