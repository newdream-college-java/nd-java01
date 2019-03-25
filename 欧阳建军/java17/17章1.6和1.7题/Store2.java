package 第17章接口宠物1_6和1_7;

import java.util.Scanner;

public class Store2 {
	static Animal get(){
		Scanner input =new Scanner(System.in);
		System.out.println("请选择你要领养宠物的类型（1.狗\t2.猫\t3.猪）");
		int choice=input.nextInt();
		if(choice==1){
			return new Dog();
		}else if(choice==2){
			return new Cat();
		}else if(choice==3){
			return new Pig();
		}else{
			return null;
		}
	}
}
