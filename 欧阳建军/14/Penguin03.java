package 第14章封装作业;

public class Penguin03 {
	String name;
	int health;
	int love;
	static final String sex_male="Q仔";
	static final String sex_female="Q妹";
	private String sex;
	public Penguin03(String name,int health,int love){
		this.name=name;
		this.health=health;
		this.love=love;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void show(){
		System.out.print("我的名字叫"+name+",健康值是"+health+",和主人的亲密度是"+love+","+"我是一只"+getSex()+"。");
	}
}
