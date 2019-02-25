/*从键盘上输入一个数，当输入 1~7 时，显示下面对应的信息；输入 1~7 之外
的值时，提示错误重新输入，直到输入 0 退出循环。
1：MON 2：TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入一个数：");
	int a=input.nextInt();
	int i;
	for(i=a;i!=0;i=a){
		switch(a){
			case 1:
				System.out.print("MON\n请再次输入");
				break;
			case 2:
				System.out.print("TUE\n请再次输入");
				break;
			case 3:
				System.out.print("WED\n请再次输入");
				break;
			case 4:
				System.out.print("THU\n请再次输入");
				break;
			case 5:
				System.out.print("FRI\n请再次输入");
				break;
			case 6:
				System.out.print("SAT\n请再次输入");
				break;
			case 7:
				System.out.print("SUN\n请再次输入");
			default:
				System.out.print("输入错误请重新输入");
			}
		a=input.nextInt();
		}
	System.out.print("程序结束");
	}

}