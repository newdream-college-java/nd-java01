package java16;

public abstract	class MotoVehicle {
		private String brand;
		private String no;
		
		public MotoVehicle() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public MotoVehicle(String brand, String no) {
			super();
			this.brand = brand;
			this.no = no;
		}

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
		public abstract int calcRent(int days);
		
}
