
public class Bus extends MotoVehicle{
	private int seatCount;
	public Bus(final String no,final int seatCount,final String brand){
		super(no);
		this.seatCount=seatCount;
		setBrand(brand);
	}
	public void calcRent(int days){
		if(seatCount<=16){
			System.out.println("您租的车为："+getBrand()+"车牌为："+getNo()+",16座以下的车天数为："+days+"天，费用为："+(days*800));
		}else if(seatCount>16){
			System.out.println("您租的车为："+getBrand()+"车牌为："+getNo()+",16座以上的车天数为："+days+"天，费用为："+(days*1500));
		}
	}
}
