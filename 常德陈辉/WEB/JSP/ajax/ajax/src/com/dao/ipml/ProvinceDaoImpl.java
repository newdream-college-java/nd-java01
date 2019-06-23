package com.dao.ipml;

import java.util.ArrayList;
import java.util.List;

import com.dao.BaseDao;
import com.dao.ProvinceDao;
import com.entity.Province;

public class ProvinceDaoImpl extends BaseDao implements ProvinceDao{

	public List<Province> list(String word) {
		List<Province> list=new ArrayList<Province>();
		try {
			getConn();
			String sql="select * from provinces where province like ?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, "%"+word+"%");
			rs=pst.executeQuery();
			while(rs.next()){
				Province pic=new Province();
				pic.setId(rs.getInt("id"));
				pic.setProvinceid(rs.getString("provinceid"));
				pic.setProvince(rs.getString("province"));
				list.add(pic);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}
//	public static void main(String[] args) {
//		ProvinceDao pd=new ProvinceDaoImpl();
//		System.out.println(pd.list("ÊÐ"));
//	}
}
