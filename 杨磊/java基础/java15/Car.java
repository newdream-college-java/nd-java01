package com.nd.zuoye.yl;


public class Car extends MotoVehicle{
	//����----2 
	private String type;
	
	
	//���췽��1
	public Car() {
		super();
	}
	//----------------
	public Car(String brand,String no,int money,String type){
		//��ʽһ	
		//setNo(no);
		//��ʽ��
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
	
	
	public final static String �� = "����";
	public final static String �� = "���";
	public final static String �� = "��ϵ";
	public final static String i = "550i";
	public final static String G = "GL8";
	public final static String �� = "������";
	
	//����
	public void calcRent(int days1,String brand1,String type1) {
		Rent1 a = new Rent1();
		for(int i=0;i<a.carBrandTypeMoneyNo.length;i++){
			String[] carInfos = a.carBrandTypeMoneyNo[i].split("-");
			if(brand1.equals(carInfos[0])&&type1.equals(carInfos[1])){
				System.out.println("�����޵Ľγ�Ϊ"+carInfos[0]+carInfos[1]+"�����Ϊ��"+carInfos[2]+"�ܷ���Ϊ��"+(days1*Integer.parseInt(carInfos[2])));
				System.out.println("�����ĳ���Ϊ��"+carInfos[3]);
			}
		}

		
	}
	public void calcRent(int days, String brand) {
		// TODO Auto-generated method stub
		
	}

}
