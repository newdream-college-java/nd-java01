package java16;

public abstract class Pet {
	private String type;
	private String name;
	private int age;
	private int health;
	private int love;
	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public abstract void eat();
	public abstract void play();
}
