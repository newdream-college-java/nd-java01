import java.util.Scanner;
public class Zy8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用Myshopping管理系统");
		System.out.println("**********************************");
		System.out.println("1.客户管理系统2.购物结算3.真情回馈.4.注销");
		System.out.println("**********************************");
		System.out.println("请选择，输入数字:");
		int u=input.nextInt();
		int k=1;
		while(k>=1){		
			if(u==2){
				System.out.println("执行购物结算");
				k=0;
			}else{
				System.out.println("输入错误，请从新输入:");
				u=input.nextInt();
			}	
		}	
		int i=1;
		double d=245.0;	
		double e=300.0;	
		double f=400.0;	
		double sum=0;
		double g=0;
		while(i>=1){
			System.out.println("Myshopping管理系统>购物结算");
			System.out.println("**********************************");
			System.out.println("请选择购买的商品编号：");
			System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
			System.out.println("**********************************");
			System.out.print("请输入商品编号：");
			int a=input.nextInt();
			System.out.print("请输入购买数量：");
			int b=input.nextInt();		
			if(a==1){
				g=d*b;	
				System.out.println("T恤￥"+d+"\t数量"+b+"\t合计"+g);			
			}else if(a==2){
				g=e*b;			
				System.out.println("网球鞋￥"+e+"\t数量"+b+"\t合计"+g);			
			}else if(a==3){
				g=f*b;			
				System.out.println("网球拍￥"+f+"\t数量"+b+"\t合计"+g);			
			}else{	
				
				System.out.println("输入错误，请从新输入：");
				int q=1;
				while(q>=1){
					
					System.out.print("请输入商品编号：");
					a=input.nextInt();
					System.out.print("请输入购买数量：");
					b=input.nextInt();
					if(a==1){
						g=d*b;	
						System.out.println("T恤￥"+d+"\t数量"+b+"\t合计"+g);
						q=0;		
					}else if(a==2){
						g=e*b;			
						System.out.println("网球鞋￥"+e+"\t数量"+b+"\t合计"+g);	
						q=0;		
					}else if(a==3){
						g=f*b;			
						System.out.println("网球拍￥"+f+"\t数量"+b+"\t合计"+g);	
						q=0;		
					}else{
						System.out.println("输入错误，请从新输入：");
								
					}
				}
			}
			System.out.println("是否继续（Y/N）");
			String c=input.next();	
			if(c.equals("Y")){
				sum=g+sum;
			}else if(c.equals("N")){
				sum=g+sum;
				i=0;
			}else{
				System.out.println("输入错误，请从新输入：");
				int w=1;
				while(w>=1){
					System.out.println("是否继续（Y/N）");
					c=input.next();	
					if(c.equals("Y")){
						sum=g+sum;
						w=0;
					}else if(c.equals("N")){
						sum=g+sum;
						w=0;
						i=0;
					}else{
						System.out.println("输入错误，请从新输入：");
								
					}
				}
			}
			
		}
		double z=0.8;
		System.out.println("折扣："+z);
		System.out.println("应付金额："+sum*z);
		System.out.print("请输入实付金额：");
		double s=input.nextDouble();
		System.out.println("找钱："+(s-sum*z));		
	}
}