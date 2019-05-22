package dao;

import entity.Student;

public interface StudentDao {
	int save(Student student);
	int dele(int a);
	int gai(String pname,int pid);
}
