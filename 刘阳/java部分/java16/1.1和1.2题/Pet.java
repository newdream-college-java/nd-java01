package hwDogCat;

public abstract class Pet {
	private int health=100;
	private int love=80;
	public  abstract void eat() ;
	public abstract void play();
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
}
