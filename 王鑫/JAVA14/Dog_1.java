package Test2019_3_8_z14;

public class Dog_1 {
	private String name = "无名氏";
	private int health = 100;
	private int love = 80;
	private String strain = "聪明的拉布拉多犬";
	void print(String name,String pz){
		System.out.println("我的名字叫"+name+",健康值是"+getHealth()+",和主人的请密度是"+getLove()+",我是一只"+ pz);
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
