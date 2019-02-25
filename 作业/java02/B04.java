import java.util.Scanner;
public class B04{
	public static void main(String[] args){
		Scanner input =new Scanner (System.in);
		System.out.print("请输入a的值：");
		int a =input.nextInt();
		System.out.print("请输入b的值：");
		int b =input.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.print("a="+a+"\nb="+b);
		
	}
}
