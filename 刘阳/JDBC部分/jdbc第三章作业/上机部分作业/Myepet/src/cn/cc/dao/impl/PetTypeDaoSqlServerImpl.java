package cn.cc.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.cc.dao.BaseDao;
import cn.cc.dao.PetTypeDao;
import cn.cc.entity.PetType;

public class PetTypeDaoSqlServerImpl extends BaseDao implements PetTypeDao {

	@Override
	public int findIdByTypeName(String name) {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement pst = null;
        ResultSet result=null;
        PetType pt=null;
        try {
            conn = BaseDao.getConnection();
            String sql = "select id from type where typename=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,name);
           result = pst.executeQuery();

           if(result.next()) {
        	   pt=new PetType();
               //逐列获取值
               pt.setId(result.getInt("id"));
           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(null, pst, conn);
        }
        return pt.getId();
	}
	
}
