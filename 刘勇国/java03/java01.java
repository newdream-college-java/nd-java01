import java.util.Scanner;
public class java01{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入1个3位整数");
	int n = input.nextInt();
	int gw = n%10;
	int sw = n/10%10;
	int bw = n/100;
	if(bw>sw||sw>gw){
		System.out.println("是降序数");
	}else{
		System.out.println("不是");
	}
	}
}