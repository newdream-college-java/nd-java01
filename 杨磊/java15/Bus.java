package com.nd.zuoye.yl;


public class Bus extends MotoVehicle{
	//座位号
	private int seatCount;
	
	public Bus() {
		super();
	}

//getset方法
	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public final static String 杯 = "金杯";
	public final static String 龙 = "金龙";
	public final static String 小于16 = "<=16";
	public final static String 大于16 = ">16";

	public void calcRent(int days2, String brand2, String seatCount) {
		Rent1 a = new Rent1();
		for(int i=0;i<a.busBrandSeatCountMoneyNo.length;i++){
			String[] busInfos = a.busBrandSeatCountMoneyNo[i].split("-");
			if(brand2.equals(busInfos[0])&&seatCount.equals(busInfos[1])){
				System.out.println("你租赁的轿车为"+busInfos[0]+busInfos[1]+"日租金为："+busInfos[2]+"总费用为："+(days2*Integer.parseInt(busInfos[2])));
				System.out.println("你分配的车牌为："+busInfos[3]);
			}
		}

		
	}
	public void calcRent(int days,String brand) {
		// TODO Auto-generated method stub
		
	}


}
