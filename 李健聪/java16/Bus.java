package ʮ������ҵ;

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
			Bus bus=new Bus("��A88888","���",16);
			System.out.println("����ĳ���Ϊ�𱭣�����Ϊ"+day+"��     ���޽��Ϊ:"+sum+"���ƺ�Ϊ��"+getNo());
		}else if(seatCount>16){
			sum=day*1600;
			Bus bus=new Bus("��A66666","���",17);
			System.out.println("����ĳ���Ϊ����������Ϊ"+day+"��     ���޽��Ϊ:"+sum+"���ƺ�Ϊ��"+getNo());
		}
	}
}
