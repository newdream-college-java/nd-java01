import java.util.Scanner;
public class java05{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入三个整数");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	if(a==b&&b==c){
		System.out.println("这三个数相等");
	}else if((a+b+c)>1000){
		System.out.println("这三个数之和大于1000");
	}else if((a+b+c)<1000){
		System.out.println("这三个数之和不大于1000");
	}
	}
}