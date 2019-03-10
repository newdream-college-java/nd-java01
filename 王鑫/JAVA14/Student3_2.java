package Test2019_3_8_z14;

public class Student3_2 {
	private String name ;
	private int age = 18;
	private String sex;
	private String major;
	public Student3_2(String name, int age, String sex, String major) {
		System.out.println("姓名："+name+"\t年龄："+age+"\t性别："+sex+"\t专业："+major);
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
	public String getName() {
		return name;
	}

}
