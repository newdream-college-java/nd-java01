package 第十三章作业;

public class Person {
	public Person(String name,String sex,int age){//带参构造方法
		System.out.println("------------人员信息----------------");
		System.out.println("人员信息如下");
		System.out.println("姓名-->"+name);
		System.out.println("性别-->"+sex);
		System.out.println("年龄-->"+age);
	}
	public Person(){
		System.out.println("一名新生儿出生了");
	}
}
