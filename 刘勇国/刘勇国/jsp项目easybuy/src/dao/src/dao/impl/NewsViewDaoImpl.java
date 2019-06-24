package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;

import entity.NewsView;

public class NewsViewDaoImpl extends BaseDao implements NewsViewImpl{
	//新闻详情功能
	public List<NewsView> LookUpNewsView(int newsId) {
		
		List<NewsView> arryList = new ArrayList<NewsView>();
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		
		try {
			conn=getConn();
			String sql="select * from news_view where news_id=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, newsId);
			rs=pst.executeQuery();
			while(rs.next()){
				NewsView nv =new NewsView();
				nv.setNewsContent(rs.getString("news_content"));
				nv.setNewsId(rs.getInt("news_id"));
				nv.setNewsTime(rs.getString("news_time"));
				nv.setNewsTitle(rs.getString("news_title"));
				arryList.add(nv);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return arryList;
	}
	

}
