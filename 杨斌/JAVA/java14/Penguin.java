import java.util.Scanner;
public class Penguin {
	private String name="无名氏";
	private int health=100;
	private int love=80;
	private String strain="Q仔";
	public void print(){
		Scanner input=new Scanner(System.in);
		System.out.println("请选择企鹅的品种：（1、Q仔2、陈辉）");
		int a=input.nextInt();
		if(a==2){
			setStrain("陈辉");
		}
		System.out.println("宠物的自白");
		System.out.println("我的名字叫"+name+"，健康值是"+health+"，和主人的亲密度是"+love+"，我是一只"+strain);
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
		if(100>=health&&health>=1){
			this.health = health;
		}else{
			System.out.println("错误的健康值");
		}
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
	
	
}

