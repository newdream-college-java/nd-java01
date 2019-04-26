package 作业;

public class Zylei6 {
	
	String name;
	String sex;
	int age;
	String zhuanyei;
	public  Zylei6(String name,int age) {
		this.sex="男";
		this.zhuanyei="软件工程";
		System.out.println("我的姓名是"+name+"\t性别是"+sex+"\t年龄为"+age+"\t所学的专业为"+zhuanyei);

	}
	public  Zylei6(String name,String sex,int age,String zhuanyei) {

		System.out.println("我的姓名是"+name+"\t性别是"+sex+"\t年龄为"+age+"\t所学的专业为"+zhuanyei);

	}
	
}
