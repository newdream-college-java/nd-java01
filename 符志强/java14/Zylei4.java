package 作业;

public class Zylei4 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void js(String name,int age) {
		this.name=name;
		this.age=age;
		if (age<15) {
			age=18;
		}
		System.out.println("我的名字是"+name+"\t我的年龄是："+age);
	}
}
