package �������ϵͳ;

public class Freight extends MotoVehicle{
	private String   weight;

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void calcRent(int days){
		if(this.weight.equals("����30�ֵĶ����ղ�")) {
            System.out.println("����ĳ�Ϊ��"+getWeight()+"����Ϊ��"+days+"�죻����Ϊ��"+(days*30*50));
        }else if(this.weight.equals("����70�ֵĸ���")) {
            System.out.println("����ĳ�Ϊ��"+getWeight()+" 16�����ϵĳ�,����Ϊ��"+days+"�죻����Ϊ��"+(days*70*50));
        }
	}
}
