package 作业;

import java.util.Scanner;

public class Zy3 {

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
			System.out.print("请选择要领养的宠物的类型：（1.狗狗  2.企鹅 3.猪猪）");
			int x=input.nextInt();
			if (x==1) {
				Zylei3 a=new Zylei3(mz);
				f=true;
			}else
			if (x==2) {
				Zylei33 b=new Zylei33(mz);
				f=true;
			}else
			if (x==3) {
				Zylei333 c=new Zylei333(mz);
				f=true;
			}else{
				System.out.println("输入错误，请重新输入");
				System.out.print("请选择要领养的宠物的类型：（1.狗狗  2.企鹅 3.猪猪）");
				x=input.nextInt();
			}
		}
	}
}
