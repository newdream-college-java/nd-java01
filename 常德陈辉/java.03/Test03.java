/*输入一个年份，如果是闰年，就输出这一年是闰年，否则输出这一年是平年。闰年：年份能被4整除并且不能被100整除，或者能被400整除*/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个年份");
		int year=input.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0){
			System.out.print(year+"是闰年");
		}else{
			System.out.print(year+"是平年");
		}
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                