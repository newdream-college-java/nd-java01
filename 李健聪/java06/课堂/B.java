//用户进入游戏并选择
import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请选择你要玩的游戏\n\n");
		System.out.println("***************************************");
		System.out.println("\t\t1.斗地主");
		System.out.println("\t\t2.斗牛");
		System.out.println("\t\t3.泡泡龙");
		System.out.println("\t\t4.连连看");
		System.out.println("***************************************\n\n");
		System.out.print("请选择，输入数字");
		int a=input.nextInt();
		int x=10,r=20;
		int b,c,d,e;
		int s=0;
		int i;
		double sl;
		switch(a){
			case 1:
			System.out.println("您已进入斗地主房间,该游戏属于牌类游戏");
			System.out.println("请输入游戏时长");
			b=input.nextInt();
			while(b!=0){
				if(b<10&&b>0){
				System.out.println("您选择玩"+b+"小时，可以享受8折优惠，您需要支付"+(b*x*0.8)+"个游戏币");
				break;
				}
				else{
				System.out.println("您选择玩"+b+"小时，可以享受8折优惠，您需要支付"+(b*x*0.5)+"个游戏币");	
				break;		
				}
			}
			System.out.println("新梦想迷你游戏平台>游戏晋级");
			System.out.println("开始游戏咯准备开始咯,请输入你的成绩");
			for( i=1;i<=5;i++){
				a=input.nextInt();
				System.out.println("您正在玩第"+i+"局，成绩为"+a);
				if(a>=80){
			    		++s;	
				}
					if(i==5){
						System.out.println("您已成功完成五局游戏");	
						sl=s*1.0/i;	
						if(sl>=0.8){
							System.out.println("你晋级了并且是一级");
						}			
					}	
						
						
			}		
				
			break;
			case 2:
			System.out.println("您已进入斗牛房间,该游戏属于牌类游戏");
			System.out.println("请输入游戏时长");
			c=input.nextInt();
			while(c!=0){
				if(c<10&&c>0){
				System.out.println("您选择玩"+c+"小时，可以享受8折优惠，您需要支付"+(c*x*0.8)+"个游戏币");
				break;
				}
				else{
				System.out.println("您选择玩"+c+"小时，可以享受8折优惠，您需要支付"+(c*x*0.5)+"个游戏币");	
				break;		
				}
			}
			break;
			case 3:
			System.out.println("您已进入泡泡龙房间,该游戏属于休闲竞技类游戏");
			System.out.println("请输入游戏时长");
			d=input.nextInt();
			while(d!=0){
				if(d<10&&d>0){
				System.out.println("您选择玩"+d+"小时，可以享受8折优惠，您需要支付"+(d*r*0.8)+"个游戏币");		
				break;
				}
				else{
				System.out.println("您选择玩"+d+"小时，可以享受8折优惠，您需要支付"+(d*r*0.5)+"个游戏币");	
				break;		
				}
			}
			break;
			case 4:
			System.out.println("您已进入连连看房间,该游戏属于休闲竞技类游戏");
			System.out.println("请输入游戏时长");
			e=input.nextInt();
			while(e!=0){
				if(e<10&&e>0){
				System.out.println("您选择玩"+e+"小时，可以享受8折优惠，您需要支付"+(e*r*0.8)+"个游戏币");
				break;
				}
				else{
				System.out.println("您选择玩"+e+"小时，可以享受8折优惠，您需要支付"+(e*r*0.5)+"个游戏币");	
				break;		
				}
			}
			break;
		}
	}
}