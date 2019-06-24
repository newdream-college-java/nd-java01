package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import entity.NewsInformation;

public class NewsInformationDaoImpl extends BaseDao implements
		NewsInformationImpl {
	//动态新闻显示在index.jsp
	public List<NewsInformation> listNewsInformation() {
		List<NewsInformation> listNewsInformation =new ArrayList<NewsInformation>();
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			conn=getConn();
			String sql="select * from news_information";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				
				NewsInformation newsInformation = new NewsInformation();
				
				newsInformation.setNewsTitle(rs.getString("news_title"));
				newsInformation.setNewsInformation(rs.getString("news_information"));
				newsInformation.setNewsId(rs.getInt("news_id"));
				listNewsInformation.add(newsInformation);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			closeConn(rs, pst, conn);
			
		}
		return listNewsInformation;
	
	}	

}
