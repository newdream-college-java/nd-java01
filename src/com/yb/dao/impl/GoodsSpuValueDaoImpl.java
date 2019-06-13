package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yb.dao.BaseDao;
import com.yb.dao.GoodsSpuValueDao;
import com.yb.entity.GoodsSpuValue;

public class GoodsSpuValueDaoImpl extends BaseDao implements GoodsSpuValueDao {
	public List<GoodsSpuValue> PcnGoodsSpuSpecPrice(Integer themeType) {
		List<GoodsSpuValue> list=new ArrayList<GoodsSpuValue>();	
		try {
			getConn();	
			String sql="select *,max(CASE pcngsv_gsid when 1 then pcngsv_value  else 0 end)  largePriceAndSmallPrice,max(CASE pcngsv_gsid when 2 then pcngsv_value  else 0 end)  adultPrice,max(CASE pcngsv_gsid when 3 then pcngsv_value  else 0 end)   childrenPrice,max(CASE pcngsv_gsid when 4 then pcngsv_value  else 0 end)  counterPrice,max(CASE pcngsv_gsid when 5 then pcngsv_value  else 0 end)  netPurchasing from pcn_goods_spec_value where pvngsv_pcnttid=? GROUP BY pcngsv_pctid";
			st=conn.prepareStatement(sql);	
			st.setInt(1, themeType);
			rs=st.executeQuery();
			
			while(rs.next()){
				GoodsSpuValue pgss=new GoodsSpuValue();
				pgss.setPcngsvId(rs.getInt("pcngsv_id")); 
				pgss.setPcngsvGsid(rs.getInt("pcngsv_gsid"));
				pgss.setPcngsvPctId(rs.getInt("pcngsv_pctid"));
				pgss.setAdultPrice(rs.getInt("adultPrice"));
				pgss.setChildrenPrice(rs.getInt("childrenPrice"));
				pgss.setLargePriceAndSmallPrice(rs.getInt("largePriceAndSmallPrice"));
				pgss.setCounterPrice(rs.getInt("counterPrice"));
				pgss.setNetPurchasing(rs.getInt("netPurchasing"));
				list.add(pgss);					
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(rs,conn,st);
		}
		return list;
	}
	
}
