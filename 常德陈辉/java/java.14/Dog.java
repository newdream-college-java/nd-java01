package zuoye;

public class Dog {
	private String name="������";
	private int healtg=100;
	private int love=80;
	private String strain="��������������Ȯ";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealtg() {
		return healtg;
	}
	public void setHealtg(int healtg) {
		this.healtg = healtg;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void printDog(){
		System.out.println("�ҵ����ֽ�"+getName()+",����ֵ��"+getHealtg()+",�����˵����ܶ���"+getLove()+",����һֻ"+getStrain());
	}
			
}
