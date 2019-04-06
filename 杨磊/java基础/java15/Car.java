package com.nd.zuoye.yl;


public class Car extends MotoVehicle{
	//车型----2 
	private String type;
	
	
	//构造方法1
	public Car() {
		super();
	}
	//----------------
	public Car(String brand,String no,int money,String type){
		//方式一	
		//setNo(no);
		//方式二
		super(brand,no,money);
		this.type = type;
		
	}

	
	//getset
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public final static String 宝 = "宝马";
	public final static String 别 = "别克";
	public final static String 七 = "七系";
	public final static String i = "550i";
	public final static String G = "GL8";
	public final static String 林 = "林荫大道";
	
	//租赁
	public void calcRent(int days1,String brand1,String type1) {
		Rent1 a = new Rent1();
		for(int i=0;i<a.carBrandTypeMoneyNo.length;i++){
			String[] carInfos = a.carBrandTypeMoneyNo[i].split("-");
			if(brand1.equals(carInfos[0])&&type1.equals(carInfos[1])){
				System.out.println("你租赁的轿车为"+carInfos[0]+carInfos[1]+"日租金为："+carInfos[2]+"总费用为："+(days1*Integer.parseInt(carInfos[2])));
				System.out.println("你分配的车牌为："+carInfos[3]);
			}
		}

		
	}
	public void calcRent(int days, String brand) {
		// TODO Auto-generated method stub
		
	}

}
