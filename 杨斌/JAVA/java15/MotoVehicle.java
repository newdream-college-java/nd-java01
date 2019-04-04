
public abstract class MotoVehicle {
	private int day;
	private String name;
	private int fy;
	private int xh;

	public void print(){
		System.out.println("分配给你的车牌号：京BK5543");
	
		System.out.println("顾客您好！您需要支付的费用是"+getFy());
	
		}
	public int getFy() {
		fy=getXh()*getDay();
		return fy;
	}
	public int getXh() {
		return xh;
	}
	public void setXh(int xh) {
		this.xh = xh;
	}
	public void setFy(int fy) {
		this.fy =fy;
	}
	public abstract void show();
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
