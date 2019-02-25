/*输入一个变量保存正方形的边长，计算此正方形的周长及面积*/
import java.util.Scanner;
public class Ae{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入正方形边长数值为:");
		double a=input.nextDouble();
		double z,m;
		z=a*4;
		m=a*a;
		System.out.print("周长="+z+"\n面积="+m);
	}

}