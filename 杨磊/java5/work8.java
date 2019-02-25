import java.util.*;
public class work8{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("请选择购买的商品编号：\n1.T恤\t2.网球鞋\t3.网球拍\n");
		System.out.print("请输入商品编号：");
		int a=input.nextInt();
		System.out.print("请输入购买数量：");
		int b=input.nextInt();
		double c= 0,f=0;
		switch(a){
			case 1:
				f=245.0;
				break;
			case 2:
				f=570.0;
				break;
			case 3:
				f=320.0;
				break;
			default:
				System.out.print("输入错误");
				break;
		}
		System.out.print("请输入折扣：");
		double d=input.nextDouble();
		c = f*b*d;
		System.out.println("应付金额："+ c);
		System.out.print("实付金额：");
		double e=input.nextDouble();
		System.out.print("\n");
		System.out.print("找钱:"+(e-c));
		

	}
}