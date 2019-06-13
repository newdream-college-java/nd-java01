package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yb.dao.BaseDao;
import com.yb.dao.ParentChildThemeDao;
import com.yb.entity.ParentChildTheme;

public class ParentChildThemeDaoImpl extends BaseDao implements ParentChildThemeDao {
	@Override
	public List<ParentChildTheme> parentChildThemeList(Integer themeType,Integer page,Integer pageSize,String city,Integer activity,Integer day) {
		List<ParentChildTheme> pctList=new ArrayList<ParentChildTheme>();
		try {
			getConn();	
			StringBuffer sql=new StringBuffer("select * from pcn_parent_child_theme");
			if(city!=null&&activity==null&&day==null){
				sql.append(" where pcntt_id=? and pcnpct_site like ? and pcnpct_merchant_activity limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setString(2, "%ÔÀÂ´Çø%");
				st.setInt(3, (page-1)*pageSize);
				st.setInt(4, pageSize);	
			}else if(city==null&&activity!=null&&day==null){
				sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, activity);
				st.setInt(3, (page-1)*pageSize);
				st.setInt(4, pageSize);			
			}else if(city!=null&&activity!=null&&day==null){
				sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_site like ? limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, activity);
				st.setString(3,"%"+city+"%");
				st.setInt(4, (page-1)*pageSize);
				st.setInt(5, pageSize);
				

			}else if(city!=null&&activity==null&&day!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_site like ? and to_days( pcnpct_start_time) = to_days(now()) limit ?,?");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_site like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time) limit ?,?");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_site like ? and to_days( pcnpct_end_time) < to_days(now()) limit ?,?");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setString(2,"%"+city+"%");
				st.setInt(3, (page-1)*pageSize);
				st.setInt(4, pageSize);
				
			}else if(city==null&&activity==null&&day!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and to_days( pcnpct_start_time) = to_days(now()) limit ?,?");
				}else if(day==2){
					sql.append(" where pcntt_id=? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time) limit ?,?");
				}else{
					sql.append(" where pcntt_id=? and to_days( pcnpct_end_time) < to_days(now()) limit ?,?");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, (page-1)*pageSize);
				st.setInt(3, pageSize);	
			}else if(city!=null&&activity==null&&day!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and to_days( pcnpct_start_time) = to_days(now()) limit ?,?");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time) limit ?,?");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and to_days( pcnpct_end_time) < to_days(now()) limit ?,?");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setString(2,"%"+city+"%");
				st.setInt(3, (page-1)*pageSize);
				st.setInt(4, pageSize);	
			}else if(city!=null&&activity!=null&&day!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_site like ? and to_days( pcnpct_start_time) = to_days(now()) limit ?,?");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_site like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time) limit ?,?");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_site like ? and to_days( pcnpct_end_time) < to_days(now()) limit ?,?");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, activity);
				st.setString(3,"%"+city+"%");
				st.setInt(4, (page-1)*pageSize);
				st.setInt(5, pageSize);							
			}else{			
				sql.append(" where pcntt_id=? limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, (page-1)*pageSize);
				st.setInt(3, pageSize);
			}
			
			rs=st.executeQuery();
			while(rs.next()){
				ParentChildTheme pct=new ParentChildTheme();			
				pct.setPcnpctId(rs.getInt("pcnpct_id"));
				pct.setPcnThemeName(rs.getString("pcnpct_theme_name"));
				pct.setPcnStartTime(rs.getString("pcnpct_start_time"));
				pct.setPcnEndTime(rs.getString("pcnpct_end_time"));
				pct.setPcnStatus(rs.getInt("pcnpct_status"));
				pct.setPcnSite(rs.getString("pcnpct_site"));
				pct.setPcnMerchantActivity(rs.getInt("pcnpct_merchant_activity"));
				pct.setPcnShow(rs.getInt("pcnpct_show"));
				pct.setPcnRecommend(rs.getInt("pcnpct_recommend"));
				pct.setPcnRankingList(rs.getInt("pcnpct_ranking_list"));
				pct.setPcnttId(rs.getInt("pcntt_id"));
				pct.setPcnReason(rs.getString("pcnpct_trip_mode"));
				pct.setPcnTripMode(rs.getInt("pcnpct_trip_mode"));
				pct.setPcnTravelDays(rs.getInt("pcnpct_travel_days"));
				pct.setImgUrl(rs.getString("pcnpct_img_url"));
				pctList.add(pct);
				
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(rs,conn,st);
		}
		return pctList;
	}
	public Map<String,Integer> numbers(Integer themeType,int pagesize,String city,Integer activity,Integer day) {
		Map<String,Integer> numbers=new HashMap<String,Integer>();
		try {
			getConn();
			StringBuffer sql=new StringBuffer("select count(*) count,ceil(count(*)/?) number from pcn_parent_child_theme");
			if(city!=null&&activity!=null&&day==null){		
				sql.append(" where pcntt_id=? and pcnpct_site like ? and pcnpct_merchant_activity=?");
				st=conn.prepareStatement(sql.toString());				
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3,"%"+city+"%");
				st.setInt(4, activity);
			}else if(city!=null&&activity==null&&day==null){
				sql.append(" where pcntt_id=? and pcnpct_site like ?");
				st=conn.prepareStatement(sql.toString());				
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3,"%"+city+"%");
			}else if(city==null&&activity!=null&&day==null){
				sql.append(" where pcntt_id=? and pcnpct_merchant_activity=?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setInt(3, activity);
			}else if(city!=null&&activity!=null&&day!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_site like ? and to_days( pcnpct_start_time) = to_days(now())");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_site like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time)");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_site like ? and to_days( pcnpct_end_time) < to_days(now())");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setInt(3, activity);
				st.setString(4,"%"+city+"%");
			}else if(city==null&&activity==null&&day!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and to_days( pcnpct_start_time) = to_days(now())");
				}else if(day==2){
					sql.append(" where pcntt_id=? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time)");
				}else{
					sql.append(" where pcntt_id=? and to_days( pcnpct_end_time) < to_days(now())");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				
			}else if(city==null&&activity!=null&&day!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and to_days( pcnpct_start_time) = to_days(now())");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time)");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and to_days( pcnpct_end_time) < to_days(now())");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setInt(3, activity);
				
			}else if(city!=null&&activity==null&&day!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_site like ? and to_days( pcnpct_start_time) = to_days(now())");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_site like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time)");
				}else{
					sql.append(" where pcnpct_site like ? and to_days( pcnpct_end_time) < to_days(now())");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3,"%"+city+"%");
				
			}else{
				sql.append(" where pcntt_id=?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
			}
			rs=st.executeQuery();
			if(rs.next()){
				int number=rs.getInt("number");
				int count=rs.getInt("count");
				numbers.put("number",number);
				numbers.put("count",count);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(rs,conn,st);
		}	
		return numbers;
	}
}
