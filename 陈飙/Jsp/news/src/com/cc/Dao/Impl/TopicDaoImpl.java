package com.cc.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.Dao.BaseDao;
import com.cc.Dao.TopicDao;
import com.cc.entity.New;
import com.cc.entity.Topic;

public class TopicDaoImpl extends Topic implements TopicDao {

	@Override
	public int insert(Topic topic) {
		Connection conn = null;
		PreparedStatement pst = null;
		int rs = -1;
		try {
			conn = BaseDao.getConn();
			String sql = "insert into topic values(null,?);";
			pst = conn.prepareStatement(sql);
			pst.setString(1, topic.getTname());
			rs = pst.executeUpdate();
			if (rs > 0) {
				System.out.println("添加成功！");
			} else {
				System.out.println("添加失败！");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(null, pst, conn);
		}
		return rs;
	}

	@Override
	public Topic selectTopic(Topic topic) {
		List list = new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Topic tp = null;
		// boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select Tname from topic ";
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			while (rs.next()) {
				// int id=rs.getInt("Tid");
				String name = rs.getString("Tname");
				// 此处可以用传入参数的也可以用不传入参数的
				// 不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
				tp = new Topic();
				// tp.setTid(id);
				tp.setTid(1);
				tp.setTname(name);
				list.add(tp);
				// find=true;
			}
			System.out.println(list);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(rs, pst, conn);
		}
		return null;
	}

	@Override
	public boolean selectTopic1(Topic topic) {
		List list = new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Topic tp = null;
		boolean find = false;
		try {
			conn = BaseDao.getConn();
			String sql = "select Tname from topic where Tname=?;";
			pst = conn.prepareStatement(sql);
			pst.setString(1, topic.getTname());
			rs = pst.executeQuery();
			while (rs.next()) {
				String name = rs.getString("Tname");
				// 此处可以用传入参数的也可以用不传入参数的
				// 不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
				tp = new Topic();
				tp.setTname(name);
				list.add(tp);
				find = true;
			}
			// System.out.println(find);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(rs, pst, conn);
		}
		return find;
	}

	public static void main(String[] args) {
		// Topic tp1=new Topic();
		// tp.setTname("国内");
		TopicDao tp = new TopicDaoImpl();
		System.out.println(tp.pageSizeMax(10));
	}

	@Override
	public List<String> selectTopic() {
		List list = new ArrayList();
		List<String> list1 = new ArrayList<String>();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		// Topic tp=null;
		// boolean find=false;
		try {
			conn = BaseDao.getConn();
			StringBuffer sql = new StringBuffer("select * from topic ");
			pst = conn.prepareStatement(sql.toString());
			// pst.setString(1, topic.getTname());
			rs = pst.executeQuery();
			while (rs.next()) {
				// Topic tp=new Topic();
				// String name=rs.getString("Tname");
				// 此处可以用传入参数的也可以用不传入参数的
				// 不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
				// tp=new Topic();
				// tp.setTname(name);
				// tp.setTid(rs.getInt("Tid"));
				// tp.setTname(rs.getString("Tname"));
				list1.add(rs.getString("Tname"));// 直接写这个就可以避免差找多个
				// find=true;
			}
			// System.out.println(find);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(rs, pst, conn);
		}
		return list1;
	}

	@Override
	public ResultSet selectTopicAll() {
		List list = new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Topic tp = null;
		// boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select * from topic ";
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("Tid");
				String name = rs.getString("Tname");
				// 此处可以用传入参数的也可以用不传入参数的
				// 不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
				tp = new Topic();
				// tp.setTid(id);
				tp.setTid(1);
				tp.setTname(name);
				list.add(tp);
				// find=true;
			}
			// System.out.println(list);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(rs, pst, conn);
		}
		return (ResultSet) list;
	}

	@Override
	public List<Topic> getTopic(int pageSize, int curPage) {
		List list1 = new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Topic tp = null;
		// boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select * from topic limit ?,?;";// 此处只能查询Tname
			pst = conn.prepareStatement(sql);
			pst.setInt(1, (pageSize - 1) * curPage);
			pst.setInt(2, curPage);
			rs = pst.executeQuery();
			while (rs.next()) {
				tp = new Topic();
				tp.setTid(rs.getInt("Tid"));
				tp.setTname(rs.getString("Tname"));
				list1.add(tp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(rs, pst, conn);

		}
		return list1;
	}

	@Override
	public int pageSizeMax(int pageSize) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		int page = -1;
		// boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select ceiling(count(*)/?) g from Topic  ";// 此处只能查询Tname
			pst = conn.prepareStatement(sql);

			pst.setInt(1, pageSize);
			rs = pst.executeQuery();
			while (rs.next()) {
				page = rs.getInt("g");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(rs, pst, conn);

		}
		return page;
	}
}
