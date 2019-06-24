package com.cc.Test;

import com.cc.Student.Student;

public class Test {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	/*  静态编译：java源文件---javac编译(静态编译)----.class文件---运行
      动态编译：就是反射。
      （Person.java  Student.java ----javac------- Person.class Student.class） 
       （Person.java  Stduent.java -----动态编译(你要用person Person.class)）----灵活
       a.txt-----File file  =new File("a.txt")
       Person.class----Class类对象
       
       Class类：java源文件编译生产生一个二进制.class文件，Class类对象就可以描述一个.class文件
       .class文件中包含了哪些东西？ 类信息，属性，方法.....
       Class类对象中包含了.class文件的所有信息。*/
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		////1.获取类的字节码文件对象方式一：Class.forName();    .class文件包含的信息：全限定类名 属性 方法 构造方法
		Class<?> st = Class.forName("com.cc.Student.Student");
		//System.out.println(st);
		//Student st1 = (Student) st.newInstance();
		
		//2.获取类的字节码文件对象方式二：对象getClass
//		Student s=new Student();
//		Class stu=s.getClass();
//		System.out.println(stu);
		
		//3.获取类的字节码文件对象方式二：类名.class这种方式不存在
		//Class st=Student.class;
		
		//3.获取类的字节码文件对象方式二：方式四与方式一的区别
//		Class<?> st=Class.forName("com.cc.Student.Student");//及时加载 但是不new对象
//		System.out.println("-----------");
//		
//		Class st1=Student.class;
//		System.out.println(st1);
//		Student s1=(Student) st1.newInstance();//这个new对象 执行构造方法其他的不执行
		
	}

}
