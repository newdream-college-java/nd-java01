package 人机猜拳2;

import java.util.Scanner;

public class Person {
String name="匿名";
int score;
int chuQuan=-1;
public void fun(){
	Scanner input =new Scanner(System.in);
	System.out.println("请出拳");
	chuQuan =input.nextInt();
	
	switch(chuQuan){
	case 1:
		System.out.println("人出的剪刀");
		break;
	case 2:
		System.out.println("人出的石头");
		break;
	case 3:
		System.out.println("人出的布");
		break;
}
}
}
