package Test2019_3_8_z14;

public class Dog_1 {
	private String name = "������";
	private int health = 100;
	private int love = 80;
	private String strain = "��������������Ȯ";
	void print(String name,String pz){
		System.out.println("�ҵ����ֽ�"+name+",����ֵ��"+getHealth()+",�����˵����ܶ���"+getLove()+",����һֻ"+ pz);
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
	
}
