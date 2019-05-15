package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.BaseDao;
import dao.TypeDao;

public class TypeDaoImpl implements TypeDao {

	@Override
	public int findIdTypeName(String typeName) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet r=null;
		int id=-1;
		try {
			conn=BaseDao.getConn();
			String sql = "select id from type where typename=?";
	        pst = conn.prepareStatement(sql);
	        pst.setString(1, typeName);
            r = pst.executeQuery();
            while (r.next()) {
                id = r.getInt("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeConn(r, pst, conn);
        }
        return id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(new TypeDaoImpl().findIdTypeName("企鹅"));

	}
}
