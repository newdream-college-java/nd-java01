package ��15�¼̳���ҵ____2��������;

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
		System.out.println("��������������ƺ��ǣ�"+getNumber()+"�˿����ã�����Ҫ֧�������޷�����"+getMoney());
	}
}
