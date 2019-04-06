import java.util.*;
public class work9{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("欢迎使用MyShopping管理系统 \n\n\t1.客户信息管理\n\t2.购物结算\n\t3.真情回馈\n\t4.注销\n");
		for(;;){
			System.out.println("请选择，输入数字：");
			int m = input.nextInt();
			switch(m){
				case 1:
					System.out.print("\t客户信息管理\n\n");
					break;
				case 2:
					System.out.print("\t购物结算\n\n");
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
					break;
				case 3:
					System.out.print("\t真情回馈\n\n");
					break;
				case 4:
					System.out.print("注销");
					break;
				default:
					System.out.print("输入错误");
					break;
			}
		}
	}
}