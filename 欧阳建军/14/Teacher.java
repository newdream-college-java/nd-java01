package 第14章封装作业;

public class Teacher {
	String name;
	String sex;
	int age;
	String major;
	static final String major_JAVA="Java方向";
	static final String major_TEST="Test方向";
	static final String major_ANDROID="Android方向";
	public Teacher(String name,int age){
		this.sex="男";
		this.major="软件工程";
		this.name=name;
		this.age=age;
	}
	public Teacher(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.major=major_TEST;
	}
	public void show(){
		System.out.println("我是"+name+"\t性别"+sex+"\t今年"+age+"岁"+"\t我的研究方向是"+major);
	}
	
}
