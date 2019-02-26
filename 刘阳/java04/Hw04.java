import java.util.Scanner;
public class Hw04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//提示输入一个数字
		System.out.print("请输入一个数字：");
		int num= input.nextInt();
		switch(num){
			case 1:
				System.out.print("星期一");
				break;
			case 2:
				System.out.print("星期二");
				break;
			case 3:
				System.out.print("星期三");
				break;
			default:
				System.out.print("输入错误！");
		}		
		
	}
}