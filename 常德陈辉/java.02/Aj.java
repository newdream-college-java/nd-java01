/*写一个Pay类的，实现以下需求，结算时用户支付1500元，打印购物小票计算此次购物获得的会员积分（每消费一百元获得三分）*/
import java.util.Scanner;
public class Aj{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("您此次消费1500元");
	int money=1500;
	int a;
	a=money/100*3;
	System.out.print("您此次购物获得的积分为："+a);
	}

}