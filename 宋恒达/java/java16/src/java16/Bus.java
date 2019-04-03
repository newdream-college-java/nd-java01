package java16;

public class Bus extends MotoVehicle{
	private int seatCount;
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String brand, String no) {
		super(brand, no);
		// TODO Auto-generated constructor stub
	}

	public Bus(String brand,String no,int seatCount) {
		super(brand,no);
		this.seatCount = seatCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public int calcRent(int days) {
		// TODO Auto-generated method stub
		if(seatCount<=16) {
			return 800*days;
		}else if(seatCount>16) {
			return 1500*days;
		}
		return 0;
	}

}
