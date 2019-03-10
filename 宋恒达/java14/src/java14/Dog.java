package java14;
/**
 * 运用面向对象思想，从以下信息列表中抽象出Dog和Penguin
 * 
 * 封装两个类中的所有属性（私有化：提供公有的set和get方法）在
 * 两个类中加入判断，允许健康值得范围1-100完成类设计后，
 * 利用开发工具生成两个类的类图
 * @author mo
 *
 */
public class Dog {
	private String name="无名氏";
	private int health=100;
	private int love=80;
	private String strain="聪明的拉布拉多";

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
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void print() {
		System.out.println("宠物的自白:");
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主任的亲密度是"+getLove()+"我是一只"+getStrain());
	}
}
