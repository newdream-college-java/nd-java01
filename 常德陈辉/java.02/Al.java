/*输入一个小数，然后输出其整数部分和小数部分，格式如下
小数	整数部分	小数部分
3.14	3		0.14*/
import java.util.Scanner;
public class Al{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入一个小数:");
	double number=input.nextDouble();
	double a,b;
	a=(int)number;
	b=number-a;
	System.out.print("小数\t整数部分\t小数部分\n\n"+number+"\t"+a+"\t\t"+b);
	}

}