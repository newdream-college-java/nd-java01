import java.util.Scanner;
import java.util.Random;
public class I{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Random rd= new Random();	
	int sj=rd.nextInt(10);
	System.out.println("我行我素购物管理系统>幸运抽奖"+"\n"+"\n");
	System.out.println("请输入4位会员号:");
	int hyh=input.nextInt();
	int bw=hyh/100%10;
	if(bw==sj){
		System.out.print(hyh+"号客户是幸运客户，获得礼品一份");
	}else{
		System.out.print(hyh+"您没充钱所以没中奖");
	}	
	
	
	}
} 