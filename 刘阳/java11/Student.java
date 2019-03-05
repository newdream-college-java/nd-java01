import java.util.Scanner;


public class Student {
	String name;
	int xuenum;
	int classs;
	String sex;
	int year;
	String address;
	public void sayHello(){
		Scanner ip=new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		name=ip.next();
		System.out.println("请输入学生学号：");
		xuenum=ip.nextInt();
		System.out.println("请输入学生班级：");
		classs=ip.nextInt();
		System.out.println("请输入学生性别：");
		sex=ip.next();
		System.out.println("请输入学生年龄：");
		year=ip.nextInt();
		System.out.println("请输入学生家庭住址：");
		address=ip.next();
		System.out.println("学生信息如下：");
		System.out.println("姓名："+name+"\n"+"学号："+xuenum+"\n"+"班级："+classs+"\n"+"性别："+sex+"\n"+"年龄："+year+"\n"+"家庭住址："+address);
	}
}
