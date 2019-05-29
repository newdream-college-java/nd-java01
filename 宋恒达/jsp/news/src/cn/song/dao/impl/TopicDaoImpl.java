package cn.song.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cn.song.dao.BaseDao;
import cn.song.dao.TopicDao;
import cn.song.entity.Topic;

/**
* @author mob
* @version 2019年5月27日 下午3:07:49
* @description
*/
public class TopicDaoImpl extends BaseDao implements TopicDao{

	@Override
	public boolean addTopic(Topic topic) {
		// TODO Auto-generated method stub
		int result=-1;
		try {
			getConnection();
			conn.setAutoCommit(false);
			String sql="insert into topic values(null,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, topic.getTitle());
			result=ps.executeUpdate();
			if(result>0) {
				conn.commit();
				return true;
			}
			conn.rollback();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return false;
	}

	@Override
	public boolean exitTopic(Topic topic) {
		// TODO Auto-generated method stub
		try {
			getConnection();
			String sql="select * from topic where tname=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, topic.getTitle());
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return false;
	}

	@Override
	public Map<Integer, Topic> findAllTopic() {
		// TODO Auto-generated method stub
		Map<Integer, Topic> maps=new HashMap<>();
		Topic topic=null;
		try {
			getConnection();
			String sql="select * from topic";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				topic=new Topic();
				topic.setTitle(rs.getString("tname"));
				maps.put(rs.getInt("tid"),topic);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maps;
	}
	
}
