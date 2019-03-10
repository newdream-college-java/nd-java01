package java14;

public class Pig {
	private String name="无名氏";
	private int health=100;
	private int love=80;
	private String color="黑色";
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
		System.out.println("宠物的自白:");
		System.out.println("我的名字是"+name+",健康值是"+health+",与主任亲密度是"+love+",我的毛发颜色是"+color);
	}
}
