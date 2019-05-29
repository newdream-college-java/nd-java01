package cn.song.dao.impl;
/**
* @author mo
* @version 2019年5月27日 下午8:10:13
* @description
*/

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cn.song.dao.BaseDao;
import cn.song.dao.NewsDao;
import cn.song.entity.News;

public class NewsDaoImpl extends BaseDao implements NewsDao{

	@Override
	public boolean addNews(News news) {
		// TODO Auto-generated method stub
		int result=-1;
		try {
			getConnection();
			conn.setAutoCommit(false);
			String sql="insert into news values(null,?,?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, news.getNtid());
			ps.setString(2, news.getNtitle());
			ps.setString(3, news.getNauthor());
			ps.setString(4, news.getNcreatedate());
			ps.setString(5, news.getNpicpath());
			ps.setString(6, news.getNcontent());
			ps.setString(7, news.getNmodifydate());
			ps.setString(8, news.getNsummary());
			result=ps.executeUpdate();
			if(result>0) {
				conn.commit();
				return true;
			}else{
				conn.rollback();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Map<Integer,News> showAllNews() {
		// TODO Auto-generated method stub
		Map<Integer, News> maps=new HashMap<>();
		News news=null;
		try {
			getConnection();
			String sql="select * from news";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				news=new News();
				news.setNtid(rs.getInt("ntid"));
				news.setNtitle(rs.getString("ntitle"));
				news.setNauthor(rs.getString("nauthor"));
				news.setNcontent(rs.getString("ncontent"));
				news.setNcreatedate(rs.getString("ncreatedate"));
				news.setNpicpath(rs.getString("npicpath"));
				news.setNsummary(rs.getString("nsummary"));
				news.setNmodifydate(rs.getString("nmodifydate"));
				maps.put(rs.getInt("nid"), news);
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
