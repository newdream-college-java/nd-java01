/*
创建GoodLock实现幸运抽奖，抽奖规则：会员号的百位数字等于产生的随机数字即可

*/import java.util.Scanner;

public class GoodLock{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入4位会员卡号:");
		int n=input.nextInt();				//计算百位的数.
		int a=n/100%10;					//随机抽取1~10之间的数
		int b = (int)(Math.random());			//如果百位的数==随机抽取的数则获奖.
		for(int i=0;i<10;i++){
			if(a==b){
				System.out.println(n+"号客户是幸运客户,获得精美MP3一个!");
			}else{		
				System.out.println(n+"号客户不是幸运客户!"+b);
			}
		}
	}
}