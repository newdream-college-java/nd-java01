package ��14�·�װ��ҵ;

public class Pig03 {
	private String name;
	int health;
 	int love;
	private String color;

	public Pig03(int health,int love){
		this.health=health;
		this.love=love;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void show(){
		System.out.println("�ҵ����ֽ�"+getName()+",����ֵ��"+health+",�����˵����ܶ���"+love+",����һֻ"+getColor()+"����"+"��");
	}
}
