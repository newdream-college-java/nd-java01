import java.util.Scanner;
public class K{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个整数a:");
		int a =input.nextInt();
		System.out.print("请输入第二个整数b:");
		int b =input.nextInt();
		System.out.println("交换前a="+a+"\n"+"交换前b="+b);
		int c=b;
		    b=a;
		    a=c;

		System.out.print("交换后a="+a+"\n"+"交换后b="+b);

	}

}