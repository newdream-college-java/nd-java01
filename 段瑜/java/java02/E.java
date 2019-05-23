import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个四位数");
		int a=input.nextInt();
		int b=a%10;
		int c=a/10%10;
		int d=a/100%10;
		int e=a/1000;
		System.out.println("个位："+b+"\n十位："+c+"\n百位："+d+"\n千位："+e);
}
}