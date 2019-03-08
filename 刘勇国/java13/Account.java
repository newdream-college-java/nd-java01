package 第13章作业;

import java.util.Scanner;

public class Account {
	Scanner input =new Scanner(System.in);
	int money=0;
	public void menu(){
		System.out.println("1.存款2.取款0.退出");
		System.out.print("请选择你需要办理的业务：");
		int chioce =input.nextInt();
		if(chioce==1){
			System.out.print("请输入存款金额：");
			cunKuan(input.nextInt());
			System.out.println("存款成功");
			show();
		}else if(chioce==2){
			System.out.print("请输入取款金额：");
			quKuan(input.nextInt());
			System.out.println("取款成功\n");
			show();
		}else{
			System.out.print("谢谢使用!");
			System.exit(-1);
		}
	}
	public void cunKuan(int money){
		this.money+=money;
		
	}
	public void quKuan(int money){
		if(this.money-money>=0){
			this.money-=money;
		}else{
			System.out.println("存款不够，返回主菜单");
			menu();
		}
	}
	public void show(){
		System.out.println("***当前余额为："+money*1.0+"元*****\n");
		
	}
}
