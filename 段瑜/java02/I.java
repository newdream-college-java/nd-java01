import java.util.Scanner;
public class I{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double sj=input.nextDouble();
 		System.out.println("***********消费单************");
		System.out.print("购买物品");
		System.out.print("\t单价");
		System.out.print("\t个数");
		System.out.println("\t金额");
		System.out.print("T恤");
		int a=245,a1=2,a2=a*a1;
		System.out.print("\t\t￥"+a);
		System.out.print("\t"+a1);
		System.out.println("\t￥"+a2);

		System.out.print("网球鞋");
		int b=570,b1=1,b2=b*b1;
		System.out.print("\t\t￥"+b);
		System.out.print("\t"+b1);
		System.out.println("\t￥"+b2);
		
		System.out.print("网球拍");
		int c=320,c1=1,c2=c*c1;
		System.out.print("\t\t￥"+c);
		System.out.print("\t"+c1);
		System.out.println("\t￥"+c2);

		double zk=0.8,zje,zq,jf;
	
		System.out.println("折扣：\t\t8折");
		zje=a2+b2+c2;
		System.out.println("消费总金额\t\t￥"+zje);
		
		System.out.println("实际交付\t\t￥"+sj);
		jf=zje/100*3;
		System.out.println("本次购物所获的积分是："+jf);
		System.out.println();

	}
}