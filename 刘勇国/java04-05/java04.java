import java.util.Scanner;
public class java04{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入一个整数(1-7)");
	if(input.hasNextInt()==true){
	int day = input.nextInt();
	switch(day){
		case 1:
			System.out.println("星期一");
		break;
		case 2:
			System.out.println("星期二");
		break;
		case 3:
			System.out.println("星期三");
		break;
		case 4:
			System.out.println("星期四");
		break;
		case 5:
			System.out.println("星期五");
		break;
		case 6:
			System.out.println("星期六");
		break;
		case 7:
			System.out.println("星期天");
		default:
			System.out.println("输入有误");
		break;
	}
	}else{
		System.out.println("输入错误，退出程序");
		System.exit(-1);
	}
	}
}