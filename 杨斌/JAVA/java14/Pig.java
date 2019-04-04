import java.util.Scanner;
public class Pig {
	private String name;
	private int health=100;
	private int love=80;
	private String clolr;
	public Pig (){
		
	}
	public Pig (String name,String clolr){
		setName(name);
		setClolr(clolr);
	}
	public void print(){
		Scanner input=new Scanner(System.in);
		System.out.print("请选择猪的毛发颜色：（1、白色2、黑色");
		int a=input.nextInt();
		if(a==2){
			setClolr("黑色");
		}
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+name+"，健康值是"+health+"，和主人的亲密度是"+love+"，我的毛发颜色是"+clolr);
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
	public String getClolr() {
		return clolr;
	}
	public void setClolr(String clolr) {
		this.clolr = clolr;
	}
}
