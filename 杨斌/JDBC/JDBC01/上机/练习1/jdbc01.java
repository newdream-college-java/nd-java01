package jdbc01;

import java.util.Scanner;
public class jdbc01 {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		test t1=new test();
		boolean goOn;
		do {
			goOn=true;
			System.out.println("============================欢迎访问宠物商店============================");
			System.out.println("1.添加宠物信息\t2.修改宠物信息\t3.查询宠物信息\t4.添加主人信息\t0.退出");
			System.out.println("请输入您的选择:");
			int num=sc.nextInt();
			switch(num) {
				case 4:
					System.out.println("宠物商店>添加主人");
					t1.insertMaster();
					break;
				case 0:
					System.out.println("谢谢您的光临！再见");
					goOn=false;
					break;
				default:
					System.out.println("您的选择有误");
					break;
			}
		}while(goOn);
		
	}
}
