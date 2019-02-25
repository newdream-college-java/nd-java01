import java.util.Scanner;
public class Sf{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.println("输入一个数");
	int a =input.nextInt();
	switch(a){
		case 1:
		System.out.println("今天星期一");
		break;
		case 2:
		System.out.println("今天星期二");
		break;
		case 3:
		System.out.println("今天星期三");
		break;
		default:
		System.out.println("否则显示错误");

		}
	}

}