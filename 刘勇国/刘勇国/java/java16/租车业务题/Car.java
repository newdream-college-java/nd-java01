package ��15�¼̳���ҵ____2��������;

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
		// ����Car���еļ۸�
		setMoney(price*getDays());
	}
	public void show(){
		System.out.println("��������������ƺ��ǣ�"+getNumber()+"�˿����ã�����Ҫ֧�������޷�����"+getMoney());
	}

}
