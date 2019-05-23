package Æû³µ×â½èÏµÍ³;

import java.util.Scanner;

public abstract class MotoVehicle {
	Scanner input=new Scanner(System.in);
	private  int money;
	private String no;
	public MotoVehicle() {
		// TODO Auto-generated constructor stub
		 
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setMoney(int money){
		this.money=money;
	}
	public int getMoney(){
		return money;
	} 
	public abstract void calcRent(int day) ;
	public String getNo() {
		return no;
	}
	
	
	
	
	
}
