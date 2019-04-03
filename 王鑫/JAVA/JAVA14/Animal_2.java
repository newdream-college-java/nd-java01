package Test2019_3_8_z14;

public class Animal_2 {
	private String name;
	private String color;
	int health=100;
	int intimacy = 80;
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

	public void show() {
		System.out.println("宠物自白：");
		System.out.println("我的名字叫"+getName()+",健康值是："+health+",和主人的请密度:"+intimacy+",我的毛发颜色是"+getColor());
	}

}
