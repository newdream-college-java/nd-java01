
public class Dog {
	private int id ;
	private int masterId;
	private String dogName;
	private int typeId ;
	private int health;
	private int love;
	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + ", health=" + health + ", id=" + id
				+ ", love=" + love + ", masterId=" + masterId + ", typeId="
				+ typeId + "]";
	}
	
	public Dog() {

		
	}

	public Dog(int id, int masterId, String dogName, int typeId, int health,
			int love) {
	
		this.id = id;
		this.masterId = masterId;
		this.dogName = dogName;
		this.typeId = typeId;
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
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
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
