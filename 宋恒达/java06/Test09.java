/**
**商场对顾客的年龄层次进行调查，计算各年龄层次的顾客比例
**/
import java.util.Scanner;
public class Test09{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=-1;
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"位顾客的年龄:");
			a=input.nextInt();
			if(a<=30){
				sum1++;
			}else{
				sum2++;
			}
		}
		System.out.println("30岁以下的比例是"+(sum1*1.0)/10*100+"%");
		System.out.println("30岁以上的比例是"+(sum2*1.0)/10*100+"%");
	}
}