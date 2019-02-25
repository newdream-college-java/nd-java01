/*韩嫣参加计算机编程大赛
如果获得第一名，将参加麻省理工大学组织的1个月夏令营
如果获得第二名，将奖励惠普笔记本电脑一部
如果获得第三名奖励移动硬盘一个
否则，不给任何奖励*/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入韩嫣的名次：");
	int ranking=input.nextInt();
	switch(ranking){
		case 1:
			System.out.println("将参加麻省理工大学组织的1个月夏令营");
			break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			break;
		case 3:
			System.out.println("奖励移动硬盘一个");
			break;
		default:
			System.out.println("没有奖励");
		}	
	}

}