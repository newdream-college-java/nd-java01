package Test03;

public abstract class MotoVehicle {
	/*Ʒ��*/
	private String brand;
	/*���ƺ�*/
	private String no;
	/*�����*/
	private int fy;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getFy(){
		return fy;
	}
	public void setFy(int fy){
		this.fy=fy;
	}
	public abstract void shuchu();
}
