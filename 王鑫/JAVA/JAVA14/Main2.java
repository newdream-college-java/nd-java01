package Test2019_3_8_z14;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		String name ;
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到宠物店！");
		System.out.print("请输入徐要领养的宠物名字：");
		name=input.next();		
		System.out.print("请选择要领养的宠物类型：（1.狗狗 2.企鹅 3.猪）");
		int n =input.nextInt();
		/*方式一：
		
		if (n==1) {
			Dog_2 dog1 = new Dog_2();
			dog1.setName(name);
			System.out.print("请输入狗狗的毛色：（1.白色 2.黑色）");
			n =input.nextInt();
			dog1.setColor(n==1?"白色":"黑色");
			dog1.show();
		}else if (n==2) {
			Penguin_2 penguin = new Penguin_2();
			penguin.setName(name);
			System.out.print("请输入企鹅的毛色：（1.白色 2.黑色）");
			n =input.nextInt();
			penguin.setColor(n==1?"白色":"黑色");
			penguin.show();
			
		}else{
			Pig_2 pig = new Pig_2();
			pig.setName(name);
			System.out.print("请输入狗狗的毛色：（1.白色 2.黑色）");
			n =input.nextInt();
			pig.setColor(n==1?"白色":"黑色");
			pig.show();
			
		}
		*/
		//方式二：
		if (n==1) {
			System.out.print("请输入狗狗的毛色：（1.白色 2.黑色）");
			n =input.nextInt();
			Dog_2 dog = new Dog_2(name,(n==1?"白色":"黑色"));
			dog.show();
		}else if (n==2) {

			System.out.print("请输入企鹅的毛色：（1.白色 2.黑色）");
			n =input.nextInt();
			Penguin_2 penguin = new Penguin_2(name,(n==1?"白色":"黑色"));
			penguin.show();
			
		}else{
		
			System.out.print("请输入企鹅的毛色：（1.白色 2.黑色）");
			n =input.nextInt();
			Pig_2 pig = new Pig_2(name,(n==1?"白色":"黑色"));
			pig.show();
			
		}
	}
}
