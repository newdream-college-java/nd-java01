package 第十四章作业;

public class Dog {
	private String name="无名氏";
	private int health=100;
	private int love=80;
	private String strain="聪明的拉布拉多";
	public Dog(String name,int health,int love,String strain){
		System.out.println("我的名字叫"+name+"，健康值是"+health+",和主人的亲密度是"+love+"我是一只"+strain);
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
