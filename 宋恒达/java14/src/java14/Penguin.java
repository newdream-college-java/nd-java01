package java14;

public class Penguin {
	private String name="������";
	private int health=100;
	private int love=80;
	private String sex="Q��";
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
		if(health>=1&&health<=100) {
			this.health=health;
		}
		this.health = 100;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void print() {
		System.out.println("������԰�:");
		System.out.println("�ҵ����ֽ�"+getName()+",����ֵ��"+getHealth()+",�����˵����ܶ���"+getLove()+"����һֻ"+getSex()+"��");
	}
}
