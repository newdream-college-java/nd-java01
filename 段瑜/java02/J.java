import java.util.Scanner;
public class J{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("T恤\t\t￥245\t2\t\t￥490");
		System.out.println("网球鞋\t\t￥570\t1\t\t￥570");
		System.out.println("T恤\t\t￥320\t1\t\t￥320");
		System.out.println("支付金额：");
		int a=input.nextInt();
		int b=490;
		int c=570;
		int d=320;
		double h=8;
		double e=(d+b+c)*h/10;
		int f=(int)e/100*3;
		double g=a-e;
		System.out.println("折扣：\t\t\t"+h+"折");
		System.out.println("消费总金额：\t\t￥"+e);
		System.out.println("找钱：\t\t\t￥"+g);
		System.out.println("本次购物所获的积分是：\t"+f);
}
}