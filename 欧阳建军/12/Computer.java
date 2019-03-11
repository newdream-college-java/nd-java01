package 人机猜拳2;

import java.util.Random;

public class Computer {
	String name;
	int score;
	int chuQuan=-1;
Random rd = new Random();
public void fun(){
	
	chuQuan = rd.nextInt(2)+1;
	switch(chuQuan){
		case 1:
			System.out.println("电脑出的剪刀");
			break;
		case 2:
			System.out.println("电脑出的石头");
			break;
		case 3:
			System.out.println("电脑出的布");
			break;
	}
} 
}
