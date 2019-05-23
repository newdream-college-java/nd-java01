package 人机猜拳;

import java.util.Scanner;

public class Test2 {
	String name1="张三";	
	int score;
	public int renC(){
		Scanner input=new Scanner(System.in);
		 int choices = -1;
	        if(input.hasNextInt()) {
	            choices  = input.nextInt();
	        }
		switch(choices){
			case 1:
				System.out.println(name1+"出拳：石头");
				break;
			case 2:
				System.out.println(name1+"出拳：剪刀");
				break;
			case 3:
				System.out.println(name1+"出拳：布");
				break;
			default:
				System.out.println("亲，输入有误：");
				break;
				
		}
		System.out.println();
		return choices;
	}
	
}
