package cn.two.dao.imgl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.two.dao.BaseDao;
import cn.two.dao.StudentDao;
import cn.two.entity.Student;

public class StudentDaoimgl implements StudentDao {

	@Override
	public int saves(Student student) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		int result=0;
		try {
			conn=BaseDao.getConn();
			String sql="select count(*) as a from studen";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			if(rs.next()) {
				result=rs.getInt("a");
				
			}else {
				System.out.println("≤È—Ø ß∞‹");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Student> save() {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<Student> sd=new ArrayList<Student>();
		Student student;
		try {
			conn=BaseDao.getConn();
			String sql="select id,name from studen";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				student=new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				sd.add(student);
			}
			System.out.println(sd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(rs, pst, conn);
		}
		return sd;
	}

	

}
