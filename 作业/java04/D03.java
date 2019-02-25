import java.util.Scanner;
public class D03{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入韩嫣获得的名次(输入整数)");
	if(input.hasNextInt()==true){
	int num = input.nextInt();
	switch(num){
		case 1:
			System.out.println("奖励麻省理工大学组织的 1 个月夏令营");
		break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
		break;
		case 3:
			System.out.println("奖励移动硬盘一个");
		break;
		default:
			System.out.println("不给奖励");
		break;
	}
	}else{
		System.out.println("输入有误,退出程序。");
		System.exit(-1);
	}
}
}
