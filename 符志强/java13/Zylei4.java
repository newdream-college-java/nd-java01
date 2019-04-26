package zuoye;

import java.util.Scanner;

public class Zylei4 {
	int sum;
	public void a(int sum) {
		Scanner input=new Scanner(System.in);
		
		boolean f=false;
		while (!f) {
//			System.out.println("1.存款  2.却款 0.退出");
//			System.out.print("请输入你需要的操作：");
			
			System.out.println("1.存款  2.却款 0.退出");
			System.out.print("请输入你需要的操作：");
			int s=input.nextInt();	
			
			if (s==1) {
				System.out.print("请输入存款金额：");
				int c=input.nextInt();
				sum+=c;
				System.out.println("存款成功");
				System.out.println("**当前余额为："+sum+"元***");
				
				System.out.println("是否退出");
				System.out.println("1.继续 其他.退出");
				int jt=input.nextInt();
				if (jt==1) {
					continue;
				}else{
					System.out.println("你已结束操作");
					f=true;
				}
			}
			if (s==2) {
				System.out.print("请输入取款金额：");
				int q=input.nextInt();
				if (sum<q) {
					System.out.println("你的余额不足");
					System.out.println("是否退出");
					System.out.println("1.继续 其他.退出");
					int jt=input.nextInt();
					if (jt==1) {
						continue;
					}else{
						System.out.println("你已结束操作");
						f=true;
					}
					
				}else{
					sum-=q;
					System.out.println("取款成功");
					System.out.println("**当前余额为："+sum+"元***");
					System.out.println("是否退出");
					System.out.println("1.继续 其他.退出");
					int jt=input.nextInt();
					if (jt==1) {
						continue;
					}
					else{
						System.out.println("你已结束操作");
						f=true;
					}
				}
			}
			if (s==0) {
				System.out.println("你已结束操作");
				f=true;
			}
			if(s<0||s>2){
				System.out.println("输入错误，请重新输入");
			}
		}
	}
}
