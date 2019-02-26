import java.util.Scanner;
public class Hw05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示
		System.out.print("请输入三个整数：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int sum=a+b+c;
		if((a!=b)||(b!=c)||(a!=c)){
			if(sum>1000){
				System.out.print("这三个数之和大于1000");
			}else{
				System.out.print("这三个数之和不大于1000");
			}
		}else{
			System.out.print("这三个数相等");
		}
	}
}