package Test2019_3_8_z14;

public class Teacher4 {
	private String name; 
	private String sex;
	private int age;
	private String major;

	static final String Java="java����";
	static final String cs="����";
	static final String android="ANDROID";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Teacher4(String sex,String major){
		setName("С��");
		setAge(18);
		setSex(sex);
		setMajor(major);
	}
	public Teacher4(String name , int age ,String sex,String major){
		setName(name);
		setAge(age);
		setSex(sex);
		setMajor(major);
	}
	public void show() {
		System.out.println("������"+getName()+"\t�Ա�"+getSex()+"\t���䣺"+getAge()+"\tרҵ"+getMajor());
	}
	
}
