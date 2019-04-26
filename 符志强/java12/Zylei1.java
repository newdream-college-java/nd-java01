package zz;
import java.util.Scanner;

public class Zylei1 {
	Scanner input=new Scanner(System.in); 
	String name="无";
	int jf;
	public int quan() {
		System.out.println("请出拳：1.为剪刀s   2.为石头  3.为布");
		int a=input.nextInt();
		if (a>3||a<=0) {
			System.out.println("程序结束");
			System.exit(0);
		}
		switch (a) {
			case 1:
				System.out.println("您出的是剪刀");
				break;
			case 2:
				System.out.println("您出的是石头");
				break;
			case 3:
				System.out.println("您出的是布");
				break;
				
		}
		return a;
	}
}
