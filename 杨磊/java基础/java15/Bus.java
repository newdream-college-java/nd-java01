package com.nd.zuoye.yl;


public class Bus extends MotoVehicle{
	//��λ��
	private int seatCount;
	
	public Bus() {
		super();
	}

//getset����
	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public final static String �� = "��";
	public final static String �� = "����";
	public final static String С��16 = "<=16";
	public final static String ����16 = ">16";

	public void calcRent(int days2, String brand2, String seatCount) {
		Rent1 a = new Rent1();
		for(int i=0;i<a.busBrandSeatCountMoneyNo.length;i++){
			String[] busInfos = a.busBrandSeatCountMoneyNo[i].split("-");
			if(brand2.equals(busInfos[0])&&seatCount.equals(busInfos[1])){
				System.out.println("�����޵Ľγ�Ϊ"+busInfos[0]+busInfos[1]+"�����Ϊ��"+busInfos[2]+"�ܷ���Ϊ��"+(days2*Integer.parseInt(busInfos[2])));
				System.out.println("�����ĳ���Ϊ��"+busInfos[3]);
			}
		}

		
	}
	public void calcRent(int days,String brand) {
		// TODO Auto-generated method stub
		
	}


}
