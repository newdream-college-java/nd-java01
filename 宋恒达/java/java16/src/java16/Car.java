package java16;

public class Car extends MotoVehicle{
	private String type;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String no) {
		super(brand, no);
		// TODO Auto-generated constructor stub
	}

	public Car(String brand,String no,String type) {
		super(brand,no);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int calcRent(int days) {
		// TODO Auto-generated method stub
		if(this.type.equals("GL8")) {
			return 600*days;
		}
		else if(this.type.equals("宝马")) {
			return 500*days;
			
		}else if(this.type.equals("林荫大道")) {
			return 300*days;
		}
		return 0;
	}

}
