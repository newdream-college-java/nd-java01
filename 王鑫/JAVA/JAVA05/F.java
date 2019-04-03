//编程实现一个简单的人与电脑的猜拳游戏软件。

import java.util.Scanner;
import java.util.Random;

public class F{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		Random rdm = new Random();
		System.out.print("请输入：");
		int w = input.nextInt();
		while(w==0||w==1||w==2){
			int d = rdm.nextInt(3);
			if(w==0&&d==1){							//锤子
				System.out.print("玩家出“锤子”，电脑出“剪刀”，玩家胜！！\n\n请再次输入：");
			}else if(w==1&&d==2){						//剪刀
				System.out.print("玩家出“剪刀”，电脑出“布”，玩家胜！！\n\n请再次输入：");
			}else if(w==2&&d==0){						//布
				System.out.print("玩家出“布”，电脑出“锤子”，玩家胜！！\n\n请再次输入：");
			}else{
				if(w==1&&d==0){
					System.out.print("1玩家出“剪刀”，电脑出“锤子”，电脑胜！！\n\n请再次输入：");
				}else if(w==2&&d==1){
					System.out.print("1玩家出“布”，电脑出“剪刀”，电脑胜！！\n\n请再次输入：");
				}else if(w==0&&d==2){
					System.out.print("1玩家出“锤子”，电脑出“布”，电脑胜！！\n\n请再次输入：");				
				}else{
					System.out.print("平局！\n\n请再次输入：");
				}

			}
			w = input.nextInt();
		}
	}
}