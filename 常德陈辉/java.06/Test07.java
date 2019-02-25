/*循环输入大于0的数字进行累加，直到输入的数字为0，就结束循环，并最后输出累加的结果*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入加S数：");
	double a=input.nextDouble();
	double num=0;
	for( ;a!=0;){
		System.out.print("请输入被加的数：");
		num+=a;
		a=input.nextDouble();
		}
	System.out.print("和为："+num);
	}

}