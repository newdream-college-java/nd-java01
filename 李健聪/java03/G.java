import java.util.Scanner;
public class G{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素购物管理系统>幸运抽奖");
		System.out.println("请输入4位会员号");
		int hyh=input.nextInt();
		int bw=hyh/100%10;
		int number=(int)(Math.random()*10);
		if(bw==number){
			System.out.println(hyh+"号客户是幸运客户，获得精美MP3一个。");
		}else{
			System.out.println(hyh+"号客户没中奖，屁都没有。");
		}
		
	}
}