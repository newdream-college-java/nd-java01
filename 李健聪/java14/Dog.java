package ��ʮ������ҵ;

public class Dog {
	private String name="������";
	private int health=100;
	private int love=80;
	private String strain="��������������";
	public Dog(String name,int health,int love,String strain){
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+",�����˵����ܶ���"+love+"����һֻ"+strain);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
}
