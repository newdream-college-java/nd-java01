import java.util.Scanner;
public class N{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入支付金额：");
		int a=input.nextInt();
		int b=a/100;
		int c=b*3;
		System.out.print("此次购物获得的会员积分:"+c);
	}
}