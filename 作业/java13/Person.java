package 第13章作业;

public class Person {
	String name;
	String sex;
	int age;
	public Person(String name,String sex,int age){
		//this 表示当前类中的属性 第二个name表示的是形参
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void show(){
		System.out.println("------------人员信息-----------");
		System.out.println("人员信息如下：\n姓名-->"+name+"\n性别-->"+sex+"\n年龄-->"+age);
	}
}
