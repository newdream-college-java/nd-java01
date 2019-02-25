/*创建类AddCust录入会员信息，包括会员号，生日和积分判断录入的会员号是否合法（必须为4位整数*/
import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入会员号（<4位整数>）：");
	int a=input.nextInt();
	System.out.print("请输入会员生日（月/日<用两位数表示>）：");
	String str=input.next();
	System.out.print("请输入积分：");
	int b=input.nextInt();
	System.out.println("\n已录用的会员信息是：\n"+a+"\t\t"+str+"\t\t"+b);
	}

}