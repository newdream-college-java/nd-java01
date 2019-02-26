import java.util.Scanner;
import java.util.Random;
public class zy6{
	public static void  main(String[] args){
		Scanner input=new Scanner(System.in);
		Random sjs=new Random();
		int a=sjs.nextInt(2);
		System.out.println("请输入你的猜拳数：0为石头 1为剪刀 2为布");
		int b=input.nextInt();
		while(b>2){
			System.out.println("你输入的错误，请输入你的猜拳数：0为石头 1为剪刀 2为布");
			b=input.nextInt();
		}
		while(b<=2&&b>=0){
			if(b==0){
				System.out.println("你出的是石头");
				if(a==0){
					System.out.println("电脑出的是石头");
					System.out.println("你们平局");
					break;
				}
				if(a==1){
					System.out.println("电脑出的是剪刀");
					System.out.println("你赢了");
					break;
				}
				if(a==2){
					System.out.println("电脑出的是布");
					System.out.println("你输了");
					break;
				}
			}
			if(b==1){
				System.out.println("你出的是剪刀");
				if(a==0){
					System.out.println("电脑出的是石头");
					System.out.println("你输了");
					break;
				}
				if(a==1){
					System.out.println("电脑出的是剪刀");
					System.out.println("你们平局");
					break;
				}
				if(a==2){
					System.out.println("电脑出的是布");
					System.out.println("你赢了");
					break;
				}
			}
			if(b==2){
				System.out.println("你出的是布");
				if(a==0){
					System.out.println("电脑出的是石头");
					System.out.println("你赢了");
					break;
				}
				if(a==1){
					System.out.println("电脑出的是剪刀");
					System.out.println("你输了");
					break;
				}
				if(a==2){
					System.out.println("电脑出的是布");
					System.out.println("你们平局");
					break;
				}	
			}
			
		}
		
	}	
}