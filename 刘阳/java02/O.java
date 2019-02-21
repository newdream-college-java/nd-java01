import java.util.Scanner;
public class O{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请您输入一个小数:");
		//输入一个小数
		double a=input.nextDouble();
		int b=(int)a;
		double c=a-b;
		System.out.println("小数"+"\t"+"整数部份"+"\t"+"小数部份");
		System.out.print(a+"\t  "+b+"\t\t"+String.format("%.2f",c));//保留小数点后两位小数
	}
}		