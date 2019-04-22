package 第15章继承作业____2车辆租赁;

public class Car extends MotoVehicle{
	//private int brand;
	private String carType;
	private int price;
	public Car(int price,int days,String carType){
		this.price=price;
		setDays(days);
		this.carType=carType;
	}
	/*public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}*/
	@Override
	public void calculateRent() {
		// 计算Car类中的价格
		setMoney(price*getDays());
	}
	public void show(){
		System.out.println("分配给您的汽车牌号是："+getNumber()+"顾客您好！您需要支付的租赁费用是"+getMoney());
	}

}
