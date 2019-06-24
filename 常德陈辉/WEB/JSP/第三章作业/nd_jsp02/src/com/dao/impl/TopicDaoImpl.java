package com.dao.impl;

import java.util.ArrayList;


import com.dao.BaseDao;
import com.dao.TopicDao;

import com.entity.Topic;

public class TopicDaoImpl extends BaseDao implements TopicDao {

	public boolean getTopicByName(String title) {
		boolean find = false;
		try {
			getConn();
			String sql = "select tname from topic";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				String name=rs.getString("tname");
				if(name.equals(title)){
					find=true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return find;
	}

	public int insertTopic(Topic top) {
		int result=1;
		try {
			getConn();
			String sql = "insert into topic values(null,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,top.getTname());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		return result;
	}

	public int deleteTopic(Topic top) {
		int result=1;
		try {
			getConn();
			String sql = "delete from topic where tid=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1,top.getTid());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		return result;
	}

	public int updateTopic(Topic top) {
		int result=1;
		try {
			getConn();
			String sql = "update topic set tname=? where tid=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,top.getTname());
			pst.setInt(2,top.getTid());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		return result;
	}

	public ArrayList<Topic> selectTopic() {
		ArrayList<Topic> list=null;
		try {
			getConn();
			String sql = "select * from topic";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			list=new ArrayList<Topic>();
			Topic tp=null;
			while(rs.next()){
				tp=new Topic();
				tp.setTid(rs.getInt("tid"));
				tp.setTname(rs.getString("tname"));
				list.add(tp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}

	

}
