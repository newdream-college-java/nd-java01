package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yb.dao.ActivityIntroductionDao;
import com.yb.dao.BaseDao;
import com.yb.entity.ActivityIntroduction;
import com.yb.vo.ParentChildThemeVo;

public class ActivityIntroductionDaoImpl extends BaseDao implements ActivityIntroductionDao {

	@Override
	//查询主题介绍内容
	public ActivityIntroduction activityIntroduction(Integer pctid) {
		ActivityIntroduction activityIntroduction=null;
		try{
			getConn();
			String sql="select * from pcn_activity_introduction where pcnai_pctid=?";
			st=conn.prepareStatement(sql);
			st.setInt(1, pctid);
			rs=st.executeQuery();
			if(rs.next()){
				activityIntroduction=new ActivityIntroduction();
				activityIntroduction.setPcnaiId(rs.getInt("pcnai_id")); 
				activityIntroduction.setPcnaiPctid(rs.getInt("pcnai_pctid"));			
				activityIntroduction.setPcnaiContent(rs.getString("pcnai_content"));
				activityIntroduction.setPcnaiImgurl(rs.getString("pcnai_imgurl"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		
		return activityIntroduction;
	}
	
	//查询亲子旅游排行数据
	public List<ParentChildThemeVo> activityIntroductionList(Integer pcnttId) {
		List<ParentChildThemeVo> activityIntroductionList=new ArrayList<ParentChildThemeVo>();
		try{
			getConn();
			String sql="select * from pcn_activity_introduction pai,pcn_parent_child_theme pct where pai.pcnai_pctid=pct.pcnpct_id and pcntt_id=? and pcnpct_ranking_list=1 limit 5";
			st=conn.prepareStatement(sql);
			st.setInt(1, pcnttId);
			rs=st.executeQuery();
			while(rs.next()){
				ParentChildThemeVo parentChildThemeVo=new ParentChildThemeVo();
				parentChildThemeVo.setPcnpctid(rs.getInt("pcnai_id")); 
				parentChildThemeVo.setTheme(rs.getString("pcnpct_theme_name"));			
				parentChildThemeVo.setImage(rs.getString("pcnpct_img_url"));
				parentChildThemeVo.setReason(rs.getString("pcnai_content"));
				activityIntroductionList.add(parentChildThemeVo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		
		return activityIntroductionList;
	}
}
