package com.cc.dao.imp;
import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.MasterDao;
import com.cc.entity.Master;
public class MasterDaoImp extends BaseDao implements MasterDao {
	@Override
	public int save(Master master) {		
		try {
			conn();
			String sql="insert into master values(null,?,?,?)";
			st=conn.prepareStatement(sql);
			st.setString(1, master.getName());
			st.setString(2, master.getPass());
			st.setInt(3, master.getMoney());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(null, conn, st);
		}	
		return result;
	}
	public int dropMt(Master master) {
		try {
			conn();
			String sql="delete from master where name=?";
			st=conn.prepareStatement(sql);
			st.setString(1, master.getName());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(null, conn, st);
		}	
		return result;
	}
	public int updateMt(Master master) {
		try {
			conn();
			String sql="update master set password=? where name=?";
			st=conn.prepareStatement(sql);
			st.setString(1, master.getPass());
			st.setString(2, master.getName());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(null, conn, st);
		}	
		return result;
	}
	public List<Master> list(int id) {
		List<Master> list=new ArrayList<Master>();
		
		try {
			conn();
			StringBuffer sql=new StringBuffer("select * from master ");
			if(id!=0){
				sql=sql.append("where id=?");
				st=conn.prepareStatement(sql.toString());
				st.setInt(1,id);
			}else{
				st=conn.prepareStatement(sql.toString());
			}
			rs=st.executeQuery();
			while(rs.next()){
				Master mast=new Master();
				mast.setName(rs.getString("name"));
				mast.setPass(rs.getString("password"));
				mast.setMoney(rs.getInt("money"));
				list.add(mast);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(rs, conn, st);
		}	
		return list;
	}
}
