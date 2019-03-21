package 第17章接口宠物1_6和1_7;

import java.util.Scanner;

public class Store {
	static int get(){
		Scanner input =new Scanner(System.in);
		System.out.println("请选择你要领养宠物的类型（1.狗\t2.猫）");
		int choice=input.nextInt();
		return choice;
	}
}
