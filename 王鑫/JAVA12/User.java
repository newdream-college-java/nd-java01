package Test2019_3_5_z12;

import java.util.Scanner;

public class User {
	String name="玩家";
	int jf = 0;
	public int showFist(){
		Scanner input = new Scanner(System.in);
		System.out.print("请出拳：1.剪刀2.石头3.布（输入对应的数字）：");
		int n = input.nextInt();
		while (n>3&&n<1) {
			System.out.print("请出拳：1.剪刀2.石头3.布（输入对应的数字）：");
			n = input.nextInt();
		}
		if (n==1) {
			System.out.println("你出拳：剪刀");
		}else if (n==2) {
			System.out.println("你出拳：石头");
		}else {
			System.out.println("你出拳：布");
		}
		return n;
	} 
}
