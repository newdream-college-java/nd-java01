import java.util.Scanner;
public class zy9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统>购物结算");
		System.out.println("************************************");
		System.out.println("请选项购买的商品编号："+"\n1.T恤"+"\t2.网球鞋"+"\t3.网球拍");
		System.out.println("************************************");
		System.out.print("请输入商品编号：");
		int bh=input.nextInt();
		System.out.print("请输入购买数量：");
		int sl=input.nextInt();
		double a=245.0,b=570.0,c=320.0,h=0;	
		while(bh>=1&&bh<=3){
			if(bh==1){
				System.out.println("T恤\t￥"+a);
				
				System.out.print("数量："+sl);
				h=a*sl;
				System.out.print("合计：￥"+h);
				System.out.print("是否继续（y/n）");
				String yn=input.next();
				if(yn.equals("n")){
					System.out.println("折扣：\t0.8");
					System.out.println("应付金额："+h);
					System.out.println("请输入你实付的金额");
					System.out.print("实付金额：");
					double sf=input.nextDouble();
					double zq=sf-h;
					System.out.println("找钱："+zq);
					break;
				}
			}
			if(bh==2){
				System.out.println("网球鞋\t￥"+b);
				System.out.print("数量："+sl);
				h=b*sl;
				System.out.print("合计：￥"+h);
				System.out.print("是否继续（y/n）");
				String yn=input.next();
				if(yn.equals("n")){
					System.out.println("折扣：\t0.8");
					System.out.println("应付金额："+h);
					System.out.println("请输入你实付的金额");
					System.out.print("实付金额：");
					double sf=input.nextDouble();
					double zq=sf-h;
					System.out.println("找钱："+zq);
					break;
				}
			}
			if(bh==3){
				System.out.println("网球拍\t￥"+c);
				System.out.print("数量："+sl);
				h=c*sl;
				System.out.print("合计：￥"+h);
				System.out.print("是否继续（y/n）");
				String yn=input.next();
				if(yn.equals("n")){
					System.out.println("折扣：\t0.8");
					System.out.println("应付金额："+h);
					System.out.println("请输入你实付的金额");
					System.out.print("实付金额：");
					double sf=input.nextDouble();
					double zq=sf-h;
					System.out.println("找钱："+zq);
					break;
				}
			}
		}
	}
}