package 作业;

public class Teacher {
	private String name;
	private char old;
	private int age;
	private String zy;
	private String fx;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getOld() {
		return old;
	}
	public void setOld(char old) {
		this.old = old;
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
	public String getFx() {
		return fx;
	}
	public void setFx(String fx) {
		this.fx = fx;
	}
	static final String java="java方向";
	static final String cs="测试";
	static final String android="ANDROID";
	public Teacher(String name,int age){
		this.age=age;
		this.name=name;
		old='男';
		zy="软件工程";
		fx=java;
	}
	public Teacher(String name,char old,int age,String zy){
		this.zy=zy;
		this.name=name;
		this.age=age;
		this.old=old;
		this.fx=cs;
	}
	public void show(){
		System.out.println("我的名字叫:"+getName()+"\n性别是:"+getOld()+"\n年龄是:"+getAge()+"\n专业是:"+getZy()+"\n技术方向为:"+getFx());
	}
}
