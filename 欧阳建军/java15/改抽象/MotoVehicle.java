package ��15�¼̳�2��������󷽷�;

public abstract class MotoVehicle {
	private String motoVehType;
	private String no;
	int days;
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	//����������õ�����days�������=days&price
	public abstract void CalcRent(int days,int price);
}
