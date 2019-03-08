package 第十章作业;

import java.util.Scanner;

public class Compare2 {
	Custmoer2 c1 =new Custmoer2();
	public void input(){
		
		Scanner input =new Scanner(System.in);
		System.out.print("请输入积分");
		c1.score=input.nextInt();
		System.out.print("请输入客户的卡类型");
		c1.type=input.next();
		compare();
	}
	public void compare(){
		if(c1.score>500&&!c1.equals("金卡")){
			System.out.print("\n回馈500分！");
		}else if(c1.score>1000&&c1.equals("金卡")){
			System.out.print("\n回馈500分！");
		}
	}
}
