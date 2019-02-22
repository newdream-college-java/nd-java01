import java.util.Scanner;
public class java06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int n = input.nextInt();
		int a = n/100;
		int b = n/10%10;
		int c = n%10;
		System.out.println("a="+a+"b="+b+"c="+c);
		int d;
		d = c;
		c = a;
		a = d;
		System.out.println("交换后数值为:"+(a*100+b*10+c));
	}
}