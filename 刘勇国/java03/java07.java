import java.util.Scanner;
import java.util.Random;
public class java07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的4位数会员号");
		int	num = input.nextInt();
		int a = num/10%10;
		Random rand = new Random();
		int i=rand.nextInt(10);
		System.out.println("产生的随机数为："+i);
		if(a==i){
			System.out.println("恭喜你抽到了奖品");
		}else{
			System.out.println("很遗憾，没抽中");
		}
	}
}