package zuoye;


public class Pig {
	private String name="������";
	private String Color="��ɫ";
	private int health=100;
	private int love=80;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
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
	public void print(){
		System.out.println("�ҵ����ֽ�"+getName()+",����ֵ��"+getHealth()+",�����˵����ܶ���"+getLove()+",��ë����ɫ��"+getColor());
	}
}
