package 作业;

public class Zylei1 {
	private String name="狗狗";
	private int health=100;
	private int love=80;
	private String strain="泰日天";

	public void print() {
		if (health>=1&&health<=100) {
			System.out.println(name+"健康");
		}else{
			System.out.println("不健康");
		}
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
