package ʮ������ҵ;

public  class Car extends Moto {
	private int sum=0;
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	private String type;
	public Car(final String no,final String brand,final String type){
		super(no);
		setBrand(brand);
		this.type=type;
	}
	public void Ts(int day){
		if(this.type.equals("1")){
			sum=day*300;
			System.out.println("��һ������"+day+"�죬����ĳ���"+"������"+"  ���ƺ�Ϊ:"+getNo()+"һ��"+sum+"Ԫ");
		}else if(this.type.equals("2")){
			sum=day*400;
			System.out.println("��һ������"+day+"�죬����ĳ���"+"GT8"+"  ���ƺ�Ϊ:"+getNo()+"һ��"+sum+"Ԫ");
		}else if(this.type.equals("3")){
			sum=day*500;
			System.out.println("��һ������"+day+"�죬����ĳ���"+"������ϵ"+"  ���ƺ�Ϊ:"+getNo()+"һ��"+sum+"Ԫ");
		}
		
		
	}

	
}
