package 作业;

import java.util.Scanner;

public class Test4Account {
	private static final Object sum = null;

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Account a=new Account();
		int money=0;
		int sum;
		do{
		a.show1();
		sum=input.nextInt();
		switch(sum){
			case 1:
				System.out.println("请输入存款金额:");
				a.show(input.nextInt());
				money+=a.moneys;
				System.out.println("***当前余额为："+money+"***");
				break;
			case 2:
				System.out.println("请输入取款金额:");
				a.show(input.nextInt());
				money-=a.moneys;
				System.out.println("***当前余额为："+money+"***");
				break;
			case 0:
				System.out.println("谢谢使用！！");
				break;
			default:
				break;				
		}
		}while(sum!=0);
	}
}