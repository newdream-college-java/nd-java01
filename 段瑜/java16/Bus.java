package 汽车租借系统;

public  class Bus extends MotoVehicle{
	private String seatCount;
	public String getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}
	public Bus() {
		
		
	}
	public void calcRent(int days){
		if(this.seatCount.equals("小于16座的金龙")) {
            System.out.println("您租的车为："+getSeatCount()+ "16座以下的车,天数为："+days+"天；费用为："+(days*800));
        }else if(this.seatCount.equals("大于16座的金杯")) {
            System.out.println("您租的车为："+getSeatCount()+" 16座以上的车,天数为："+days+"天；费用为："+(days*1500));
        }
	}	
}