import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用MyShopping管理系统");
		System.out.println("*****************************************");
		System.out.println("\t1.客户信息管理\n\t2.购物结算\n\t3.真情回馈\n\t4.注销");
		System.out.println("*****************************************");
		double x=245,y=314,z=450,j=0,q=0.8,d=0;
		int i=1;
		while(i!=0){
			int a=input.nextInt();
			if(a==1){
				System.out.println("MyShopping管理系统>客户信息管理");
				i=0;
			}else if(a==2){
				System.out.println("MyShopping管理系统>购物结算");
				System.out.println("*****************************************");
				System.out.println("\t请选择购买的商品编号\n\t1.T恤\n\t2.网球鞋\n\t3.网球拍");
				System.out.println("*****************************************");
				while(i!=0){
				System.out.print("请输入商品编号：");
				int b=input.nextInt();
				System.out.print("\n请输入商品数量：");
				int c=input.nextInt();
				switch(b){
					case 1:
						d=x*c;
						System.out.println("T恤￥"+x+"数量："+c+"合计￥"+d);
						break;
					case 2:
						d=y*c;
						System.out.println("网球鞋￥"+y+"数量："+c+"合计￥"+d);
						break;
					case 3:
						d=z*c;
						System.out.println("网球鞋￥"+z+"数量："+c+"合计￥"+d);
						break;
					default:
						System.out.println("输入错误请重新输入：");
						break;
				
					}
				/*if(b==1){
					d=x*c;
					System.out.println("T恤￥"+x+"数量："+c+"合计￥"+d);
					break;
				}else if(b==2){
					d=y*c;
					System.out.println("网球鞋￥"+y+"数量："+c+"合计￥"+d);
					break;
				}else if(b==3){
					d=z*c;
					System.out.println("网球鞋￥"+z+"数量："+c+"合计￥"+d);
					break;
				}else{
					System.out.println("输入错误请重新输入：");
					break;
				}*/
					System.out.print("是否继续（y/n）：");
					String yn=input.next();
					if(yn.equals("y")){
						j=j+d;
					}else if(yn.equals("n")){
						j=(j+d)*q;
						
						System.out.println("折扣："+q+"应付金额:"+j);
						System.out.print("实付金额：");
						int w=input.nextInt();
						double e;
						e=w-j;
						System.out.print("\n找钱："+e);
						i=0;
					}else{
						System.out.println("输入错误，请重新输入");
						yn=input.next();
					if(yn.equals("y")){
						j=j+d;
					}else if(yn.equals("n")){
						j=(j+d)*q;
						
						System.out.println("折扣："+q+"应付金额:"+j);
						System.out.print("实付金额：");
						int w=input.nextInt();
						double e;
						e=w-j;
						System.out.print("\n找钱："+e);
						i=0;
					}
					}
				}
			}else if(a==3){
				System.out.println("MyShopping管理系统>真情回馈");
				i=0;
			}else if(a==4){
				System.out.println("MyShopping管理系统>注销");
				i=0;
			}else{
				System.out.println("输入错误，请重新输入：");
			}
		}
	}
}