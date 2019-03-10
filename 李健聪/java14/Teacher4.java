package 第十四章作业;

public class Teacher4 {
	private String name;
	private String sex;
	private int age;
	private String zy;
	final static private String jsfx="JAVA";
	final static private String cs="测试";
	final static private String az="安卓方向";
	public Teacher4(String name,int age,String zy){
		this.age=age;
		this.zy=zy;
		System.out.println("姓名为："+name+"年龄为："+age+"   性别男，专业为软件工程");
	}
	public Teacher4(String name,String sex,int age,String zy){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.zy=zy;
		System.out.println("姓名为："+name+"性别为："+sex+"年龄为："+age+"专业为："+zy);
	}
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
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public static String getJsfx() {
		return jsfx;
	}
	public static String getCs() {
		return cs;
	}
	public static String getAz() {
		return az;
	}
}
