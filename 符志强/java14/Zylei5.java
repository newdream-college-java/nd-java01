package 作业;

public class Zylei5 {
	private String name;
	private int age;
	private String sex;
	private String zhuanyei;
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
	public String getZhuanyei() {
		return zhuanyei;
	}
	public void setZhuanyei(String zhuanyei) {
		this.zhuanyei = zhuanyei;
	}
	public  Zylei5(String name,int age) {
		sex="男";
		zhuanyei="软件工程";
		System.out.println("我的姓名是"+name+"\t年龄为"+age+"\t性别是"+sex+"\t所学的专业为"+zhuanyei);
	}
	public  Zylei5(String name,int age,String sex,String zhuanyei) {
		System.out.println("我的姓名是"+name+"\t年龄为"+age+"\t性别是"+sex+"\t所学的专业为"+zhuanyei);

	}
}
