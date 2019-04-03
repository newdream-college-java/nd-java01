package java15;

public class Bus extends MotoVehicle{
	private int seatCount;
	
	public Bus() {
		
	}

	public Bus(String no,int seatCount,String brand) {
		setNo(no);
		this.seatCount = seatCount;
		setBrand(brand);
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public double CalcRent(int days) {
		if(seatCount<=16) {
			return 800*days;
		}else if(seatCount>16) {
			return 1500*days;
		}
		return 0;
	}
}
