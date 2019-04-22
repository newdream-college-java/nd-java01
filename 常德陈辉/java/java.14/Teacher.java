package zuoye;

public class Teacher {
	private String name;
	private String sex;
	private int age;
	private String jx;
	static final String JAVA="Java 方向";
	static final String cs="测试 方向";
	static final String ANDROID="android 方向";
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
	public String getJx() {
		return jx;
	}
	public void setJx(String jx) {
		this.jx = jx;
	}
	public Teacher(String name,int age){
		sex="男";
		jx="软件工程";
		this.name=name;
		this.age=age;
	}
	public Teacher(String name,String sex,int age,String jx){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.jx=jx;
	}
	public void show(){
		System.out.println("姓名："+getName()+"  性别："+getSex()+"  年龄："+getAge()+"  专业："+getJx());
	}
}
