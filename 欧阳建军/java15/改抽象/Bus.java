package 第15章继承2抽象类抽象方法;

import java.util.Scanner;

public final class Bus extends MotoVehicle {
	private int busPay;
	private int busPrice;
	
//	public void CalcRent(int days,int carPrice){
//		busPay= busPrice*days;
//	}
	public void showBusPay(){
		System.out.println("顾客您好！您需要支付的租赁费用是"+busPay+"。");
	}
	public void choiceBusType(){
		Scanner input =new Scanner(System.in);
		System.out.print("请选择客车类型（1.金杯<=16座\t2.金龙>=16座）");
		int choice=input.nextInt();
		if(choice==1){
			CalcRent(days,800);
			System.out.println("分配给您的汽车品牌是："+getNo()+"\n");
			showBusPay();
		}else{
			CalcRent(days,1500);
			System.out.println("分配给您的汽车品牌是："+getNo()+"\n");
			showBusPay();
		}
	}
	@Override
	public void CalcRent(int days, int price) {
		// TODO Auto-generated method stub
		busPay = days*price;
		
	}
}
