package cn.two.manager;

import java.util.List;

import cn.two.dao.StudentDao;
import cn.two.dao.imgl.StudentDaoimgl;
import cn.two.entity.Student;

public class StudentManager {
	public int saves(Student student) {
		StudentDao studentDao=new StudentDaoimgl();
		return studentDao.saves(student);
	}
	public List<Student> save(){
		StudentDao studentDao=new StudentDaoimgl();
		return studentDao.save();
		
	}
}
