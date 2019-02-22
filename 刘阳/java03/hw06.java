import java.util.Scanner;
public class hw06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示
		System.out.print("请输入一个整数");
		int num = input.nextInt();
		if(num%2==0){
			System.out.print("这个数是偶数");
		}else{
			System.out.print("这个数是奇数");
		}
		
		
	}
}