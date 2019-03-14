package 第15章继承作业;

import java.util.Scanner;


public class TestMotoVehicle {
	Scanner input =new Scanner(System.in);
	MotoVehicle m1 =new MotoVehicle();
	Car car1 = new Car();
	public void inputDays(){
		System.out.println("欢迎来到汽车租赁公司");
		System.out.print("请输入要租赁的天数");
		m1.setDays(input.nextInt());
		inputMotoVehicleType();
	}
	public void inputMotoVehicleType(){
		System.out.print("请输入要租赁的汽车类型（1.轿车\t2.客车）");
		m1.setType(input.nextInt());
		if(m1.getType()==1){
			inputCarBand();
		}else{
			System.out.print("请选择客车的类型(3.金杯(<=16座)4.金龙(>16座))");
			setBusType();
		}
	}
	public void setBusType(){
		int choice=input.nextInt();
		if(choice==3){
			m1.setNumber("京BJ1234\n\n");
			System.out.print("分配给您的汽车牌号是："+m1.getNumber());
			m1.setPrice(800);
			showPay();
		}else{
			m1.setNumber("京BX2224\n\n");
			System.out.print("分配给您的汽车牌号是："+m1.getNumber());
			m1.setPrice(1500);
			showPay();
		}
	}
	public void inputCarBand(){
		System.out.print("请输入要租赁的汽车品牌（1.宝马\t2.别克）");
		car1.setBrand(input.nextInt());
		if(car1.getBrand()==2){
			CarTypePrice();
		}else{
			m1.setNumber("京BS9999");
			System.out.print("分配给您的汽车牌号是："+m1.getNumber());
			m1.setPrice(500);
			showPay();
		}
	}
	public void CarTypePrice(){
		System.out.print("请输入轿车的型号2.商务舱GL8\t3.林荫大道");
		car1.setCarType(input.nextInt());
		if(car1.getCarType()==3){
			m1.setPrice(300);
			m1.setNumber("分配给您的汽车牌号是：京BK5543\n\n");
			System.out.print(m1.getNumber());
			showPay();
		}else if(car1.getCarType()==2){
			m1.setPrice(600);
		}
	}

	public void showPay(){
		m1.setPay(m1.getDays()*m1.getPrice());
		System.out.print("顾客您好！您需要支付的租赁费用是"+m1.getPay()+"。");
	}
//	public void show(){
//		MotoVehicle m1 = new MotoVehicle();
//		System.out.println("欢迎来到汽车租赁公司!");
//		System.out.print("请输入要租赁的天数\n");
//		m1.setDays(input.nextInt());
//		System.out.print("请输入要租赁汽车类型（1：轿车\t2.客车）\n");
//		m1.setType(input.nextInt());
//		if(m1.getType()==1){
//			Car car1= new Car();
//			System.out.print("请输入要租赁的汽车品牌（1.宝马\t2.别克）");
//			int choice = input.nextInt();
//			if(choice==2){
//				System.out.print("请输入轿车的型号2.商务舱GL8\t3.林荫大道");
//				int choiceCarType=input.nextInt();
//				if(choiceCarType==3){
//					int pay = m1.getDays()*300;
//					car1.setPay(pay);
//					System.out.println("您需要支付"+car1.getPay());
//				}
//			}
//		}TestMotoVehicle
//		
//	}
	public static void main(String[] args) {
		TestMotoVehicle ini1=new TestMotoVehicle();
		ini1.inputDays();
	}


}
