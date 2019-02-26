import java.util.Scanner;
public class java07{	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("****************消费单*****************");
		System.out.println("购买\t物品单价\t个数\t金额");
		System.out.println("T恤\t￥245\t\t2\t￥490");
		System.out.println("网球鞋\t￥570\t\t1\t￥570");
		System.out.println("网球拍\t￥320\t\t1\t￥320");
		int a=input.nextInt();//总金额
		int b=490;//T恤
		int c=570;//网球鞋
		int d=320;//网球拍
		double e=0.8;
		double f=(b+c+d)*e;//消费总金额
		double g=a-f;//找钱
		int h=(int)f/100*3;//积分
		System.out.print("\n折扣：\t\t\t8折"+"\n消费总金额\t\t￥"+f+"\n实际消费\t\t￥"+a+"\n找钱\t\t\t￥"+g+"\n本次购物所获的积分：\t"+h);
		
			




	}




}