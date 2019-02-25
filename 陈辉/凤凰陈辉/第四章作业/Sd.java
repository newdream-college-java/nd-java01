import java.util.Scanner;
public class Sd{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("韩雪参加计算机编程大赛");
		int je =input.nextInt();
		switch(je){
			case 0:
			System.out.println("否则不给奖励");
			break;
			case 1:
			System.out.println("将参加理工大学组织的1个月夏令营");
			break;
			case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			break;
			case 3:
			System.out.println("将奖励移动硬盘一个");
			break;
			default:
			System.out.println("否则，不给奖励");
		} 
	}

}