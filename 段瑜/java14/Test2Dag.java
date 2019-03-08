package 作业;

import java.util.Random;
import java.util.Scanner;

public class Test2Dag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog=new Dog2();
		Penguin2 penguin=new Penguin2();
		Pig pig=new Pig();
		Random rd=new Random();
		int love=rd.nextInt(41)+60;
		int health=rd.nextInt(41)+60;
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎来到宠物店！！");
		System.out.print("请输入需要领养的宠物的名字：");
		String name=input.next();
		System.out.print("请输入需要领养宠物类型（1、狗狗 2、企鹅3、猪）：");
		int a=input.nextInt();
		switch(a){
			case 1:	
				dog.setName(name);
				dog.setHealth(health);
				dog.setLove(love);
				dog.show();
				break;
			case 2:
				penguin.setName(name);
				penguin.setHealth(health);
				penguin.setLove(love);
				penguin.show();
				break;
			case 3:
				pig.setName(name);
				pig.setHealth(health);
				pig.setLove(love);
				pig.show();
				break;
			default:
				break;
				
		}
	}

}
