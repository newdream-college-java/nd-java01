package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.List;
import com.yb.dao.BaseDao;
import com.yb.dao.GoodsSpuValueDao;
import com.yb.entity.GoodsSpuValue;

public class GoodsSpuValueDaoImpl extends BaseDao implements GoodsSpuValueDao {
	//查询主题价格
	public List<GoodsSpuValue> PcnGoodsSpuSpecPrice(Integer themeType) {
		List<GoodsSpuValue> list=new ArrayList<GoodsSpuValue>();	
		try {
			getConn();	
			String sql="select *,max(CASE pcngsv_gsid when 1 then pcngsv_value  else 0 end)  largePriceAndSmallPrice,max(CASE pcngsv_gsid when 2 then pcngsv_value  else 0 end)  adultPrice,max(CASE pcngsv_gsid when 3 then pcngsv_value  else 0 end)   childrenPrice,max(CASE pcngsv_gsid when 4 then pcngsv_value  else 0 end)  storePrice from pcn_goods_spec_value where pvngsv_pcnttid=? GROUP BY pcngsv_pctid";
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
				pgss.setStorePrice(rs.getInt("storePrice"));
				list.add(pgss);					
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(rs,conn,st);
		}
		return list;
	}

	@Override
	//查询单个主题价格
	public GoodsSpuValue goodsSpuPrice(Integer pctid) {
		GoodsSpuValue goodsSpuPrice=null;
		try{
			getConn();
			String sql="select *,max(CASE pcngsv_gsid when 1 then pcngsv_value  else 0 end)  largePriceAndSmallPrice,max(CASE pcngsv_gsid when 2 then pcngsv_value  else 0 end)  adultPrice,max(CASE pcngsv_gsid when 3 then pcngsv_value  else 0 end)   childrenPrice,max(CASE pcngsv_gsid when 4 then pcngsv_value  else 0 end)  storePrice from pcn_goods_spec_value where pcngsv_pctid=?  GROUP BY pcngsv_pctid";
			st=conn.prepareStatement(sql);
			st.setInt(1, pctid);
			rs=st.executeQuery();
			if(rs.next()){
				goodsSpuPrice=new GoodsSpuValue();
				goodsSpuPrice.setPcngsvId(rs.getInt("pcngsv_id")); 
				goodsSpuPrice.setPcngsvGsid(rs.getInt("pcngsv_gsid"));
				goodsSpuPrice.setPcngsvPctId(rs.getInt("pcngsv_pctid"));
				goodsSpuPrice.setAdultPrice(rs.getInt("adultPrice"));
				goodsSpuPrice.setChildrenPrice(rs.getInt("childrenPrice"));
				goodsSpuPrice.setLargePriceAndSmallPrice(rs.getInt("largePriceAndSmallPrice"));
				goodsSpuPrice.setStorePrice(rs.getInt("storePrice"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		
		return goodsSpuPrice;
	}
	
}
