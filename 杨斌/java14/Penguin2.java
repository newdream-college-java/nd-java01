import java.util.Scanner;
public class Penguin2 {
	private String name;
	private int health=100;
	private int love=80;
	private	String sex;
	static final String SEX_MALE="Q仔";
	static final String SEX_FEMALE="Q妹";
	public Penguin2(){
		
	}
	public Penguin2(String name,String sex){
		setName(name);
		setSex(sex);
	}
	public void print(){
		Scanner input=new Scanner(System.in);		
		System.out.println("请选择企鹅的性别：（1、Q仔2、Q妹）");
		int b=input.nextInt();
		if(b==1){
			 sex=SEX_MALE;
		}else{
			 sex=SEX_FEMALE;
		}
		
		System.out.println("宠物的自白");
		System.out.println("我的名字叫"+name+"，性别是"+sex+"，健康值是"+health+"，和主人的亲密度是"+love+"，我是一只企鹅");
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}

