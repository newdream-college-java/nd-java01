package BaseDao.imgl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import BaseDao.BaseDao;
import BaseDao.topicDao;
import entity.Topic;

public class topicDaoimgl extends BaseDao implements topicDao{

	public int save(Topic topic) {
		// TODO Auto-generated method stub
		int result=0;
		try {
			getConn();
			String sql="insert into topic values(null,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,topic.getTname());
			result=pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			doseAll(null, pst, conn);
		}
		
		return result;
	}

	public boolean getByName(String title) {
		boolean find=false;
		try {
			getConn();
			String sql="select * from topic where tname=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,title);
			rs=pst.executeQuery();
			while(rs.next()){
				find=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			doseAll(rs, pst, conn);
		}
		return find;
	}

	public List<Topic> getTopics() {
		// TODO Auto-generated method stub
		List<Topic> list=new ArrayList<Topic>();
		try {
			getConn();
			String sql="select * from topic";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				Topic topic=new Topic();
				topic.setTname(rs.getString("tname"));
				list.add(topic);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			doseAll(rs,pst, conn);			
		}
		return list;
	}
}
