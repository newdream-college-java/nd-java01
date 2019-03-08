package 第14章封装作业;

public class Penguin02 {
	private String name;
	private int health;
	private int love;
	static final String sex_male="Q仔";
	static final String sex_female="Q妹";
	private String sex;
	public Penguin02(){
		name="无名氏";
		health=100;
		love=80;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	public void show(){
		System.out.print("我的名字叫"+getName()+",健康值是"+getHealth()+",和主人的亲密度是"+getLove()+",我是一只"+getSex()+"。");
	}
}
