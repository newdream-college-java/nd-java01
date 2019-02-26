import java.util.Scanner;
public class java02{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入正方形的边长：");
		int a=input.nextInt();
		int b,c;
		b=(a+a)*2;
		c=a*a;
		System.out.print("边长="+a+"\n周长="+b+"\n面积="+c);
		


	}



}