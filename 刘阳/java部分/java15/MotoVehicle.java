
public abstract class MotoVehicle {
	//Ʒ��
	private String brand;
	//���ƺ�
		private String no;
		public MotoVehicle(String no){
			this.no=no;
		}
		//���ݿͻ����õ�����������÷���------���󷽷�
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
