package �������ϵͳ;

import java.util.Random;

public class Bus extends MotoVehicle{
	Random rd=new Random();
	private int no;
	private String seatCount;
	public String getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(final String seatCount) {
		this.seatCount = seatCount;
	}
	public int getNo() {
		return no;
	}
	public void setNo(final int no) {
		this.no = no;
	}
	public void getBus1(){
		setNo(rd.nextInt(9000)+1000);
		System.out.println("��������ĳ��ƺ��ǣ���A.C"+getNo());	
		setMoney(800);
	}
	public void getBus2(){
		setNo(rd.nextInt(9000)+1000);
		System.out.println("��������ĳ��ƺ��ǣ���A.C"+getNo());	
		setMoney(1500);
	}
}
