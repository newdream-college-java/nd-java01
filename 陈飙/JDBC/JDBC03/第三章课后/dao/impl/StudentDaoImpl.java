package com.cc.dao.impl;

/*1.��̫���ΪʲôҪstu.getId()
 * 2.�Լ�Ϊʲôstudent select��Student stu������д
 * */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.StudentDao;
import com.cc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public int update(Student stu) {
		Connection conn = null;
		PreparedStatement pst = null;
		int rs = -1;
		try {
			conn = BaseDao.getConn();
			String sql = "update student set name=? where id=?;";
			pst = conn.prepareStatement(sql);
			pst.setInt(2, stu.getId());
			pst.setString(1, stu.getName());
			rs = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ΪʲôΪnull����Ϊ���Ͳ�ƥ�䣬����дnull
			BaseDao.closConn(null, pst, conn);
		}
		return rs;
	}

	@Override
	// �з���ֵ�Ͳ�����System������
	public Student select(Student stu) {
		List list = new ArrayList();

		Connection conn = null;
		PreparedStatement pst = null;
		Student stus = null;
		try {
			conn = BaseDao.getConn();
			String sql = "select * from Student";
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				// System.out.println("id"+id+"name"+name);
				stus = new Student(id, name);

				list.add(stus);
			}
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closConn(null, pst, conn);
		}

		return stus;
	}

}
