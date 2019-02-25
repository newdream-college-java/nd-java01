import java.util.Scanner;
public class Hw05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示：
		System.out.print("请输入一个0到2之间的整数：");
		int a=input.nextInt();
		switch(a){
			case 0:
				System.out.print("你出的是石头");
				break;
			case 1:
				System.out.print("你出的是剪刀");
				break;
			case 2:
				System.out.print("你出的是布");
				break;
			default:
				System.out.print("输入不合规，请重新再来");
				System.exit(-1);
		}
	}
}