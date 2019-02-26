/*编程实现一个简单的人与电脑的猜拳游戏软。*/
import java.util.Random;
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	Random rd=new Random();
	System.out.print("请输入0到2之间的一个数：");
	int n=input.nextInt();
	int i;
	for(i=n;i<3;i=n){
		switch(n){
			case 0:
				System.out.print("你出的是石头\t");
				break;
			case 1:
				System.out.print("你出的是剪刀\t");
				break;
			case 2:
				System.out.print("你出的是布\t");
				break;
			}
		int a=rd.nextInt(3);
		switch(a){
			case 0:
				System.out.print("电脑的是石头\t\n请再次输入");
				break;
			case 1:
				System.out.print("电脑的是剪刀\t\n请再次输入");
				break;
			case 2:
				System.out.print("电脑的是布\t\n请再次输入");
				break;
			}	
		n=input.nextInt();
		}
		System.out.print("程序结束");
	}

}