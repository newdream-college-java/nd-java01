package zuoye;

public class TestPerson {
	public static void main(String[] args) {
		Person person=new Person("张三","男",18);
		System.out.println("----------------------人员信息--------------------");
		System.out.println("人员信息如下：");
		System.out.println("姓名-->"+person.name);
		System.out.println("性别-->"+person.sex);
		System.out.println("年龄-->"+person.age);
	}
}
