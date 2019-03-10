package 第十四章作业;

public class Syudent1 {
	private String name;
	private int age;
	public Syudent1(String name,int age){
		if(age<15){
			age=18;
		}
		System.out.println("大家好我叫:"+name+"我今年"+age+"岁");
	}
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
	
}
