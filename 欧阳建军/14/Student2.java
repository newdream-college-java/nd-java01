package 第14章封装作业;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String major;
	public Student2(String name,int age){
		sex="男";
		major="软件工程";
		System.out.println("调用的两个参数的构造方法");
	}
	public Student2(String name,int age,String sex,String major){
		System.out.println("调用的五个参数的构造方法");
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void showMyself(){
		System.out.println("我是"+getName()+"，今年"+getAge()+"，岁"+"我的专业是"+getMajor()+",来自"+getClass()+"班。");
	}
}
