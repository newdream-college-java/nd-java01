package dao;

import java.util.List;

import entity.Student;

public interface StudentDao {
	int save(Student student);
	int dele(int a);
	int gai(String pname,int pid);
	List cha(int id);
}
