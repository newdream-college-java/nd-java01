
public class Bus extends MotoVehicle{
	private int seatCount;
	public Bus(final String no,final int seatCount,final String brand){
		super(no);
		this.seatCount=seatCount;
		setBrand(brand);
	}
	public void calcRent(int days){
		if(seatCount<=16){
			System.out.println("����ĳ�Ϊ��"+getBrand()+"����Ϊ��"+getNo()+",16�����µĳ�����Ϊ��"+days+"�죬����Ϊ��"+(days*800));
		}else if(seatCount>16){
			System.out.println("����ĳ�Ϊ��"+getBrand()+"����Ϊ��"+getNo()+",16�����ϵĳ�����Ϊ��"+days+"�죬����Ϊ��"+(days*1500));
		}
	}
}
