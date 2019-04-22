/*输入一个数字，如果这个数字是1，那么输出星期一，如果这个数字是2，那么就输出星期二，如果这个数字是三，那么就输出星期三。。。。。。如果是其他就输出输入错误！（switch）*/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入一个数字");
	int number=input.nextInt();
		switch(number){
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
				System.out.println("星期日");
				break;
			default:
				System.out.println("输入错误");
		}
	
	}

}