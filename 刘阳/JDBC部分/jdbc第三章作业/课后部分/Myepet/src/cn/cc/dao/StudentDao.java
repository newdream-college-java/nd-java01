package cn.cc.dao;


import java.util.List;

import cn.cc.entity.Student;

public interface StudentDao {
	int update(Student student);
	List<Student> cha();
}
