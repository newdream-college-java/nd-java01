package cn.cc.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import cn.cc.dao.BaseDao;
import cn.cc.dao.StudentDao;
import cn.cc.entity.Student;
public class StudentDaoImpl implements StudentDao{
	public Student stu(Student student) {
		Connection conn=null;
		PreparedStatement st=null;
		int resu=0;
		try {
			conn=BaseDao.getConnection();
			String sql="update student set name=? where id=?";
			st=conn.prepareStatement(sql);
			st.setString(1,student.getName());
			st.setInt(2,student.getId());
			
			resu=st.executeUpdate();
			if(resu>0) {
				System.out.println("Ìí¼Ó³É¹¦");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(null, conn, st);
		}
		return null;
	}
	public static void main(String[] args) {
		Student su=new Student();
		su.setId(3);
		su.setName("»Ô»Ô");
		StudentDaoImpl std=new StudentDaoImpl();
		std.stu(su);
	}
}
