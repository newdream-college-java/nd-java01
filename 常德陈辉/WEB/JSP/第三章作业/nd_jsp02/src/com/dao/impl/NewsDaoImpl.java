package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.BaseDao;
import com.dao.NewsDao;
import com.entity.News;

public class NewsDaoImpl extends BaseDao implements NewsDao {

	public List<News> news(int page,int pageSize) {
		List<News> list=null;
		try {
			getConn();
			String sql = "select * from News limit ?,?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1,(page-1)*pageSize);
			pst.setInt(2,pageSize );
			rs=pst.executeQuery();
			list=new ArrayList<News>();
			News nw=null;
			while(rs.next()){
				nw=new News();
				nw.setNauthor(rs.getString("Nauthor"));
				nw.setNcontent(rs.getString("Ncontent"));
				nw.setNcreatedate(rs.getString("Ncreatedate"));
				nw.setNmodifydate(rs.getString("Nmodifydate"));
				nw.setNpicpath(rs.getString("Npicpath"));
				nw.setNsummary(rs.getString("Nsummary"));
				nw.setNtitle(rs.getString("Ntitle"));
				nw.setNid(rs.getInt("Nid"));
				nw.setNtid(rs.getInt("Ntid"));
				list.add(nw);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}

	public int last(int pageSize) {
		int ls=-1;
		try {
			getConn();
			String sql = "select ceiling(count(*)/?) a from News";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, pageSize);
			rs=pst.executeQuery();
			if(rs.next()){
				ls=rs.getInt("a");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return ls;
	}

}
