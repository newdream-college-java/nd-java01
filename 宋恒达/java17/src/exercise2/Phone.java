package exercise2;

public class Phone {
	private String brand;
	private String type;
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(String brand, String type) {
		super();
		this.brand = brand;
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void print() {
		System.out.println("这是一款型号为"+type+"的"+brand+"手机");
	}
}
