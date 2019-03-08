package 第14章封装作业;

public class Student1 {
	private int age;
	private String name;
	public void showMyself(){
		System.out.println("我是"+name+"\t今年"+age+"岁");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
