package ��ҵ;


public abstract class MotoVehicle {
	
	private	String brand;//Ʒ��
	private int no;//����
	public MotoVehicle(int no) {
		this.no=no;
		
		
	}


	/*���������ķ���--���󷽷�*/
	public abstract void calcRent(int days); 
		
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
