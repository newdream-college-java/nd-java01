/**
**韩嫣参加计算机编程大赛
**如果获得第1名，将参加麻省理大学组织的1个月夏令营
**如果获得第2名，将奖励惠普笔记本电脑一部
**如果获得第3名，将奖励移动硬盘一个
**否则，不给任何奖励
**/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("韩嫣获得计算机编程大赛第几名:");
		String a=input.next();
		switch(a){
			case "第1名":
				System.out.println("参加麻省理工大学组织的1个月夏令营");
				break;
			case "第2名":
				System.out.println("奖励惠普笔记本电脑一台");
				break;
			case "第3名":
				System.out.println("奖励移动硬盘一个");
				break;
			default:
				System.out.println("不给任何奖励");
		}
	}
}