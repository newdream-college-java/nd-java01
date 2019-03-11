package java15;

public class Car extends MotoVehicle{
	private String type;

	public Car(String no,String type) {
		setNo(no);
		this.type = type;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public double CalcRent(int days) {
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
