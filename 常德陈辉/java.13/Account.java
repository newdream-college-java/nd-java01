package cn.zuoye;

import java.util.Scanner;

public class Account {
	Scanner input=new Scanner(System.in);
	public void yhyw(){
		double sum=0,b=0;
		String c;
		do{
			System.out.println("1，存款 2，取款 0，退出");
			System.out.print("请选择你需要办理的业务：");
			int a=input.nextInt();
			switch(a){
				case 1:
					System.out.print("请输入存款余额：");
					b=input.nextDouble();
					sum+=b;
					System.out.println("存款成功\n");
					System.out.println("***"+"当余额为："+sum+"元***\n");
					break;
				case 2:
					System.out.print("请输入取款余额：");
					b=input.nextDouble();
					sum-=b;
					System.out.println("取款成功");
					System.out.println("***"+"当余额为："+sum+"元***\n");
					break;
				case 0:
					System.out.println("谢谢使用！");
					break;
			}
			System.out.print("是否继续办理业务（y/n）");
			c=input.next();
		}while(c.equals("y"));
	}
}
