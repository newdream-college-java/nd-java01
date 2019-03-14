package Ê®ÁùÕÂ×÷Òµ;

public abstract class Moto {
	public Moto(final String no){
		this.no=no;
	}
	public abstract void Ts(int day);
	private String no;
	private String brand;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
		
}
