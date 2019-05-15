package cn.two.dao;

import java.util.List;

import cn.two.entity.Student;

public interface StudentDao {
	int saves(Student student);
	List<Student> save();
}
