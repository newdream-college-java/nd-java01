package ��15�¼̳���ҵ____2��������;

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
		System.out.println("��������������ƺ��ǣ�"+getNumber()+"�˿����ã�����Ҫ֧�������޷�����"+getMoney());
	}

}
