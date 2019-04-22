package 第15章继承作业____2车辆租赁;

public class Bus extends MotoVehicle {
	private String busBrand;
	private String seats;
	private int price;
	
	public Bus(String busBrand,String seats,int price,int days){
		this.busBrand =busBrand;
		this.seats=seats;
		this.price=price;
		setDays(days);
	}
	@Override
	public void calculateRent() {
		// TODO Auto-generated method stub
		setMoney(price*getDays());
	}

	public void show(){
		System.out.println("分配给您的汽车牌号是："+getNumber()+"顾客您好！您需要支付的租赁费用是"+getMoney());
	}
}
