package com.song.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.song.dao.BaseDao;
import com.song.dao.StudentDao;
import com.song.entity.Student;

/**
* @author mo
* @version 2019年5月23日 下午2:27:52
* @description
*/
public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean saveStudent(Student student) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		int result=-1;
		try {
			conn=BaseDao.getConnection();
			conn.setAutoCommit(false);
			String sql="insert into student values(null,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setInt(2, student.getAge());
			result=ps.executeUpdate();
			if(result>0) {
				conn.commit();
				return true;
			}else {
				conn.rollback();
				return false;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.closeAll(conn, ps, null);
		}
		return false;
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.setName("小梦");
		student.setAge(23);
		StudentDao studentDao=new StudentDaoImpl();
		if(studentDao.updateStudent(6,student)) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}
	}
	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		int result=-1;
		try {
			conn=BaseDao.getConnection();
			String sql="delete from student where id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			result=ps.executeUpdate();
			if(result>0) {
				return true;
			}else {
				return false;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.closeAll(conn, ps, null);
		}
		return false;
	}
	@Override
	public boolean updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		int result=-1;
		try {
			conn=BaseDao.getConnection();
			String sql="update student set name=?,age=? where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setInt(2, student.getAge());
			ps.setInt(3, id);
			result=ps.executeUpdate();
			if(result>0) {
				return true;
			}else {
				return false;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
