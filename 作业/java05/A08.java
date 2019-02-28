/**
**循环输入商品编号，显示对应的商品价格，输入“n”结束循环
**继续循环输入商品编号和购买数量,自动计算每种商品的价钱(单价*购买数量)，并
**累加到总金额
**当输入 n 时结账，结账时假设享受八折优惠，计算应付金额并找零
**/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		boolean flag1=true;
		double price1=245;
		double price2=340;
		double price3=400;
		Scanner input=new Scanner(System.in);
		System.out.println("*****************************");
		System.out.println("请选择购买的商品编号:");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("*****************************");
		do{
			System.out.print("请输入商品编号:");
			int a=input.nextInt();
			switch(a){
				case 1: 
					System.out.println("T恤\t￥"+price1);
					break;
				case 2:
					System.out.println("网球鞋\t￥"+price2);
					break;
				case 3:
					System.out.println("网球拍\t￥"+price3);
					break;
				default:
					System.out.println("输入错误");
			}
			System.out.println();
			System.out.println();
			System.out.print("是否继续（y/n）");
			String b=input.next();
			if(b.equals("y")){
				continue;
			}else{
				flag1=false;
			}
		}while(flag1);
		System.out.println("*****************************");
		System.out.println("请选择购买的商品编号:");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("*****************************");
		System.out.println();
		System.out.println();
		boolean flag2=true;
		double sum=0;
		do{
			System.out.print("请输入商品编号:");
			int c=input.nextInt();
			System.out.print("请输入购买数量:");
			int d=input.nextInt();
			switch(c){
				case 1:
					System.out.println("T恤￥"+price1+"\t数量"+d+"\t合计					  		￥"+(price1*d));
					sum+=(price1*d);
					break;
				case 2:
					System.out.println("网球鞋￥"+price2+"\t数量"+d+"\t合计					  		￥"+(price2*d));
					sum+=(price2*d);
					break;
				case 3:
					System.out.println("网球拍￥"+price3+"\t数量"+d+"\t合计					  		￥"+(price3*d));
					sum+=(price3*d);
					break;
				default:
					System.out.println("输入错误");
						
			}
			System.out.print("是否继续（y/n）");	
			String e=input.next();
			if(e.equals("y")){
				continue;
			}else{
				System.out.println();
				System.out.println();
				System.out.print("折扣:");
				double discount=input.nextDouble();
				double shouldPayCount=sum*discount;
				System.out.println("应付金额:"+shouldPayCount);
				System.out.print("实付金额:");
				double payCount=input.nextDouble();
				System.out.println("找钱:"+(payCount-shouldPayCount));
				flag2=false;
			}		
		}while(flag2);
	}
}