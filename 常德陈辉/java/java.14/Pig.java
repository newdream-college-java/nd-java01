package zuoye;


public class Pig {
	private String name="无名氏";
	private String Color="白色";
	private int health=100;
	private int love=80;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
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
	public void print(){
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",我毛发颜色是"+getColor());
	}
}
