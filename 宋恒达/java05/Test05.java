/**
**循环要求用户输入一个0到2之间的整数，
**如果输入的是0就输出“你出的是石头”，
**如果输入的是0就输出“你出的是剪刀”，
**如果输入的是2就输出“你出的是布”
**如果是其它数就结束程序
**/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
   		boolean flag=true;
		Scanner input=new Scanner(System.in);
		while(flag){
			System.out.print("请输入一个0-2的整数:");
			int a=input.nextInt();
			switch(a){
				case 0:
					System.out.println("你出的是石头");
					break;
				case 1:
					System.out.println("你出的是剪刀");
					break;
				case 2:
					System.out.println("你出的是布");
					break;
				default:
					flag=false;
					System.out.println("输入指令错误");
					System.exit(-1);
				
			}
		
		}
	}
}