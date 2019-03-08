package 作业;

import java.util.Scanner;

public class Penguin2 {
	private  String name;
	private  int love;
	private  int health;
	private  String sex;
	static String SEX_MALE="Q仔";
	static String SEX_FEMALE="Q妹";
	public Penguin2(){
		
	}
	public Penguin2(String name){
		setName(name);
		
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
	public void setSex(String sex){
		this.sex=sex;
	}
	public String  getSex(){		
		return sex;
	}
	
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入选企鹅的性别：(1.Q仔 2.Q妹)");
		int a=input.nextInt();
		if(a==1){
			sex=SEX_MALE;
		}else{
			sex=SEX_FEMALE;
		}
		switch(a){
			case 1:
				System.out.println("宠物的自白：\n我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主任的亲密度是"+getLove()+"，性别："+getSex()+"，我是一只帅气的Q仔");
				break;
			case 2:
				System.out.println("宠物的自白：\n我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主任的亲密度是"+getLove()+"，性别"+getSex()+"，我是一只可爱的Q妹");
				break;
			default:
				break;
		}
	}
	
}
