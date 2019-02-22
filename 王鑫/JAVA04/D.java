import java.util.Scanner;

public class D{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a==b&&b==c){
			System.out.print("这三个数相等");
		}else if(a+b+c>1000){
			System.out.print("这三个数之和大于1000");
		}else{
			System.out.print("这三个数之和小于1000");
		}
	}
}