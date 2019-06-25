package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yb.dao.BaseDao;
import com.yb.dao.ParentChildThemeDao;
import com.yb.entity.ParentChildTheme;
import com.yb.vo.ParentChildThemeVo;

public class ParentChildThemeDaoImpl extends BaseDao implements ParentChildThemeDao {
	@Override
	//亲子活动条件分页查询
	public List<ParentChildTheme> parentChildThemeList(Integer themeType,Integer page,Integer pageSize,String city,Integer activity,Integer day,String name) {
		List<ParentChildTheme> pctList=new ArrayList<ParentChildTheme>();
		try {
			getConn();	
			StringBuffer sql=new StringBuffer("select * from pcn_parent_child_theme");
			if(city!=null&&activity==null&&day==null&&name==null){
				sql.append(" where pcntt_id=? and pcnpct_site like ? and pcnpct_merchant_activity limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setString(2,"%"+city+"%");
				st.setInt(3, (page-1)*pageSize);
				st.setInt(4, pageSize);	
			}else if(city==null&&activity!=null&&day==null&&name==null){
				sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, activity);
				st.setInt(3, (page-1)*pageSize);
				st.setInt(4, pageSize);			
			}else if(city!=null&&activity!=null&&day==null&&name==null){
				sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_site like ? limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, activity);
				st.setString(3,"%"+city+"%");
				st.setInt(4, (page-1)*pageSize);
				st.setInt(5, pageSize);
			}else if(city!=null&&activity==null&&day!=null&&name==null){
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
				
			}else if(city==null&&activity==null&&day!=null&&name==null){
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
			}else if(city!=null&&activity==null&&day!=null&&name==null){
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
			}else if(city!=null&&activity!=null&&day!=null&&name==null){
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
			}else if(city==null&&activity==null&&day==null&&name!=null){
				sql.append(" where pcntt_id=? and pcnpct_theme_name like ? limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setString(2,"%"+name+"%");
				st.setInt(3, (page-1)*pageSize);
				st.setInt(4, pageSize);
			}else if(city==null&&activity!=null&&day==null&&name!=null){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, activity);
				st.setString(3, "%"+name+"%");
				st.setInt(4, (page-1)*pageSize);
				st.setInt(5, pageSize);	
			}else if(city==null&&activity==null&&day!=null&&name!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and to_days( pcnpct_start_time) = to_days(now()) limit ?,?");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time) limit ?,?");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and to_days(pcnpct_end_time) < to_days(now()) limit ?,?");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setString(2, "%"+name+"%");
				st.setInt(3, (page-1)*pageSize);
				st.setInt(4, pageSize);	
			}else if(city!=null&&activity!=null&&day!=null&&name!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and pcnpct_site like ? and to_days( pcnpct_start_time) = to_days(now()) limit ?,?");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and pcnpct_site like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time) limit ?,?");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and pcnpct_site like ? and to_days(pcnpct_end_time) < to_days(now()) limit ?,?");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, activity);
				st.setString(3, "%"+name+"%");
				st.setString(4,"%"+city+"%");
				st.setInt(5, (page-1)*pageSize);
				st.setInt(6, pageSize);	
			}else if(city==null&&activity!=null&&day!=null&&name!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and to_days( pcnpct_start_time) = to_days(now()) limit ?,?");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time) limit ?,?");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and to_days(pcnpct_end_time) < to_days(now()) limit ?,?");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, activity);
				st.setString(3, "%"+name+"%");
				st.setInt(4, (page-1)*pageSize);
				st.setInt(5, pageSize);	
			}else if(city!=null&&activity!=null&&day==null&&name!=null){
				sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and pcnpct_site like ? limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, activity);
				st.setString(3, "%"+name+"%");
				st.setString(4,"%"+city+"%");
				st.setInt(5, (page-1)*pageSize);
				st.setInt(6, pageSize);	
			}else if(city!=null&&activity==null&&day==null&&name!=null){
				sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and pcnpct_site like ? limit ?,?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setString(2, "%"+name+"%");
				st.setString(3,"%"+city+"%");
				st.setInt(4, (page-1)*pageSize);
				st.setInt(5, pageSize);	
			}else if(city!=null&&activity==null&&day!=null&&name!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and pcnpct_site like ? and to_days( pcnpct_start_time) = to_days(now()) limit ?,?");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and pcnpct_site like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time) limit ?,?");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and pcnpct_site like ? and to_days(pcnpct_end_time) < to_days(now()) limit ?,?");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setString(2, "%"+name+"%");
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
				pct.setPcnpctThemeName(rs.getString("pcnpct_theme_name"));
				pct.setPcnpctStartTime(rs.getDate("pcnpct_start_time"));
				pct.setPcnpctEndTime(rs.getDate("pcnpct_end_time"));
				pct.setPcnpctStatus(rs.getInt("pcnpct_status"));
				pct.setPcnpctSite(rs.getString("pcnpct_site"));
				pct.setPcnpctMerchantActivity(rs.getInt("pcnpct_merchant_activity"));
				pct.setPcnpctShow(rs.getInt("pcnpct_show"));
				pct.setPcnpctRecommend(rs.getInt("pcnpct_recommend"));
				pct.setPcnpctRankingList(rs.getInt("pcnpct_ranking_list"));
				pct.setPcnpctttId(rs.getInt("pcntt_id"));
				pct.setPcnpctReason(rs.getString("pcnpct_trip_mode"));
				pct.setPcnpctTripMode(rs.getInt("pcnpct_trip_mode"));
				pct.setPcnpctTravelDays(rs.getInt("pcnpct_travel_days"));
				pct.setPcnpctimgUrl(rs.getString("pcnpct_img_url"));
				pctList.add(pct);			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(rs,conn,st);
		}
		return pctList;
	}		
	//查询亲子活动总数据和总页数
	public Map<String,Integer> numbers(Integer themeType,int pagesize,String city,Integer activity,Integer day,String name) {
		Map<String,Integer> numbers=new HashMap<String,Integer>();
		try {
			getConn();
			StringBuffer sql=new StringBuffer("select count(*) count,ceil(count(*)/?) number from pcn_parent_child_theme");
			if(city!=null&&activity!=null&&day==null&&name==null){		
				sql.append(" where pcntt_id=? and pcnpct_site like ? and pcnpct_merchant_activity=?");
				st=conn.prepareStatement(sql.toString());				
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3,"%"+city+"%");
				st.setInt(4, activity);
			}else if(city!=null&&activity==null&&day==null&&name==null){
				sql.append(" where pcntt_id=? and pcnpct_site like ?");
				st=conn.prepareStatement(sql.toString());				
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3,"%"+city+"%");
			}else if(city==null&&activity!=null&&day==null&&name==null){
				sql.append(" where pcntt_id=? and pcnpct_merchant_activity=?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setInt(3, activity);
			}else if(city!=null&&activity!=null&&day!=null&&name==null){
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
			}else if(city==null&&activity==null&&day!=null&&name==null){
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
				
			}else if(city==null&&activity!=null&&day!=null&&name==null){
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
				
			}else if(city!=null&&activity==null&&day!=null&&name==null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_site like ? and to_days( pcnpct_start_time) = to_days(now())");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_site like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time)");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_site like ? and to_days( pcnpct_end_time) < to_days(now())");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3,"%"+city+"%");
				
			}else if(city==null&&activity==null&&day==null&&name!=null){
				sql.append(" where pcntt_id=? and pcnpct_theme_name like ?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3,"%"+name+"%");
			}else if(city==null&&activity!=null&&day==null&&name!=null){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setInt(3, activity);
				st.setString(4, "%"+name+"%");
			}else if(city==null&&activity==null&&day!=null&&name!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and to_days( pcnpct_start_time) = to_days(now())");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time)");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and to_days(pcnpct_end_time) < to_days(now())");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3, "%"+name+"%");
			}else if(city!=null&&activity!=null&&day!=null&&name!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and pcnpct_site like ? and to_days( pcnpct_start_time) = to_days(now())");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and pcnpct_site like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time)");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and pcnpct_site like ? and to_days(pcnpct_end_time) < to_days(now())");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setInt(3, activity);
				st.setString(4, "%"+name+"%");
				st.setString(5,"%"+city+"%");	
			}else if(city==null&&activity!=null&&day!=null&&name!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and to_days( pcnpct_start_time) = to_days(now())");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time)");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and to_days(pcnpct_end_time) < to_days(now())");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setInt(3, activity);
				st.setString(4, "%"+name+"%");
			}else if(city!=null&&activity!=null&&day==null&&name!=null){
				sql.append(" where pcntt_id=? and pcnpct_merchant_activity=? and pcnpct_theme_name like ? and pcnpct_site like ?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setInt(3, activity);
				st.setString(4, "%"+name+"%");
				st.setString(5,"%"+city+"%");
			}else if(city!=null&&activity==null&&day==null&&name!=null){
				sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and pcnpct_site like ? ");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3, "%"+name+"%");
				st.setString(4,"%"+city+"%");
				
			}else if(city!=null&&activity==null&&day!=null&&name!=null){
				if(day==1){
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and pcnpct_site like ? and to_days( pcnpct_start_time) = to_days(now())");
				}else if(day==2){
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and pcnpct_site like ? and DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(pcnpct_start_time)");
				}else{
					sql.append(" where pcntt_id=? and pcnpct_theme_name like ? and pcnpct_site like ? and to_days(pcnpct_end_time) < to_days(now())");
				}
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, pagesize);
				st.setInt(2, themeType);
				st.setString(3, "%"+name+"%");
				st.setString(4,"%"+city+"%");
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
	//查询亲子主题单条数据
	public ParentChildTheme parentChildThemeGet(Integer pctid){
		ParentChildTheme pct=new ParentChildTheme();
		try{
			getConn();
			String sql="select * from pcn_parent_child_theme where pcnpct_id=?";
			st=conn.prepareStatement(sql);
			st.setInt(1, pctid);
			rs=st.executeQuery();
			if(rs.next()){			
				pct.setPcnpctId(rs.getInt("pcnpct_id"));
				pct.setPcnpctThemeName(rs.getString("pcnpct_theme_name"));
				pct.setPcnpctStartTime(rs.getDate("pcnpct_start_time"));
				pct.setPcnpctEndTime(rs.getDate("pcnpct_end_time"));
				pct.setPcnpctStatus(rs.getInt("pcnpct_status"));
				pct.setPcnpctSite(rs.getString("pcnpct_site"));
				pct.setPcnpctMerchantActivity(rs.getInt("pcnpct_merchant_activity"));
				pct.setPcnpctShow(rs.getInt("pcnpct_show"));
				pct.setPcnpctRecommend(rs.getInt("pcnpct_recommend"));
				pct.setPcnpctRankingList(rs.getInt("pcnpct_ranking_list"));
				pct.setPcnpctttId(rs.getInt("pcntt_id"));
				pct.setPcnpctReason(rs.getString("pcnpct_Reason"));
				pct.setPcnpctTripMode(rs.getInt("pcnpct_trip_mode"));
				pct.setPcnpctTravelDays(rs.getInt("pcnpct_travel_days"));
				pct.setPcnpctimgUrl(rs.getString("pcnpct_img_url"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}	
		return pct;
	}
	//活动推荐数查询
	public List<ParentChildTheme> recommendList(Integer pcnttId) {
		List<ParentChildTheme> recommendList=new ArrayList<ParentChildTheme>();
		ParentChildTheme parentChildTheme=null;
		try{
			getConn();
			String sql="select * from pcn_parent_child_theme where pcntt_id=? and pcnpct_recommend=1 limit 3";
			st=conn.prepareStatement(sql);
			st.setInt(1, pcnttId);
			rs=st.executeQuery();
			while(rs.next()){
				parentChildTheme=new ParentChildTheme();
				parentChildTheme.setPcnpctId(rs.getInt("pcnpct_id")); 
				parentChildTheme.setPcnpctThemeName(rs.getString("pcnpct_theme_name"));		
				parentChildTheme.setPcnpctimgUrl(rs.getString("pcnpct_img_url"));
				recommendList.add(parentChildTheme);
				
			}
	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		
		return recommendList;
	}
	//显示亲子旅游的总个数和显示pcnpct_travel_days的总个数
		@Override
		public Integer getcount(int count,int pcnpct_travel_days,String name) {
			int i=0;
			try {
				getConn();
				StringBuffer sql=new StringBuffer("select ceil(count(*)/?) a from pcn_parent_child_theme where pcntt_id=2");	
				if(pcnpct_travel_days>0&&name==null){
					sql.append(" and pcnpct_travel_days=?");
					st=conn.prepareStatement(sql.toString());
					st.setInt(1, count);
					st.setInt(2, pcnpct_travel_days);
				}else if(pcnpct_travel_days>0&&name!=null){
					sql.append(" and pcnpct_travel_days=? and pcnpct_theme_name like ?");
					st=conn.prepareStatement(sql.toString());
					st.setInt(1, count);
					st.setInt(2, pcnpct_travel_days);
					st.setString(3,"%"+name+"%");
				}else if(pcnpct_travel_days==0&&name!=null){
					sql.append(" and pcnpct_theme_name like ?");
					st=conn.prepareStatement(sql.toString());
					st.setInt(1, count);
					st.setString(2,"%"+name+"%");
				}else{
					st=conn.prepareStatement(sql.toString());
					st.setInt(1, count);	
				}
				rs=st.executeQuery();
				if(rs.next()){
					i=rs.getInt("a");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				closeAll(rs, conn, st);
			}
			return i;
		}
		//亲子旅游分页显示和条件分页显示
		public List<ParentChildThemeVo> list(int curPage, int pageSize,int pcnpctTravelDays,String name) {
			List<ParentChildThemeVo> list=new ArrayList<ParentChildThemeVo>();
			try {
				getConn();
				if(pcnpctTravelDays==0&&name==null){
					String sql="select *,max(CASE pcngsv_gsid when 2 then pcngsv_value  else 0 end)  adultPrice,max(CASE pcngsv_gsid when 3 then pcngsv_value  else 0 end)  childrenPrice from pcn_goods_spec_value v,pcn_parent_child_theme p where pcnpct_id=pcngsv_pctid and pvngsv_pcnttid=2 GROUP BY pcngsv_pctid limit ?,?";
					st=conn.prepareStatement(sql);
					st.setInt(1, (curPage-1)*pageSize);
					st.setInt(2,pageSize);
				}else if(pcnpctTravelDays==0&&name!=null){
					String sql="select *,max(CASE pcngsv_gsid when 2 then pcngsv_value  else 0 end)  adultPrice,max(CASE pcngsv_gsid when 3 then pcngsv_value  else 0 end)   childrenPrice from pcn_goods_spec_value v,pcn_parent_child_theme p where pcnpct_id=pcngsv_pctid and pvngsv_pcnttid=2 and pcnpct_theme_name like ?  GROUP BY pcngsv_pctid limit ?,?";
					st=conn.prepareStatement(sql);
					st.setString(1, "%"+name+"%");
					st.setInt(2, (curPage-1)*pageSize);
					st.setInt(3,pageSize);
					
				}else if(pcnpctTravelDays!=0&&name!=null){
					String sql="select *,max(CASE pcngsv_gsid when 2 then pcngsv_value  else 0 end)  adultPrice,max(CASE pcngsv_gsid when 3 then pcngsv_value  else 0 end)   childrenPrice from pcn_goods_spec_value v,pcn_parent_child_theme p where pcnpct_id=pcngsv_pctid and pvngsv_pcnttid=2 and pcnpct_travel_days=? and pcnpct_theme_name like ? GROUP BY pcngsv_pctid limit ?,?";
					st=conn.prepareStatement(sql);
					st.setInt(1,pcnpctTravelDays);
					st.setString(2,"%"+name+"%");
					st.setInt(3,(curPage-1)*pageSize);
					st.setInt(4,pageSize);
					
				}else{					
					String sql="select *,max(CASE pcngsv_gsid when 2 then pcngsv_value  else 0 end)  adultPrice,max(CASE pcngsv_gsid when 3 then pcngsv_value  else 0 end)   childrenPrice from pcn_goods_spec_value v,pcn_parent_child_theme p where pcnpct_id=pcngsv_pctid and pvngsv_pcnttid=2 and pcnpct_travel_days=? GROUP BY pcngsv_pctid limit ?,?";
					st=conn.prepareStatement(sql);
					st.setInt(1,pcnpctTravelDays);
					st.setInt(2,(curPage-1)*pageSize);
					st.setInt(3,pageSize);
				}
				rs=st.executeQuery();
				while(rs.next()){
					ParentChildThemeVo pctv=new ParentChildThemeVo();
					pctv.setPcnpctid(rs.getInt("pcnpct_id"));
					pctv.setAddress(rs.getString("pcnpct_site"));
					pctv.setImage(rs.getString("pcnpct_img_url"));
					pctv.setTheme(rs.getString("pcnpct_theme_name"));				
					pctv.setCrPrice(rs.getInt("adultPrice"));							
					pctv.setEtPrice1(rs.getInt("childrenPrice"));	
					pctv.setReason(rs.getString("pcnpct_reason"));
					list.add(pctv);	
					System.out.println(rs.getInt("adultPrice"));
				}

			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				closeAll(rs, conn, st);
			}
			return list;
		}

		
		
		
		//模糊查询搜索数据

		@Override
		public ParentChildTheme parentChildThemeName(String name) {
			ParentChildTheme pct=new ParentChildTheme();
			try{
				getConn();
				String sql="select * from pcn_parent_child_theme where pcnpct_theme_name like ?";
				st=conn.prepareStatement(sql);
				st.setString(1, "%"+name+"%");
				rs=st.executeQuery();
				if(rs.next()){			
					pct.setPcnpctId(rs.getInt("pcnpct_id"));
					pct.setPcnpctThemeName(rs.getString("pcnpct_theme_name"));
					pct.setPcnpctStartTime(rs.getDate("pcnpct_start_time"));
					pct.setPcnpctEndTime(rs.getDate("pcnpct_end_time"));
					pct.setPcnpctStatus(rs.getInt("pcnpct_status"));
					pct.setPcnpctSite(rs.getString("pcnpct_site"));
					pct.setPcnpctMerchantActivity(rs.getInt("pcnpct_merchant_activity"));
					pct.setPcnpctShow(rs.getInt("pcnpct_show"));
					pct.setPcnpctRecommend(rs.getInt("pcnpct_recommend"));
					pct.setPcnpctRankingList(rs.getInt("pcnpct_ranking_list"));
					pct.setPcnpctttId(rs.getInt("pcntt_id"));
					pct.setPcnpctReason(rs.getString("pcnpct_Reason"));
					pct.setPcnpctTripMode(rs.getInt("pcnpct_trip_mode"));
					pct.setPcnpctTravelDays(rs.getInt("pcnpct_travel_days"));
					pct.setPcnpctimgUrl(rs.getString("pcnpct_img_url"));
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				closeAll(rs, conn, st);
			}
			return pct;
		}
		//查询活动展示数据
		public List<ParentChildTheme> activityDisplayList(Integer themeType,Integer page,Integer pageSize,Integer show) {
			List<ParentChildTheme> pctList=new ArrayList<ParentChildTheme>();
			try {
				getConn();	
				StringBuffer sql=new StringBuffer("select * from pcn_parent_child_theme where pcntt_id=? and pcnpct_show=? limit ?,?");
					st=conn.prepareStatement(sql.toString());
					st.setInt(1, themeType);
					st.setInt(2, show);
					st.setInt(3, (page-1)*pageSize);
					st.setInt(4, pageSize);	
					
				rs=st.executeQuery();
				while(rs.next()){
					ParentChildTheme pct=new ParentChildTheme();			
					pct.setPcnpctId(rs.getInt("pcnpct_id"));
					pct.setPcnpctThemeName(rs.getString("pcnpct_theme_name"));
					pct.setPcnpctStartTime(rs.getDate("pcnpct_start_time"));
					pct.setPcnpctEndTime(rs.getDate("pcnpct_end_time"));
					pct.setPcnpctStatus(rs.getInt("pcnpct_status"));
					pct.setPcnpctSite(rs.getString("pcnpct_site"));
					pct.setPcnpctMerchantActivity(rs.getInt("pcnpct_merchant_activity"));
					pct.setPcnpctShow(rs.getInt("pcnpct_show"));
					pct.setPcnpctRecommend(rs.getInt("pcnpct_recommend"));
					pct.setPcnpctRankingList(rs.getInt("pcnpct_ranking_list"));
					pct.setPcnpctttId(rs.getInt("pcntt_id"));
					pct.setPcnpctReason(rs.getString("pcnpct_trip_mode"));
					pct.setPcnpctTripMode(rs.getInt("pcnpct_trip_mode"));
					pct.setPcnpctTravelDays(rs.getInt("pcnpct_travel_days"));
					pct.setPcnpctimgUrl(rs.getString("pcnpct_img_url"));
					pctList.add(pct);				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				closeAll(rs,conn,st);
			}
			return pctList;
		}
		//查询活动展示总页数
		public Integer counts(int pageSize,Integer show,Integer themeType) {
			Integer counts=null;
			try {
				getConn();
				String sql="select ceil(count(*)/?) count from pcn_parent_child_theme where pcnpct_show=? and pcntt_id=?";
				st=conn.prepareStatement(sql);				
				st.setInt(1, pageSize);
				st.setInt(2, show);	
				st.setInt(3, themeType);
				rs=st.executeQuery();
				if(rs.next()){
					counts=rs.getInt("count");
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				closeAll(rs,conn,st);
			}	
			return counts;
		}
		
		//首页显示数据
		public List<ParentChildTheme> parentChildThemeIndexList(Integer themeType,Integer pageSize) {
			List<ParentChildTheme> pctList=new ArrayList<ParentChildTheme>();
			try {
				getConn();	
				String sql="select * from pcn_parent_child_theme where pcntt_id=? limit ?";
				st=conn.prepareStatement(sql.toString());
				st.setInt(1, themeType);
				st.setInt(2, pageSize);						
				rs=st.executeQuery();
				while(rs.next()){
					ParentChildTheme pct=new ParentChildTheme();			
					pct.setPcnpctId(rs.getInt("pcnpct_id"));
					pct.setPcnpctThemeName(rs.getString("pcnpct_theme_name"));
					pct.setPcnpctStartTime(rs.getDate("pcnpct_start_time"));
					pct.setPcnpctEndTime(rs.getDate("pcnpct_end_time"));
					pct.setPcnpctStatus(rs.getInt("pcnpct_status"));
					pct.setPcnpctSite(rs.getString("pcnpct_site"));
					pct.setPcnpctMerchantActivity(rs.getInt("pcnpct_merchant_activity"));
					pct.setPcnpctShow(rs.getInt("pcnpct_show"));
					pct.setPcnpctRecommend(rs.getInt("pcnpct_recommend"));
					pct.setPcnpctRankingList(rs.getInt("pcnpct_ranking_list"));
					pct.setPcnpctttId(rs.getInt("pcntt_id"));
					pct.setPcnpctReason(rs.getString("pcnpct_trip_mode"));
					pct.setPcnpctTripMode(rs.getInt("pcnpct_trip_mode"));
					pct.setPcnpctTravelDays(rs.getInt("pcnpct_travel_days"));
					pct.setPcnpctimgUrl(rs.getString("pcnpct_img_url"));
					pctList.add(pct);
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				closeAll(rs,conn,st);
			}
			return pctList;
		}
		//查询首页活动展示数据
				public List<ParentChildTheme> activityDisplayIndexList(Integer themeType,Integer pageSize,Integer show) {
					List<ParentChildTheme> pctList=new ArrayList<ParentChildTheme>();
					try {
						getConn();	
						StringBuffer sql=new StringBuffer("select * from pcn_parent_child_theme where pcntt_id=? and pcnpct_show=? limit ?");
							st=conn.prepareStatement(sql.toString());
							st.setInt(1, themeType);
							st.setInt(2, show);
							st.setInt(3, pageSize);	
							
						rs=st.executeQuery();
						while(rs.next()){
							ParentChildTheme pct=new ParentChildTheme();			
							pct.setPcnpctId(rs.getInt("pcnpct_id"));
							pct.setPcnpctThemeName(rs.getString("pcnpct_theme_name"));
							pct.setPcnpctStartTime(rs.getDate("pcnpct_start_time"));
							pct.setPcnpctEndTime(rs.getDate("pcnpct_end_time"));
							pct.setPcnpctStatus(rs.getInt("pcnpct_status"));
							pct.setPcnpctSite(rs.getString("pcnpct_site"));
							pct.setPcnpctMerchantActivity(rs.getInt("pcnpct_merchant_activity"));
							pct.setPcnpctShow(rs.getInt("pcnpct_show"));
							pct.setPcnpctRecommend(rs.getInt("pcnpct_recommend"));
							pct.setPcnpctRankingList(rs.getInt("pcnpct_ranking_list"));
							pct.setPcnpctttId(rs.getInt("pcntt_id"));
							pct.setPcnpctReason(rs.getString("pcnpct_trip_mode"));
							pct.setPcnpctTripMode(rs.getInt("pcnpct_trip_mode"));
							pct.setPcnpctTravelDays(rs.getInt("pcnpct_travel_days"));
							pct.setPcnpctimgUrl(rs.getString("pcnpct_img_url"));
							pctList.add(pct);				
						}
					} catch (Exception e) {
						e.printStackTrace();
					}finally{
						closeAll(rs,conn,st);
					}
					return pctList;
		}				
}
