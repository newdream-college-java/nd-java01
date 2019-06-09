package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.BaseDao;
import com.dao.HandsetDao;
import com.entity.Handset;

public class HandsetDaoImpl extends BaseDao implements HandsetDao {

	public int delete(int hid) {
		int result=-1;
		try {
			getConn();
			String sql="delete from handset where hs_id=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, hid);
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();		
		}finally{
			closeConn(rs, pst, conn);
		}
		return result;
	}

	public List<Handset> list(Integer hid) {
		List<Handset> list = new ArrayList<Handset>();
		try {
			getConn();
			StringBuffer sql=new StringBuffer("select * from handset");
			if(hid!=null){
				sql.append(" where hs_id=?");
				pst=conn.prepareStatement(sql.toString());
				pst.setInt(1, hid);
			}else{
				pst=conn.prepareStatement(sql.toString());
			}
			rs=pst.executeQuery();
			while(rs.next()){
				Handset hs=new Handset();
				hs.setFacade(rs.getString("facade"));
				hs.setFeels(rs.getString("feel_screen"));
				hs.setNamet(rs.getString("name_type"));
				hs.setNetworkm(rs.getString("network_mode"));
				hs.setNetworkt(rs.getString("network_type"));
				hs.setScreens(rs.getString("screen_size"));
				hs.setHid(rs.getInt("hs_id"));
				hs.setPrice(rs.getInt("price"));
				list.add(hs);
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}

}
