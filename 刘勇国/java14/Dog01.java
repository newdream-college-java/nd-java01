package ��14�·�װ��ҵ;

public class Dog01 {
	private String name="������";
	private int health=100;
	private int love=80;
	private String strain="��������������Ȯ";
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
	public void printMessage(){
		System.out.print("�ҵ����ֽ�"+getName()+",����ֵ��"+getHealth()+",�����˵����ܶ���"+getLove()+",����һֻ"+getStrain()+"��");
	}
	
}
