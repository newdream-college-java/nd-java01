package 作业;


import java.util.Scanner;

public class Penguin {
	private  String name;
	private  int love;
	private  int health;
	private  String sex;
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
	public void setSex1(){
		String sex="我是一只帅气的Q仔";
		this.sex=sex;
	}
	public String  getSex1(){		
		return sex;
	}
	public void setSex2(){
		String sex="我是一只可爱的Q妹";
		this.sex=sex;
	}
	public String getSex2(){
		return sex;
	}
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入选择狗狗的品种：(1.Q仔 2.Q妹)");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("宠物的自白：\n我的名字叫"+getNames()+"，健康值是"+getHealth()+"，和主任的亲密度是"+getLove()+"，"+getSex1());
				break;
			case 2:
				System.out.println("宠物的自白：\n我的名字叫"+getNames()+"，健康值是"+getHealth()+"，和主任的亲密度是"+getLove()+"，"+getSex2());
				break;
			default:
				break;
		}
	}
	
}
