package java14;

public class Teacher {
	public static String tel1="java方向";
	public static String tel2="测试方向";
	public static String tel3="android方向";
	private String name;
	private String sex;
	private int age;
	private String tel;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.sex="男";
		this.tel="软件工程";
		
	}
	public Teacher(String name, String sex, int age, String tel) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void print() {
		System.out.println("大家好，我叫"+name+",性别"+sex+",年龄"+age+",技术"+tel);
	}
}
