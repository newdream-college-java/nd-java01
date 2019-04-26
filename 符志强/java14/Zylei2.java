package 作业;

import java.util.Scanner;

public class Zylei2 {
	Scanner input=new Scanner(System.in);
	private String name;
	private int health=100;
	private int love=80;
	private String strain="泰日天";
	
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

	public void print(String name) {
		boolean f=false;
		while (!f) {
			System.out.print("请选择狗狗品种：（1.泰迪 2.拉布拉多）");
			int p=input.nextInt();
			if (p==1) {
				System.out.println("宠物自白：");
				System.out.println("我的名字叫"+name+",健康值为"+health+",和主人的亲密度为"+love+"我是一只聪明的泰迪犬");
				f=true;
			}else
			if (p==2) {
				System.out.println("宠物自白：");
				System.out.println("我的名字叫"+name+",健康值为"+health+",和主人的亲密度为"+love+"我是一只聪明的拉布拉多犬");
				f=true;
			}else{
				System.out.println("输入错误，请重新输入");
				System.out.println("请选择狗狗品种：（1.泰迪 2.拉布拉多）");
				p=input.nextInt();
			}
		}
		
		
	}
}
