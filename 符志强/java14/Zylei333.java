package 作业;

import java.util.Scanner;

public class Zylei333 {
	public static final String COLOR_MALEL = "白色";
	public static final String COLOR_FEMALE = "黑色";
	Scanner input=new Scanner(System.in);
	private String name;
	private int health=100;
	private int love=80;
	//private String color="白色";
	
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

//	public String getStrain() {
//		return color;
//	}
//
//	public void setStrain(String strain) {
//		this.color = strain;
//	}
	public Zylei333(String name) {
		boolean f=false;
		while (!f) {
			System.out.print("请选择猪猪品种：（1.宠物猪 2.迷你小猪）");
			int p=input.nextInt();
			if (p==1) {
				System.out.print("请选择猪猪的颜色：（1.白色    其他.黑色）");
				String color=null;
				if (input.nextInt()==1) {
					color=COLOR_MALEL;
				}else{
					color=COLOR_FEMALE;
				}
				
				System.out.println("宠物自白：");
				System.out.println("我的名字叫"+name+"我的颜色是"+color+",健康值为"+health+",和主人的亲密度为"+love+"是只的聪明的宠物猪");
				f=true;
			}else
			if (p==2) {
				System.out.print("请选择猪猪的颜色：（1.白色    其他.黑色）");
				String color=null;
				if (input.nextInt()==1) {
					color=COLOR_MALEL;
				}else{
					color=COLOR_FEMALE;
				}
				System.out.println("宠物自白：");
				System.out.println("我的名字叫"+name+"我的颜色是"+color+",健康值为"+health+",和主人的亲密度为"+love+"是只的聪明的迷你小猪");
				f=true;//+"我是一只"+color+
			}else{
				System.out.println("输入错误，请重新输入");
				System.out.println("请选择猪猪品种：（1.宠物猪 2.迷你小猪）");
				p=input.nextInt();
			}
	}
	
		
		
	}
}
