import java.util.Scanner;
import java.util.Random;
public class Aqw{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Random sjs =new Random();
		System.out.println("一个猜拳游戏");
		int w = input.nextInt();
		//System.out.println();
		while(w>=0&&w<3){
			if(w==0){
				System.out.println("你出拳头");
				int e =sjs.nextInt(2);
				if(e==0){
					System.out.println("机器人拳头");
					System.out.println("你们平手");
					break;
				}
				if(e==1){
					System.out.println("机器人剪刀");
					System.out.println("你赢了");
					break;
				}
				if(e==2){
					System.out.println("机器人布");
					System.out.println("机器人赢了");
					break;
				}
					break;
			}
			if(w==1){
				System.out.println("你出剪刀");
				int e =sjs.nextInt(2);
				if(e==0){
					System.out.println("机器人拳头");
					System.out.println("你输了");
					break;
				}
				if(e==1){
					System.out.println("机器人剪刀");
					System.out.println("平手");
					break;
				}
				if(e==2){
					System.out.println("机器人布");
					System.out.println("机器人输");
					break;
				}
					break;
			}
			if(w==2){
				System.out.println("你出布");
				int e =sjs.nextInt(2);
				if(e==0){
					System.out.println("机器人拳头");
					System.out.println("人赢");
					break;
				}
				if(e==1){
					System.out.println("机器人剪刀");
					System.out.println("你输了");
					break;
				}
				if(e==2){
					System.out.println("机器人布");
					System.out.println("平了");
					break;
				}	break;
			}
			
				
		
			


		}


	}
}
