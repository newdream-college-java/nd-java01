package 第十三章作业;

import java.util.Scanner;

public class Account {
	double sum=0;
	Scanner input=new Scanner(System.in);
	public Account(int sum){
		for(;;){
			System.out.println("1.存款  2.取款  0.退出\n请选择你需要办理的业务：");
			int a=input.nextInt();
			if(a==1){
				System.out.println("请输入存款金额:");
				double b=input.nextDouble();
				sum+=b;
				System.out.println("存款成功\n");
				System.out.println("***当前余额为："+sum+"***");
			}
			if(a==2){
				System.out.println("请输入取款金额:");
				double b=input.nextDouble();
				if(b>sum){
					System.out.println("你没有这么多钱，你取西经去吧,再见！");
					break;
				}else{
					sum-=b;
					System.out.println("取款成功\n");
					System.out.println("***当前余额为："+sum+"***");
				}
				
			}if(a==0){
				System.out.println("谢谢使用");
				break;
			}
			if(!(a>=0&&a<=2)){
				System.out.println("输入有误请重新输入");
			}
			
		}
	
	}
}
