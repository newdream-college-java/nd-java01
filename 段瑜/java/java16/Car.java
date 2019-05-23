package 汽车租借系统;

import java.util.Random;
import java.util.Scanner;

public class Car extends MotoVehicle{
	public Car() {
		
		// TODO Auto-generated constructor stub
	}
	Scanner input=new Scanner(System.in);
	Random rd=new Random();
	private String type;	 
	public void calcRent(int days){
		 if(this.type.equals("商务舱GL8")) {
	            System.out.println("您租的车位：GL8,天数为："+days+"天；费用为："+(days*600));
	        }else if(this.type.equals("550i")) {
	            System.out.println("您租的车位：550i,天数为："+days+"天；费用为："+(days*500));
	            
	        }else if(this.type.equals("林荫大道")) {
	            System.out.println("您租的车位：林荫大道,天数为："+days+"天；费用为："+(days*300));	            	        
	        }
		}
	public String getType() {
		return type;
	}	
	public void setType(String type) {
		this.type = type;
	}
	
}
