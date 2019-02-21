import java.util.Scanner;
public class J{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("请输入一个四位数的整数");
	int a = input.nextInt();
	//个位数
	int gw=a%10;
	//十位数
	int sw=a/10%10;
	//百位数
	int bw=a/100%10;
	//千位数
	int qw=a/1000%10;
	System.out.print("个位数："+gw+"\n"+"十位数："+sw+"\n"+"百位数："+bw+"\n"+"千位数："+qw);


	}




}