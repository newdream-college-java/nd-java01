package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.BaseDao;
import dao.masterdao;
import entity.masterInfo;

public class MasterinfoDaoImpl implements masterdao{

	@Override
	public int save(masterInfo stuInfo) {
		// TODO Auto-generated method stub
		 Connection conn = null;
	        PreparedStatement pst = null;
	        int result = -1;
	        try {
	            conn = BaseDao.getConn();
	            String sql = "insert into ta(name) values(?)";
	            pst = conn.prepareStatement(sql);
	            pst.setString(1,stuInfo.getName());
	            result = pst.executeUpdate();
	           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally {
	            BaseDao.closeConn(null, pst, conn);
	        }
	        return result;
	}

	@Override
	public int update(masterInfo stuInfo) {
		// TODO Auto-generated method stub
		 Connection conn = null;
	        PreparedStatement pst = null;
	        int result = -1;
	        try {
	            conn = BaseDao.getConn();
	            String sql = "update ta set name=? where id=?";
	            pst = conn.prepareStatement(sql);
	            pst.setString(1,stuInfo.getName());
	            pst.setInt(2,stuInfo.getId());
	            result = pst.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally {
	            BaseDao.closeConn(null, pst, conn);
	        }
	        return result;
	}

}
