package �������ϵͳ;

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
		 if(this.type.equals("�����GL8")) {
	            System.out.println("����ĳ�λ��GL8,����Ϊ��"+days+"�죻����Ϊ��"+(days*600));
	        }else if(this.type.equals("550i")) {
	            System.out.println("����ĳ�λ��550i,����Ϊ��"+days+"�죻����Ϊ��"+(days*500));
	            
	        }else if(this.type.equals("������")) {
	            System.out.println("����ĳ�λ��������,����Ϊ��"+days+"�죻����Ϊ��"+(days*300));	            	        
	        }
		}
	public String getType() {
		return type;
	}	
	public void setType(String type) {
		this.type = type;
	}
	
}
