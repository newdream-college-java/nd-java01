import java.util.Scanner;


public class Pig {
	private String name="匿名的";
	private int health=100;
	private int love=80;
	private String color="白";
	public Pig(){
		
	}
	public Pig(String name,int health,int love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	public void choicestrain(){
		System.out.println("请选择猪猪的颜色：（1、白  1、黑）");
		Scanner input=new Scanner(System.in);
		switch(input.nextInt()){
			case 1:
				color="白";
				break;
			case 2:
				color="黑";
				break;
		}
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void show(){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+name+"，健康值是"+health+"，和主人的亲密度是"+love+"，我是一只大"+color+"猪。");
	}
}
