package zuoye;

public class Zylei2 {
	String name;
	String sex;
	int age;
	public  Zylei2(String name,String sex,int age) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		
	}
	public void a() {
		System.out.println("--------------------人员信息-------------------");
		System.out.println("人员信息如下：");
		System.out.println("姓名------>"+name+"\n性别------>"+sex+"\n年龄------>"+age);
	}
}
