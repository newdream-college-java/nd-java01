package ��ʮ������ҵ;

public class Penguin {
	private String name="������";
	private int health=100;
	private int love=80;
	private String sex="Q��";
	public Penguin(String name,int health,int love,String sex){
		System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+",�����˵����ܶ���"+love+"����һֻ"+sex);
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
