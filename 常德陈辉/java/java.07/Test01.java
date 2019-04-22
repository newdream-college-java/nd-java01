/*编程实现接收用户输入的正整数，输出该数的阶乘。列如：输入数据4，则输出4！=4*3*2*1=24.要求限制输入1~10，否则提示错误*/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入正整数：");
	int a=input.nextInt();
	int i,sum=1,j=1;
	if(a>0&&a<11){
		for(i=a;;i--){
			if(i!=0){		
				System.out.print(i+"*");
			}else{
				System.out.print("\b="+sum+"\n");
				break;
			}
			sum*=i;
		}
		}else{
			System.out.print("输入错误！");
		}
	
	}

}