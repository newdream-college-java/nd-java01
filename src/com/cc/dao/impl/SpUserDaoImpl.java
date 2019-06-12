package com.cc.dao.impl;


import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.SpUserDao;
import com.cc.entity.SpUser;

public class SpUserDaoImpl extends BaseDao implements SpUserDao {

	public List<SpUser> list(String name, int pwd) {
		List<SpUser> list=new ArrayList<SpUser>();
		try {
			getConn();
			String sql="select * from sp_user where spu_name=? and spu_pwd=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setInt(2, pwd);
			rs=pst.executeQuery();
			while(rs.next()){
				SpUser su=new SpUser();
				su.setSpuId(rs.getInt("spu_id"));
				su.setSpuPwd(rs.getInt("spu_pwd"));
				su.setSpuTable(rs.getInt("spu_table"));
				su.setSpuAdress(rs.getString("spu_adress"));
				su.setSpuName(rs.getString("spu_name"));
				su.setSpuNumber(rs.getString("spu_number"));
				su.setSpuRname(rs.getString("spu_rname"));
				su.setSpuZip(rs.getString("spu_zip"));
				list.add(su);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}

}
