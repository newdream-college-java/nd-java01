package com.cc;

import java.sql.ResultSet;

import com.cc.dao.StudentDao;
import com.cc.dao.impl.StudentDaoImpl;
import com.cc.entity.Student;

public class Test01 {
	public static void main(String[] args) {
		/*Student stu = new Student();
		stu.setId(1);
		stu.setName("AAAAAAAA");*/

		Student stu1 = new Student();
		StudentDao stud = new StudentDaoImpl();
		/*int stud1 = stud.update(stu);
		if (stud1 != 0) {
			System.out.println("更改信息成功！");
		} else {
			System.out.println("更改信息失败！");
		}*/
		//特别注意这个 定义类型为 在接口中定义的类型 要一致 不然会报错
		Student stud2= stud.select(stu1);
		
	}
}
