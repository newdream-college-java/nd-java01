package 作业;


import java.util.Scanner;



public class Dog {
	private  String name;
	private  int love;
	private  int health;
	private  String strain;
	public void setNames(String name){
		this.name=name;
	}
	public String getNames(){
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
	public void setStrain1(){
		String strain="我是一只聪明的拉布拉多";
		this.strain=strain;
	}
	public String  getStrain1(){		
		return strain;
	}
	public void setStrain2(){
		String strain="我是一只酷酷的雪纳瑞";
		this.strain=strain;
	}
	public String getStrain2(){
		return strain;
	}
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入选择狗狗的品种：(1.拉布拉多 2.雪纳瑞)");
		int a=input.nextInt();
		switch(a){
			case 1:
				setStrain1();
				System.out.println("宠物的自白：\n我的名字叫"+getNames()+"，健康值是"+getHealth()+"，和主人的亲密度是"+getLove()+"，"+getStrain1());
				break;
			case 2:
				setStrain2();
				System.out.println("宠物的自白：\n我的名字叫"+getNames()+"，健康值是"+getHealth()+"，和主人的亲密度是"+getLove()+"，"+getStrain2());
				break;
			default:
				break;
		}
	}
}
