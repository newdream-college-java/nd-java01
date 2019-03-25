package 第16章多态作业;

public abstract class Pet {
	private int health=50;
	private int love=50;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public abstract void chiBaoLe();
	public abstract void eat();
	public abstract void play();
	
}
