
public class Student2 {
	private String name="匿名";
	private int age=13;
	private String sex="男";
	private String zy="会计学";
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
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public Student2(String sex,String zy,String name,int age){
		this.sex=sex;
		this.zy=zy;
		this.name=name;
		this.age=age;
	}
	public Student2(String name,int age){
		sex="男";
		zy="软件工程";
		this.name=name;
		this.age=age;
	}
	public void print(){
		System.out.println("大家好，我的名字叫"+name+"，性别"+sex+"，我今年"+age+"岁,学的"+zy+"专业");
	}
}
