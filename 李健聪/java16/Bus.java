package 十六章作业;

public class Bus extends Moto {
	private int seatCount;
	int sum=0;
	public Bus(final String no,final String brand,final int seatCount){
		super(no);
		setBrand(brand);
		this.seatCount=seatCount;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public void Ts(int day) {
		
		// TODO Auto-generated method stub
		if(seatCount<=16){
			sum=day*800;
			Bus bus=new Bus("湘A88888","大巴",16);
			System.out.println("您租的车型为金杯，租期为"+day+"天     租赁金额为:"+sum+"车牌号为："+getNo());
		}else if(seatCount>16){
			sum=day*1600;
			Bus bus=new Bus("湘A66666","大巴",17);
			System.out.println("您租的车型为金龙，租期为"+day+"天     租赁金额为:"+sum+"车牌号为："+getNo());
		}
	}
}
