package entity;

import java.security.Timestamp;

public class Pet {
	private int id;
	private int masterId;
	private String name;
	private int typeId;
	private int health;
	private int love;
	private Timestamp adoptTime;
	public Pet() {
		
	}
	public Pet(int id,int masterId,String name,int typeId,int health,int love,Timestamp adoptTime) {
		super();
		this.id=id;
		this.masterId=masterId;
		this.name=name;
		this.typeId=typeId;
		this.health=health;
		this.love=love;
		this.adoptTime=adoptTime;
		
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Timestamp getAdoptTime() {
		return adoptTime;
	}
	public void setAdoptTime(Timestamp adoptTime) {
		this.adoptTime = adoptTime;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", masterId=" + masterId + ", name=" + name + ", typeId=" + typeId + ", health="
				+ health + ", love=" + love + ", adoptTime=" + adoptTime + "]";
	}
	

}
