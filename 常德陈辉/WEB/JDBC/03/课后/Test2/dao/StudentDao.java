package �κ�.Test2.dao;

import java.util.List;

import �κ�.Test2.enity.Student;

public interface StudentDao {
	public List<Student> chaxun();
	int save(Student student);
	int alter(Student student);
}
