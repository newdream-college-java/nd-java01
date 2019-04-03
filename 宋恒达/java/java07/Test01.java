/**
**编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据4，则
**输出4！=4*3*2*1=24.要求限制输入1~10，否则提示错误。
**/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=-1;
		while(true){	
			a=-1;
			System.out.print("请输入一个1~10的正整数:");
			a=input.nextInt();
			if((a>=1)&&(a<=10)){
				break;
			}else{
			System.out.println("输入错误");
			}
		}
		int sum=a;
		System.out.print(a);
		for(int i=a-1;i>=1;i--){
			sum*=i;
			System.out.print("*"+i);
		}
		System.out.println("="+sum);
	}
}