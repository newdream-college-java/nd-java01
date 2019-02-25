import java.util.Random;
import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("欢迎来到猜拳游戏,请出拳（0代表石头，1代表剪刀，2代表布）");
		int a=input.nextInt();
		int b=rd.nextInt(3);
		while(b<3){
			
			if(a==0&&b==1){
				System.out.println("电脑出的是"+b+"恭喜你赢了，电脑输了");
				break;
			}if(a==1&&b==2){
				System.out.println("电脑出的是"+b+"恭喜你赢了，电脑输了");
				break;
			}if(a==2&&b==0){
				System.out.println("电脑出的是"+b+"恭喜你赢了，电脑输了");
				break;
			}else if(a==0&&b==2){
				System.out.println("电脑出的是"+b+"很遗憾你输了");
				break;
			}else if(a==1&&b==0){
				System.out.println("电脑出的是"+b+"很遗憾你输了");
				break;
			}else if(a==2&&b==1){
				System.out.println("电脑出的是"+b+"很遗憾你输了");
				break;
			}else{
				System.out.println("双方打平");
				break;
			}
			
		}a=input.nextInt();
		
	}
} 