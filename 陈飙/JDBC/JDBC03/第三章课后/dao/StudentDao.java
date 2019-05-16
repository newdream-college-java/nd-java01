package com.cc.dao;

import com.cc.entity.Student;

public interface StudentDao {
	int update(Student stu);
	
	Student select(Student stu);
}
