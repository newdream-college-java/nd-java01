package zuoye;

import java.util.Scanner;

public class Penguin2 {
	private String name="无名氏";
	private int health=100;
	private int love=80;
	private String sex="Q 仔";
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
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
	static final String SEX_MALE="Q 仔";
	static final String SEX_FEMALE="Q 妹";
	public void print(){
		Scanner input=new Scanner(System.in);
		System.out.print("请选择企鹅的性别：（1，Q仔2，Q妹）");
		int a=input.nextInt();
		if(a==1){
			sex=SEX_MALE;
		}else{
			sex=SEX_FEMALE;
		}
		System.out.println("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",我是一只"+getSex());
	}
	
}
