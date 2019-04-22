
public class Dog01 {
	private String name;
	private int health=100;
	private int love=80;
	private String strain="聪明的拉布拉多犬";
	public Dog01(){
		
	}
	public Dog01(String name,int health,int love,String strain){
		this.name=name;
		this.health=health;
		this.love=love;
		this.strain=strain;
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
	public void print(){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主人的亲密度是"+getLove()+",我是一只"+getStrain()+"。");
	}
}
