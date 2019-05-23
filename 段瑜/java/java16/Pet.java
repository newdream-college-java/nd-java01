package ÈËÓë³èÎï;

public  abstract class Pet {
	private int health;
	private int affinity;
	public int getAffinity() {
		return affinity;
	}
	public void setAffinity(int affinity) {
		this.affinity = affinity;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public abstract void eat();
	public abstract void eat1();		
	
}
