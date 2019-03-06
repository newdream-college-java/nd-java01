package 十二章;

import java.util.Random;

public class Computer {
	Random rd=new Random();
	String name;
	int score=0;
	int a;
	public int cq(){
		a=rd.nextInt(3)+1;
		switch(a){
		case 1:
			System.out.println("电脑出拳:剪刀");
			break;
			
		case 2:
			System.out.println("电脑出拳：石头");
			break;
			
		case 3:
			System.out.println("电脑出拳：布");
			break;
		}
		return a;
	}
}
