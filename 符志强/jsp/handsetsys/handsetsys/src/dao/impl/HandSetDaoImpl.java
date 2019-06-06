package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.HandSetDao;
import entity.HandSet;

public class HandSetDaoImpl extends BaseDao implements HandSetDao {

	public List<HandSet> list(Integer id) {
			List<HandSet> list=new ArrayList<HandSet>();
			try {
				getconn();
				StringBuffer sql=new StringBuffer("select * from handset where 1=1 ");
				if(id!=null){
					sql.append(" and hs_id=?");
					pst=conn.prepareStatement(sql.toString());
					pst.setInt(1, id);
				}else{
					pst=conn.prepareStatement(sql.toString());
				}
				rs=pst.executeQuery();
				while(rs.next()){
					HandSet hs=new HandSet();
					hs.setHs_id(rs.getInt("hs_id"));
					hs.setFacade(rs.getString("facade"));
					hs.setFeel_screen(rs.getString("feel_screen"));
					hs.setName_type(rs.getString("name_type"));
					hs.setNerwork_mode(rs.getString("nerwork_mode"));
					hs.setNetwork_type(rs.getString("network_type"));
					hs.setPrice(rs.getInt("price"));
					hs.setScreeen_size(rs.getString("screeen_size"));
					list.add(hs);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				closeconn(rs, pst, conn);
			}
		return list;
	}
	public boolean delete(Integer id) {
		boolean f=false;
		int rs=-1;
		try {
			getconn();
			String sql="delete from handset where hs_id=?";
		
				pst=conn.prepareStatement(sql);
				pst.setInt(1, id);
			rs=pst.executeUpdate();
			System.out.println(rs);
			if(rs>0){
				f=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeconn(null, pst, conn);
		}
		return f;
}
	//public static void main(String[] args) {
	//	HandSetDaoImpl h=new HandSetDaoImpl();
		//System.err.println(h.list(null));
		//h.delete(1);
		//System.out.println(h.delete(2));
//	}
}
