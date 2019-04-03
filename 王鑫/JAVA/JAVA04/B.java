//计算机编程大赛


import java.util.Scanner;

public class B{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你获得的名次：");
		int n = input.nextInt();
		if(n==1){
			System.out.println("获得第一名:将参加麻省理工大学组织的一个月夏令营");
		}else if(n==2){
			System.out.println("获得第二名:将奖励惠普笔记本电脑一部");
		}else if(n==3){
			System.out.println("获得第三名:将获得移动硬盘一个");
		}else{
			System.out.println("再接再厉");
		}
		
	}
}