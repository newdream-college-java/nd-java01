
public class Teacher {
	String name;
	char sex;
	int age;
	//设置技术方向变量td( Technical Direction)
	String td;
	//设置专业的变量zy
	String zy;
	static final String Java="java方向";
	static final String cs="测试";
	static final String android="ANDROID";
	public Teacher(String td,String name,int age){
		sex='男';
		zy="软件工程";
		this.td=td;
		this.name=name;
		this.age=age;
	}
	public Teacher(int age,String zy,String name,char sex,String td){
		this.age=age;
		this.zy=zy;
		this.name=name;
		this.sex=sex;
		this.td=td;
	}
	public void show(){
		System.out.println("我的名字叫"+name+"，性别是:"+sex+"，年龄是:"+age+"，专业是:"+zy+"，技术方向为:"+td);
	}
	
}

