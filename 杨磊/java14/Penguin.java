package com.nd.zuoye.yl;

public class Penguin extends Pet{
	private String sex = "Q��";
	
	
	public final static String SEX_MALE = "Q��";
	public final static String SEX_FEMALE = "Q��";
	public Penguin() {
		// TODO Auto-generated constructor stub
	}
	public Penguin(String name,String sex) {
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public void print() {
		System.out.println("�ҵ����ֽ�"+getName()+"������ֵ��"+getHealth()+"�������˵����ܶ���"+getLove()+"������"+sex);		
	}
}
