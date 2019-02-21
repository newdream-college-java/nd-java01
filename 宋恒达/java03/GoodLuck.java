/**
** 
**/
import java.util.Scanner;
import java.util.Random;
public class GoodLuck{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//提示
		System.out.print("请输入四位会员号:");
		int num=input.nextInt();
		//获取会员号的百位上的数字
		int bw=num/100%10;
		//随机产生一个0~9的数字
		Random random=new Random();
		int number=random.nextInt(10);
		System.out.println("中奖号码为:"+number);
		if(bw==number){
			System.out.println("恭喜你中奖了");
		}else{
			System.out.println("很遗憾你没中奖");
		}
	}
}