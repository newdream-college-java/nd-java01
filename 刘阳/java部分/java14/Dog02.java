import java.util.Scanner;


public class Dog02 {
	private String name="匿名的";
	private int health;
	private int love;
	private String strain="聪明的拉布拉多犬";
	public Dog02(){
		
	}
	public Dog02(String name,int health,int love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	public void choicestrain(){
		System.out.println("请选择狗狗的品种：（1、聪明的拉布拉多犬   2、酷酷的雪纳瑞）");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		switch(a){
			case 1:
				//setStrain("聪明的拉布拉多犬");自己类里面的私有属性自己可以使用。
				strain="聪明的拉布拉多犬";
				break;
			case 2:
				strain=("酷酷的雪纳瑞");
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
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void show(){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+name+"，健康值是"+health+"，和主人的亲密度是"+love+"，我是一只"+strain+"。");
	}
}
