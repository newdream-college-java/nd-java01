package 第15章继承2抽象类抽象方法;

import java.util.Scanner;

public final class Car extends MotoVehicle{
	private String carType;
	private String carBand;
	private int carPrice;
	private int carPay;
	
	public void CalcRent(int days,int carPrice){
		carPay= carPrice*days;
	}
	public void choiceBrand(){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入要租赁汽车的品牌（1.宝马2.别克）:");
		int choice=input.nextInt();
		if(choice==2){
			System.out.print("请输入轿车的型号（2.商务舱GL8"+"\t"+"3.林荫大道）:");
			choice=input.nextInt();
			if(choice==3){
				CalcRent(days,300);
				System.out.println("分配给您的汽车品牌是："+getNo()+"\n");
				showCarPay();
			}else{
				CalcRent(days,600);
				System.out.println("分配给您的汽车品牌是："+getNo()+"\n");
				showCarPay();
			}
		}else{
			CalcRent(days,500);
			System.out.println("分配给您的汽车品牌是："+getNo()+"\n");
			showCarPay();
		}
	}
	public void showCarPay(){
		System.out.println("顾客您好！您需要支付的租赁费用是"+carPay+"。");
	}
}
