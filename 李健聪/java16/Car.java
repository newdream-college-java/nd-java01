package 十六章作业;

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
			System.out.println("您一共租了"+day+"天，您租的车是"+"林荫大道"+"  车牌号为:"+getNo()+"一共"+sum+"元");
		}else if(this.type.equals("2")){
			sum=day*400;
			System.out.println("您一共租了"+day+"天，您租的车是"+"GT8"+"  车牌号为:"+getNo()+"一共"+sum+"元");
		}else if(this.type.equals("3")){
			sum=day*500;
			System.out.println("您一共租了"+day+"天，您租的车是"+"宝马三系"+"  车牌号为:"+getNo()+"一共"+sum+"元");
		}
		
		
	}

	
}
