package cn.cc.manager;

import java.util.List;

import cn.cc.dao.StudentDao;
import cn.cc.dao.impl.StudentDaoImpl;
import cn.cc.entity.Student;

/**
* @author mo
* @version 2019年5月13日 下午8:19:28
* @description
*/
public class StudentManager {
		public static boolean updateById(int id,String name) {
			StudentDao studentDao=new StudentDaoImpl();
			return studentDao.updateStudentById(id, name);
		}
		public static List<Student> getAll(){
			StudentDao studentDao=new StudentDaoImpl();
			return studentDao.findAll();
		}
}
