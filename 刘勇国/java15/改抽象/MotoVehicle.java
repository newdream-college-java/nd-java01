package 第15章继承2抽象类抽象方法;

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

	//传入参数租用的天数days计算租金=days&price
	public abstract void CalcRent(int days,int price);
}
