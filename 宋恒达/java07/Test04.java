/**
**用户可以无限的输入数字，请统计用户输入的数字中正数的个数，负数的个数
**，0的个数。直到用户输入999就结束，输出统计结果
**/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum1=0;
		int sum2=0;
		int sum3=0;
		while(true){
			System.out.print("请输入一个整数（输入999结束）:");
			int a=input.nextInt();
			if(a==999){
				break;
			}
			else if(a>0){
				sum1++;
			}else if(a==0){
				sum2++;
			}else if(a<0){
				sum3++;
			}
		}
		System.out.println("正数个数为"+sum1+"\t负数个数为"+sum3+"\t0个数为"+sum2);
	}
}