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
			System.out.println("������Ϣ�ɹ���");
		} else {
			System.out.println("������Ϣʧ�ܣ�");
		}*/
		//�ر�ע����� ��������Ϊ �ڽӿ��ж�������� Ҫһ�� ��Ȼ�ᱨ��
		Student stud2= stud.select(stu1);
		
	}
}
