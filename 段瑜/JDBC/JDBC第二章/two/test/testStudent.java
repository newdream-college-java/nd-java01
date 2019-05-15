package cn.two.test;

import cn.two.entity.Student;
import cn.two.manager.StudentManager;

public class testStudent {
	public static void main(String[] args) {
		Student student=new Student();
		StudentManager s=new StudentManager();
		System.out.println(s.saves(student));
		s.save();
		int a=s.saves(student)/30+1;
		System.out.println(a);
	}
}
