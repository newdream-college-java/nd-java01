package 作业;

import java.util.Scanner;

public class Zylei22 {
	Scanner input=new Scanner(System.in);
	private String name;
	private int health=100;
	private int love=80;
	private String sex="公";
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
	public void print(String name) {
		boolean f=false;
		while (!f) {
			System.out.print("请选择企鹅品种：（1.南极 2.帝王）");
			int p=input.nextInt();
			if (p==1) {
				System.out.println("宠物自白：");
				System.out.println("我的名字叫"+name+",健康值为"+health+",和主人的亲密度为"+love+"我是一只聪明的南极企鹅");
				f=true;
			}else
			if (p==2) {
				System.out.println("宠物自白：");
				System.out.println("我的名字叫"+name+",健康值为"+health+",和主人的亲密度为"+love+"我是一只聪明的帝王企鹅");
				f=true;
			}else{
				System.out.println("输入错误，请重新输入");
				System.out.println("请选择企鹅品种：（1.南极 2.帝王）");
				p=input.nextInt();
			}
		}
	}	
}
