package java14;

public class Pig {
	private String name="������";
	private int health=100;
	private int love=80;
	private String color="��ɫ";
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void print() {
		System.out.println("������԰�:");
		System.out.println("�ҵ�������"+name+",����ֵ��"+health+",���������ܶ���"+love+",�ҵ�ë����ɫ��"+color);
	}
}
