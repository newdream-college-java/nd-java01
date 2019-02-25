/**
**编程实现一个简单的人与电脑的猜拳游戏软件
**/
import java.util.Scanner;
import java.util.Random;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		System.out.println("请出拳:（输入剪刀、石头、布）");
		String a=input.next();
		int b=random.nextInt(3);
		switch(a){
			case "石头":
				if(b==0){
					System.out.println("电脑出的是石头");
					System.out.println("平局");
				}else if(b==1){
					System.out.println("电脑出的是剪刀");
					System.out.println("你赢了");
				}else{
					System.out.println("电脑出的是布");
					System.out.println("你输了");
				}
				break;
			case "剪刀":
				if(b==0){
					System.out.println("电脑出的是石头");
					System.out.println("你输了");
				}else if(b==1){
					System.out.println("电脑出的是剪刀");
					System.out.println("平局");
				}else{
					System.out.println("电脑出的是布");
					System.out.println("你赢了");
				}
				break;
			case "布":
				if(b==0){
					System.out.println("电脑出的是石头");
					System.out.println("你赢了");
				}else if(b==1){
					System.out.println("电脑出的是剪刀");
					System.out.println("你输了");
				}else{
					System.out.println("电脑出的是布");
					System.out.println("你平局");
				}
				break;
		}
	}
}