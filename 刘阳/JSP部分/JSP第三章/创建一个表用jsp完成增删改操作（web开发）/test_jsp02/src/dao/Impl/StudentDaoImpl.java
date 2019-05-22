package dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;



import dao.BaseDao;

import dao.StudentDao;
import entity.Student;

public class StudentDaoImpl implements StudentDao  {


	public int dele(int a) {
		
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn = BaseDao.getConn();
			String sql = "delete from stu_info where id=?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, a);
			result = pst.executeUpdate();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return result;
	}

	public int gai(String pname,int pid) {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn = BaseDao.getConn();
			String sql = "update stu_info set sname=? where id=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1,pname);
			pst.setInt(2,pid);
			result = pst.executeUpdate();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return result;
	}

	public int save(Student student) {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn = BaseDao.getConn();
			String sql = "insert into stu_info values(NULL,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, student.getSname());
			pst.setInt(2, student.getSage());
			result = pst.executeUpdate();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return result;
	}
	//≤‚ ‘
	public static void main(String[] args) {
		int result = new StudentDaoImpl().save(new Student("ª‘∏Á",44));
		System.out.println(result);
		
	}
		

}
