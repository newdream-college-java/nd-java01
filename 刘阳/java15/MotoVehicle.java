
public abstract class MotoVehicle {
	//品牌
	private String brand;
	//车牌号
		private String no;
		public MotoVehicle(String no){
			this.no=no;
		}
		//根据客户租用的天数计算费用方法------抽象方法
		public abstract void calcRent(int days);
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
	
	
}
