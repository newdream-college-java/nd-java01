/**
*输入一个年份，判是闰年还是平年 
**/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		System.out.print("请输入年份");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if((a%4==0&&a%100!=0)||(a%400==0)){
			System.out.println(a+"是闰年");
		}else{
			System.out.println(a+"不是闰年");
		}
	}
}