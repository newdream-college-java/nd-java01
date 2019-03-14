package 第15章继承作业____2车辆租赁;

public  class Truck extends MotoVehicle {
	private int Price;
	private int wieght;
	
	public Truck(String truckBrand,int Price,int wieght,int days){
		this.Price=Price;
		this.wieght=wieght;
		setDays(days);
	}
	@Override
	public void calculateRent() {
		setMoney(Price*getDays()*wieght);
		
	}
	public void show(){
		System.out.println("分配给您的汽车牌号是："+getNumber()+"顾客您好！您需要支付的租赁费用是"+getMoney());
	}

}
