package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



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
	//测试成功
	public static void main(String[] args) {
//		int result = new StudentDaoImpl().save(new Student("lyg",44));
//		System.out.println(result);
//		
		StudentDaoImpl sdi=new StudentDaoImpl();
		System.out.println(sdi.cha(1));
	}

	public List cha(int id) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		ResultSet rs=null;
		List list =new ArrayList();
		try {
			conn = BaseDao.getConn();
			String sql = "select * from stu_info  where id=?";
			pst = conn.prepareStatement(sql);
			
			pst.setInt(1,id);
			rs=pst.executeQuery();
			while(rs.next()){
				Student stu=new Student();
				stu.setSage(rs.getInt("sage"));
				stu.setSname(rs.getString("sname"));
				list.add(stu);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return list;
	}
}