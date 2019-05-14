package cn.cc.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.cc.dao.BaseDao;
import cn.cc.dao.StudentDao;
import cn.cc.entity.Student;

public class StudentDaoImpl extends BaseDao implements StudentDao {

	@Override
	public int update(Student student) {
		Connection conn = null;
        PreparedStatement pst = null;
        int result = -1;
        try {
            conn = BaseDao.getConnection();
            String sql = "update Student set name=? where id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,student.getName());
            pst.setInt(2,student.getId());
            result = pst.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(null, pst, conn);
        }
        return result;
    }

	@Override
	public List<Student> cha() {
		List<Student> list = new ArrayList<Student>();
		Connection conn = null;
        PreparedStatement pst = null;
        Student stu=null;
        try {
        	conn = BaseDao.getConnection();
        	String sql = "select * from Student";
        	pst =conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
	            //逐列获取值
				stu = new Student();
	            int id = rs.getInt("id");//根据下标取
	            String name= rs.getString("name");
	            stu.setName(name);;
	            stu.setId(id);
	            //将学生放入集合
	            list.add(stu);
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
            BaseDao.closeAll(null, pst, conn);
        }
		return list;
     
	}
}
