package 作业;

import java.util.Scanner;

public class Pig {
	private  String name;
	private  int love;
	private  int health;
	private  String hair;
	public Pig(){
		
	}
	public Pig(String name){
		setName(name);
		
	}
	public void setHair(String hair){
		this.hair=hair;
	}
	public String getHair(){
		return hair;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setHealth(int health){
		this.health=health;
	}
	public int getHealth(){
		return health;
	}
	public void setLove(int love){
		this.love=love;		
	}
	public int getLove(){
		return love;
	}
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入选择猪的颜色：(1.黑色 2.红色)");
		int a=input.nextInt();
		if(a==1){
			hair="黑色";
		}else{
			hair="红色";
		}
		switch(a){
			case 1:
				System.out.println("宠物的自白：\n我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主任的亲密度是"+getLove()+"，我的毛发颜色是："+getHair());
				break;
			case 2:
				System.out.println("宠物的自白：\n我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主任的亲密度是"+getLove()+"，我的毛发颜色是："+getHair());
				break;
			default:
				break;
		}
	}
}
