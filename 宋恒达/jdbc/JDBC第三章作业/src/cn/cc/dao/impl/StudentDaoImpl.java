package cn.cc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.cc.dao.BaseDao;
import cn.cc.dao.StudentDao;
import cn.cc.entity.Student;

/**
* @author mo
* @version 2019年5月13日 下午8:11:16
* @description
*/
public class StudentDaoImpl implements StudentDao{

	@Override
	public boolean updateStudentById(int id,String name) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.getConnection();
			String sql="update Student set name=? where id=?";
			conn.setAutoCommit(false);
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			int result=ps.executeUpdate();
			if(result>0) {
				conn.commit();
				return true;
			}else {
				conn.rollback();
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.getConnection();
			String sql="select * from Student";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Student student=new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				students.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}

}
