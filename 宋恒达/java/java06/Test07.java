/**
**循环输入大于0的数字进行累加
**知道输入的数字为0，就结束循环，并最后输出累加结果
**/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		boolean flag=true;
		double sum=0;
		double a=-1;
		do{
			System.out.println("请输入大于0的累加数字，或者输入0退出计算:");
			a=input.nextDouble();
			if(a==0){
				flag=false;
			}else{
				sum+=a;
			}
		}while(flag);
		System.out.println("累加和为"+sum);
	}
}