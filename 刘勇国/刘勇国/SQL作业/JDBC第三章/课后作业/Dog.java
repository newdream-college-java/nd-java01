
public class Dog {
	private int id ;
	private int masterId;
	private String dogName;
	private String type ;
	private int health;
	private int love;
	@Override
	public String toString() {
		return "Dog [dogName=" + dogName +",id=" + id
				+ ", type="+ type +"]"+"\n";
	}
	
	public Dog() {

		
	}

	public Dog(int id, int masterId, String dogName, int typeId, int health,
			int love) {
	
		this.id = id;
		this.masterId = masterId;
		this.dogName = dogName;
		this.type = type;
		this.health = health;
		this.love = love;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMasterId() {
		return masterId;
	}
	public void setMasterId(int masterId) {
		this.masterId = masterId;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
}
