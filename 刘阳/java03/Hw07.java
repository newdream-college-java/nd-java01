/*用客户会员号百位为依据比对随机数进行抽奖*/
import java.util.Scanner;
public class Hw07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示
		System.out.println("我行我素购物管理系统>幸运抽奖");
		//提示2
		System.out.print("请输入4位会员号");
		int num = input.nextInt();
		int bw=num/100%10;
		//获取随机数变量
		int snum=(int)(Math.random()*10);
		if(bw==snum){
			System.out.print(num+"号客户是幸运客户，获得精美MP3一个。");
		}else{
			System.out.print(num+"号客户没中奖!");

		}
	}
}