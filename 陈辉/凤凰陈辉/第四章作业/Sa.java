import java.util.Scanner;
public class Sa{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("输入3个整数");
	int a =input.nextInt();
	int b =input.nextInt();
	int c =input.nextInt();
	if(a==b&&b==c){
		System.out.println("这3个数相等");	
	}else if((a+b+c)>1000){
		System.out.println("之和大于1000");

	}else {
		System.out.println("这3个数之和不大于1000");
	}


	}


}