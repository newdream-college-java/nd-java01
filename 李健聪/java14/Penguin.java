package 第十四章作业;

public class Penguin {
	private String name="无名氏";
	private int health=100;
	private int love=80;
	private String sex="Q仔";
	public Penguin(String name,int health,int love,String sex){
		System.out.println("我的名字叫"+name+"，健康值是"+health+",和主人的亲密度是"+love+"我是一只"+sex);
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
