package �������ϵͳ;

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
		if(this.seatCount.equals("С��16���Ľ���")) {
            System.out.println("����ĳ�Ϊ��"+getSeatCount()+ "16�����µĳ�,����Ϊ��"+days+"�죻����Ϊ��"+(days*800));
        }else if(this.seatCount.equals("����16���Ľ�")) {
            System.out.println("����ĳ�Ϊ��"+getSeatCount()+" 16�����ϵĳ�,����Ϊ��"+days+"�죻����Ϊ��"+(days*1500));
        }
	}	
}