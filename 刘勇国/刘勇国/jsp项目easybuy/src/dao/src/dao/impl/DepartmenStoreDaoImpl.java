package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import entity.DepartmenStore;


public class DepartmenStoreDaoImpl extends BaseDao implements DepartmenStoreImp{
	//申明变量
	Connection conn = null;
	PreparedStatement pst = null;
	List<DepartmenStore> list = null;
	ResultSet rs=null;
	public List<DepartmenStore> departmenStore() {
		//创建集合存储DepartmenStore实体对象数据
		list =new ArrayList<DepartmenStore>();
		try {
			conn=getConn();
			String sql = "select name from Departmen_store";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				
				DepartmenStore spm =new DepartmenStore();
				spm.setName(rs.getString("name"));
				
				list.add(spm);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}
	

}
