package 汽车租借系统;

import java.util.Random;

public class Car extends MotoVehicle{
	Random rd=new Random();
	private int no;
	private String type;
	public String getType() {
		return type;
	}
	public void setType(final String type) {
		this.type = type;
	}
	public int getNo() {
		return no;
	}
	public void setNo(final int no) {
		this.no = no;
	}
	
	public void getCar1(){
		setNo(rd.nextInt(9000)+1000);
		System.out.println("分配给您的车牌号是：湘AK"+getNo());	
		setMoney(500);
		
	}
	public void getCar2(){
		setNo(rd.nextInt(9000)+1000);
		System.out.println("分配给您的车牌号是：湘AK"+getNo());	
		setMoney(600);
		
	}
	public void getCar3(){
		setNo(rd.nextInt(9000)+1000);
		System.out.println("分配给您的车牌号是：湘AK"+getNo());	
		setMoney(300);
		
	}
}
