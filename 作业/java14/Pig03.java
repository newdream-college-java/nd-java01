package 第14章封装作业;

public class Pig03 {
	private String name;
	int health;
 	int love;
	private String color;

	public Pig03(int health,int love){
		this.health=health;
		this.love=love;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void show(){
		System.out.println("我的名字叫"+getName()+",健康值是"+health+",和主人的亲密度是"+love+",我是一只"+getColor()+"的猪"+"。");
	}
}
