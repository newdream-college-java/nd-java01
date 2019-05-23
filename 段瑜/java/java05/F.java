import java.util.Random;
import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		int i=1;
		while(i!=0){
			int sum=rd.nextInt(2);
			System.out.println("请输入石头剪刀布：");
			int a=input.nextInt();
			i++;
			switch(a){
				case 0:
					System.out.println("石头");
					break;
				case 1:
					System.out.println("剪刀");
					break;
				case 2:
					System.out.println("布");
					break;
				default:
					i=0;
					break;
			}
			switch(sum){
				case 0:
					System.out.println("石头");
					break;
				case 1:
					System.out.println("剪刀");
					break;
				case 2:
					System.out.println("布");
					break;
				default:
					i=0;
					break;
			}
		}
		System.out.println("输入错误");
	}
}