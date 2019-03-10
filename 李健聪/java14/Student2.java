package 第十四章作业;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String zy;
	public Student2(String name,int age,String sex,String zy){
		System.out.println("大家好我叫:"+name+"\t我今年"+age+"岁\t"+"性别"+sex+"\t我的专业是："+zy);
	}
	public Student2(String name,int age){
		System.out.println("大家好我叫:"+name+"\t我今年"+age+"岁\t"+"性别男"+"\t我的专业是软件工程");
	}
}
