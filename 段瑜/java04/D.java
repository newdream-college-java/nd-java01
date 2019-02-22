import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个数字：");
		int sum=input.nextInt();
		switch(sum){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			default:
				System.out.println("输入错误！");
		}
		
	}
}