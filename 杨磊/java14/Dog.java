package com.nd.zuoye.yl;

public class Dog extends Pet{
	private String strain = "��������������";
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String name,String strain){
		super(name);
		this.strain = strain;
	}



	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}


	public void print() {
		System.out.println("�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+"������"+strain);
		
	}

}
