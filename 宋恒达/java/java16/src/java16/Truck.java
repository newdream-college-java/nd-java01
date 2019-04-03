package java16;

public class Truck extends MotoVehicle{

	private int weight;
	
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Truck(String brand,String no,int weight) {
		super(brand,no);
		this.weight = weight;
	}

	public Truck(String brand, String no) {
		super(brand, no);
		// TODO Auto-generated constructor stub
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int calcRent(int days) {
		// TODO Auto-generated method stub
		
		return 50*days*weight;
	}

}
