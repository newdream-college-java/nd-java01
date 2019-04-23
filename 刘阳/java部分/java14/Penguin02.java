import java.util.Scanner;


public class Penguin02 {
	private String name="匿名的";
	private int health;
	private int love;
	private String sex="Q仔";
	static final String SEX_MALE="Q仔";
	static final String SEX_FEMALE="Q妹";
	public Penguin02(){
		
	}
	public Penguin02(String name,int health,int love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	public void choicestrain(){
		System.out.println("请选择企鹅的性别：（1、Q仔  2、Q妹）");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		switch(a){
			case 1:
				sex=SEX_MALE;
				break;
			case 2:
				sex=SEX_FEMALE;
				break;
		}
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
	public void show(){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+name+"，健康值是"+health+"，和主人的亲密度是"+love+"，我是一只"+sex+"。");
	}
}
