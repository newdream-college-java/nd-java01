package cn.cc.dao.imgl;

import java.sql.Connection;
import java.sql.PreparedStatement;



import cn.cc.dao.BaseDao;
import cn.cc.dao.typeDao;
import cn.cc.entity.Type;

public class TypeDaoSqlServerImpl implements typeDao{

	@Override
	public int select(Type type) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn=BaseDao.getConn();
			conn.setAutoCommit(false);
			String sql="select id from type where name=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,type.getTypeName());
			result=pst.executeUpdate();
			if(result==0) {
				conn.rollback();
			}else {
				conn.commit();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(null, pst, conn);
		}
		return result;
	}

	
}
