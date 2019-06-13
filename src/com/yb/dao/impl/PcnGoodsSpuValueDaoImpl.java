package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yb.dao.BaseDao;
import com.yb.entity.PcnGoodsSpuValue;

public class PcnGoodsSpuValueDaoImpl extends BaseDao {
	public List<PcnGoodsSpuValue> PcnGoodsSpuSpecPrice() {
		List<PcnGoodsSpuValue> list=new ArrayList<PcnGoodsSpuValue>();	
		try {
			getConn();	
			String sql="select * from pcn_goods_spec_value where pcngsv_gsid=1";
			st=conn.prepareStatement(sql);			
			rs=st.executeQuery();
			while(rs.next()){
				PcnGoodsSpuValue pgss=new PcnGoodsSpuValue();
				pgss.setPcngssId(rs.getInt("pcngsv_id"));
				pgss.setPcngssPctId(rs.getInt("pcngsv_pctid"));
				pgss.setPrice(rs.getInt("pcngsv_value"));
				pgss.setPcngsvGsid(rs.getInt("pcngsv_gsid"));
				list.add(pgss);			
			}
	
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(rs,conn,st);
		}
		return list;
	}
	
}
