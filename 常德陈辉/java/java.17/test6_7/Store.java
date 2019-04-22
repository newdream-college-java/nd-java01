package test6_7;

import java.util.Scanner;

public class Store {
	Scanner input=new Scanner(System.in);
	public void get(){
		System.out.print("请输入要听什么宠物的叫声（狗，猫，猪）：");
		String zoo=input.next();
		if(zoo.equals("狗")){
			Animal dog=new Dog();
			dog.shout();
		}else if(zoo.equals("猫")){
			Animal cat=new Cat();
			cat.shout();
		}else if(zoo.equals("猪")){
			Animal pig=new Pig();
			pig.shout();
		}else{
			System.out.println("输入有误！");
		}
	}
}
