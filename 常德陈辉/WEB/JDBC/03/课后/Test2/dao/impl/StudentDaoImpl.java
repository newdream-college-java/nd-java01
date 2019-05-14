package 课后.Test2.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import 课后.Test2.dao.BaseDao;
import 课后.Test2.dao.StudentDao;
import 课后.Test2.enity.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public int alter(Student student) {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn=BaseDao.getConn();
			String sql="update studentinfo set stuname=? where StuID=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, student.getStuname());
			pst.setInt(2, student.getStuid());
			result=pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			BaseDao.colseConn(null, pst, conn);
		}
		return result;
	}

	@Override
	public List<Student> chaxun() {
		List<Student> list=new ArrayList<Student>();
		Connection conn=null;
		Statement pst=null;
		ResultSet rs=null;
		Student students=null;
		try {
			conn=BaseDao.getConn();
			pst=conn.createStatement();
			String sql="select * from studentinfo";
			rs=pst.executeQuery(sql);
			while(rs.next()){
				students=new Student();
				students.setStuid(rs.getInt("stuid"));
				students.setStuname(rs.getString("stuint"));
				students.setSclassid(rs.getInt("sclassid"));
				students.setStuage(rs.getInt("stuage"));
				students.setStucard(rs.getString("stucard"));
				students.setStuddress(rs.getString("stuaddress"));
				students.setStuint(rs.getString("stuint"));
				students.setStujointime(rs.getDate("stujointime"));
				students.setStusex(rs.getString("stusex"));
				list.add(students);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			BaseDao.colseConn(rs, pst, conn);
		}
		return list;
	}

	@Override
	public int save(Student student) {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn=BaseDao.getConn();
			String sql="insert into studentinfo(stuint,stuname,stujointime) values(?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, student.getStuint());
			pst.setString(2, student.getStuname());
			pst.setDate(3, (Date) student.getStujointime());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.colseConn(null, pst, conn);
		}
		
		return result;
	}

}
