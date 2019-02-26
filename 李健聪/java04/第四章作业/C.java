import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的排名");
		int sr=input.nextInt();
		switch(sr){
			case 1:
			System.out.println("恭喜你，你将参加麻省理工大学组织的一个月夏令营");
			break;
			case 2:
			System.out.println("恭喜你，你将获得惠普笔记本电脑一个");
			break;
			case 3:
			System.out.println("恭喜你，你将移动硬盘一个");
			break;
			default:
			System.out.println("恭喜你，你将滚回去继续学习");
			
		}
		
	}
} 