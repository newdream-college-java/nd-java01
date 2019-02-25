/*循环问要求用户输入一个0到2之间的整数，
如果输入的是0就输出“你出的是石头”，
如果输入的是1就输出“你出的是剪刀”，
如果输入的是2就输出“你出的是布”，
如果是其他数就结束程序。*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("请输入0到2之间的一个数：");
	int n=input.nextInt();
	int i;
	for(i=n;i<3;i=n){
		switch(n){
			case 0:
				System.out.print("你出的是石头\t请再次输入");
				break;
			case 1:
				System.out.print("你出的是剪刀\t请再次输入");
				break;
			case 2:
				System.out.print("你出的是布\t请再次输入");
				break;
			}
			n=input.nextInt();
		}
		System.out.print("程序结束");
	}

}