import java.util.Scanner;
import java.util.Random;                    //如果a==b  那么打平  如果a=0,b=1 a赢 b=2  b赢  a=1 
public class E{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rd=new Random();
		int a=rd.nextInt(3);
		System.out.println("请输入你要出的数字,0代表石头，1代表剪刀，2代表布");
		int b=input.nextInt();
		switch(a){
			if(a==0){
				System.out.println("电脑出的是石头");
				switch(b){
					case 0:
					System.out.println("你出的是石头");
					System.out.println("打平");
					break;
					case 1:
					System.out.println("你出的是剪刀");
					System.out.println("你输了");
					break;
					case 2:
					System.out.println("你出的是布");
					System.out.println("你赢了");
					break;
					default:
					System.out.println("输入错误退出程序");
					System.exit(-1);
				}
			}	
		
	}
}
 