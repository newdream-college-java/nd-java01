package Test2019_3_12_z16;

public class Animal {
	private String name;
	private int health=100;
	private int intimacy = 80;
	
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

	public int getIntimacy() {
		return intimacy;
	}

	public void setIntimacy(int intimacy) {
		this.intimacy = intimacy;
	}

	public void eat(int addHealth){
		System.out.println(getName()+"³Ô±¥À²£¡½¡¿µÖµÔö¼Ó"+addHealth);
	}

}
