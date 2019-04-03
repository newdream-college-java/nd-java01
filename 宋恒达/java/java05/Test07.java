/**
**从键盘上输入一个数，当输入 1~7 时，显示下面对应的信息；输入 1~7 之外
**的值时，提示错误重新输入，直到输入 0 退出循环。
**1：MON 2：TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN
**/
import java.util.Scanner;

public class Test07{
	public static void main(String[] args){
		boolean flag=true;
		Scanner input=new Scanner(System.in);
		do{			
			System.out.println("请输入一个整数(0~7):");
			int a=input.nextInt();
			switch(a){
				case 0:
					flag=false;
					break;
				case 1:
					System.out.println("1:MON");
					break;
				case 2:
					System.out.println("2:TUE");
					break;
				case 3:
					System.out.println("3:WED");
					break;
				case 4:
					System.out.println("4:THU");
					break;
				case 5:
					System.out.println("5:FRI");
					break;
				case 6:
					System.out.println("6:SAT");
					break;
				case 7:
					System.out.println("7:SUN");
					break;
				default:
					System.out.println("输入错误，请从新输入");

			}
		}while(flag);
	}
}