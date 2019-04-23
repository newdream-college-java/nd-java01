import java.util.Scanner;
public class Hw01{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int num,sum=1;
		System.out.println("请输入一个正整数（1~10）：");
		num=input.nextInt();
		int a=num;
		if(num>=1&&num<=10){
			for(;num>=1;num--){
				sum*=num;
			}
			System.out.print(a+"的阶乘等于："+sum);
		}else{
			System.out.print("输入错误！请输入符合规定的数：");
			System.exit(-1);
		}
	}
}
