package 作业;


public abstract class MotoVehicle {
	
	private	String brand;//品牌
	private int no;//车牌
	public MotoVehicle(int no) {
		this.no=no;
		
		
	}


	/*计算天数的方法--抽象方法*/
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
