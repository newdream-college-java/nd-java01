package 作业;

import java.util.Scanner;

public class Zy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎您来到宠物店");
		System.out.print("请输入要领养的宠物的名字：");
		String mz=input.next();
		boolean f=false;
		while (!f) {
			System.out.println("请选择要领养的宠物的类型：（1.狗狗  2.企鹅）");
			int x=input.nextInt();
			if (x==1) {
				Zylei2 a=new Zylei2();
				a.print(mz);
				f=true;
			}else
			if (x==2) {
				Zylei22 b=new Zylei22();
				b.print(mz);
				f=true;
			}else{
				System.out.println("输入错误，请重新输入");
				System.out.println("请选择要领养的宠物的类型：（1.狗狗  2.企鹅）");
				x=input.nextInt();
			}
		}
	}
}
