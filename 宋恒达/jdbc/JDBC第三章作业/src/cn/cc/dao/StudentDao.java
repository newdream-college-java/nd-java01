package cn.cc.dao;

import java.util.List;

import cn.cc.entity.Student;

/**
* @author mo
* @version 2019��5��13�� ����8:09:51
* @description
*/
public interface StudentDao {
	boolean updateStudentById(int id,String name);
	List<Student> findAll();
}
