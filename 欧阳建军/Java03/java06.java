import java.util.Scanner;
public class java06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a=input.nextInt();
		int b=a%2;
		if(b==0){
			System.out.print("这个数是偶数");

		}else{
			System.out.print("这个数是奇数");
		}
		


	}





}