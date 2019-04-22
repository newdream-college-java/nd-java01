/*输入三个整数，如果这三个整数都相等，那么输出“这三个数相等”。否则再判断这三个数之和是否大于1000，如果大于1000输入“这三个数之和大于1000”否则输出“这三个数之和不大于1000”（嵌套if）*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入三个整数");
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	if(a==b&&b==c){
		System.out.println("这三个数相等");
			}else if((a+b+c)>1000){
			System.out.println("这三个数之和大于1000");
			}else{
				System.out.println("这三个数之和不大于1000");
				}
	}

}