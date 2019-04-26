package 作业;

import java.util.Scanner;

public class Store  {
	static void get(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你需要的宠物的（1.狗狗  2.猫猫 其他.猪猪）");
		int a=input.nextInt();
		if(a==1){
			Dog b=new Dog();
			b.shout();
		}else if(a==2){
			Cat c=new Cat();
			c.shout();
		}else{
			Pig p=new Pig();
			p.shout();
		}
	}
}
