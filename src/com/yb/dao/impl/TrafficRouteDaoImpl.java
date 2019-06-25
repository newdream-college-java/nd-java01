package com.yb.dao.impl;
import com.yb.dao.BaseDao;
import com.yb.dao.TrafficRouteDao;
import com.yb.entity.TrafficRoute;
public class TrafficRouteDaoImpl extends BaseDao implements TrafficRouteDao{

	@Override
	public TrafficRoute trafficRoute(Integer pctid) {
		TrafficRoute trafficRoute=null;
		try{
			getConn();
			String sql="select * from pcn_traffic_route where pcntr_pctid=?";
			st=conn.prepareStatement(sql);
			st.setInt(1, pctid);
			rs=st.executeQuery();
			if(rs.next()){
				trafficRoute=new TrafficRoute();
				trafficRoute.setPcntrId(rs.getInt("pcntr_id")); 
				trafficRoute.setPcntrPctid(rs.getInt("pcntr_pctid"));			
				trafficRoute.setPcntrContent(rs.getString("pcntr_content"));
				trafficRoute.setPcntrImgurl(rs.getString("pcntr_imgurl"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		
		return trafficRoute;
	}


}
