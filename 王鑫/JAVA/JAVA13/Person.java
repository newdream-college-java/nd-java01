package Test2019_3_6_z13;

public class Person {
	String[] name = { "张三", "李四" };
	String[] sex = { "男", "男" };
	int[] age = { 18, 20 };

	public void Person() {
		System.out.println("---------------------人员信息---------------------");
		System.out.println("人员信息如下：");
		for (int i = 0; i < name.length; i++) {
			System.out.println("姓名-->" + name[i]);
			System.out.println("性别-->" + sex[i]);
			System.out.println("年龄-->" + age[i] + "\n");
		}
	}
}
