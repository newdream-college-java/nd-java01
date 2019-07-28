package cn.cc.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import cn.cc.dao.BaseDao;
import cn.cc.dao.StudentDao;
import cn.cc.entity.Student;
public class StudentDaoImpl implements StudentDao{
	public Student stu(Student student) {
		Student ss=null;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.getConnection();
			String sql="select * from student";
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				ss=new Student();
				ss.setId(rs.getInt("id"));
				ss.setName(rs.getString("name"));
				System.out.println(ss);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(rs, conn, st);
		}
		return ss;
	}
	public static void main(String[] args) {
		Student su=new Student();
		StudentDaoImpl std=new StudentDaoImpl();
		std.stu(su);
	}
	
}
