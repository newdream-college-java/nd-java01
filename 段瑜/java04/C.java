import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("韩雪参加计算机编程大赛获得：");
		int sum=input.nextInt();
		switch(sum){
			case 1:
				System.out.println("参加麻省理工大学组织的1月夏令营");
				break;
			case  2:
				System.out.println("将奖励惠普笔记本电脑一部");
				break;
			case 3:
				System.out.println("将奖励移动硬盘一个");
				break;
			default:
				System.out.println("很遗憾，没有获得奖励");
		}
	}
}