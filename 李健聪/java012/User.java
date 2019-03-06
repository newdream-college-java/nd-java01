package 十二章;

import java.util.Scanner;

public class User {
	Scanner input=new Scanner(System.in);
	String name;
	int score=0;
	int a;
	public void cq(){
		a=input.nextInt();
		switch(a){
		case 1:
			System.out.println("您出拳:剪刀");
			break;
			
		case 2:
			System.out.println("您出拳：石头");
			break;
			
		case 3:
			System.out.println("您出拳：布");
			break;
		}
		
	}
}
