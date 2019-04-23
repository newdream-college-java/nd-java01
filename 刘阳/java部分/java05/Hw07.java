import java.util.Scanner;
public class Hw07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//提示
		System.out.print("请输入1~7中间的一个整数：");
		int a =input.nextInt();
		switch(a){
			case 1:
				System.out.print("MON");
			break;
			case 2:
				System.out.print("TUE");
			break;
			case 3:
				System.out.print("WED");
			break;
			case 4:
				System.out.print("THU");
			break;
			case 5:
				System.out.print("FRI");
			break;
			case 6:
				System.out.print("SAT");
			break;
			case 7:
				System.out.print("SUN");
			break;
			default:
				while(a!=0){
					//提示输入错误，并反复提问
					System.out.print("输入错误，请重新输入");
					a=input.nextInt();
					
				}
				System.exit(-1);
		}
	}
}