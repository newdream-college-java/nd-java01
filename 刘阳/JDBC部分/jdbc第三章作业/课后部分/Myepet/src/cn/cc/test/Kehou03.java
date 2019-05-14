package cn.cc.test;

import cn.cc.dao.StudentDao;
import cn.cc.dao.impl.StudentDaoImpl;
import cn.cc.entity.Student;

public class Kehou03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		StudentDao sd=new StudentDaoImpl();
		System.out.println(sd.cha());
	}

}
 