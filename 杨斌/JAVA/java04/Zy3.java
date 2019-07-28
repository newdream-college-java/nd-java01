import java.util.Scanner;
public class Zy3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你名次：");		
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("将参加麻省理工大学组织的一个月夏令营");				
				break;
			case 2:
				System.out.println("将奖励惠普笔记本电脑一部");
				break;
			case 3:
				System.out.println("将奖励移动硬盘一个");
				break;
			default:
				System.out.println("没有奖励");
				break;
		}
	}

}