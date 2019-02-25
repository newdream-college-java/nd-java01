/*输入一个三位数，分别放入到3个变量中，编程将这三个变量中分值交换后输出。比如输入123三个数放入到a，b，c，中去，最后输出a，b，c的值，要求输出231*/
import java.util.Scanner;
public class Ai{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入一个三位数");
	int n=input.nextInt();
	int a,b,c,d;
	a=n/100%10;
	b=n/10%10;
	c=n%10;
	d=a;
	a=b;
	b=c;
	c=d;
	System.out.print("交换后"+a+b+c);
	}

}