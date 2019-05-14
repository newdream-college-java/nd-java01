package cn.cc.dao.imgl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.cc.dao.BaseDao;
import cn.cc.dao.typeDao;
import cn.cc.entity.Type;

public class TypeDaoSqlServerImpl implements typeDao{

	@Override
	public int findIdByTypeName(String typename) {
		// TODO Auto-generated method stub
		int id=0;
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		try {
			conn=BaseDao.getConn();
			conn.setAutoCommit(false);
			String sql="select id from type where typename=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,typename);
			result=pst.executeQuery();
			if(result.next()) {
				id=result.getInt("id");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(null, pst, conn);
		}
		return id;
	}

	

	
}
