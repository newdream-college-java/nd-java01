package com.song.dao;

import com.song.entity.Student;

/**
* @author mo
* @version 2019��5��23�� ����2:27:18
* @description
*/
public interface StudentDao {
	boolean saveStudent(Student student);
	boolean deleteStudent(int id);
	boolean updateStudent(int id,Student student);
}
