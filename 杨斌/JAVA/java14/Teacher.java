
public class Teacher {
	String name;
	char old;
	int age;
	String zy;
	String js;
	static final String java="java方向";
	static final String cs="测试";
	static final String android="ANDROID";
	public Teacher(String name,int age){
		this.age=age;
		this.name=name;
		old='男';
		zy="软件工程";
		js=java;
	}
	public Teacher(String name,char old,int age,String zy){
		this.zy=zy;
		this.name=name;
		this.age=age;
		this.old=old;
		js=cs;
	}
	public void show(){
		System.out.println("我的名字叫:"+name+"\n性别是:"+old+"\n年龄是:"+age+"\n专业是:"+zy+"\n技术方向为:"+js);
	}
	
}
