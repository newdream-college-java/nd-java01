package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yb.dao.BaseDao;
import com.yb.dao.ThemeImageDao;
import com.yb.entity.ThemeImage;

public class ThemeImageDaoImpl extends BaseDao implements ThemeImageDao {

	@Override
	public List<ThemeImage> themeImageList(Integer pctid) {
		List<ThemeImage> themeImageList=new ArrayList<ThemeImage>();
		ThemeImage themeImage=null;
		try{
			getConn();
			String sql="select * from pcn_theme_image where pcnid_pctid=?";
			st=conn.prepareStatement(sql);
			st.setInt(1, pctid);
			rs=st.executeQuery();
			while(rs.next()){
				themeImage=new ThemeImage();
				themeImage.setPcntiId(rs.getInt("pcnti_id")); 
				themeImage.setPcntiPctId(rs.getInt("pcnid_pctid"));			
				themeImage.setPcntiImagePath(rs.getString("pcnti_image_path"));
				themeImageList.add(themeImage);
				
			}
	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		
		return themeImageList;
	}
	
}
