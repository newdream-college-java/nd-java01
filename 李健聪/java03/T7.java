import java.util.Scanner;
public class T7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数");
		int num = input.nextInt();
		if(num%2==0){
			System.out.print(num+"是偶数");
		}else{
			System.out.print(num+"是奇数");
		}
	}
}