package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yb.dao.BaseDao;
import com.yb.dao.PcnuserDao;
import com.yb.entity.Pcnuser;


public class PcnuserDaoImpl extends BaseDao implements PcnuserDao{

	public int save(Pcnuser pcnUser) {
		int result=-1;
		try {
			getConn();
			String sql="insert into pcn_user values(null,?,?,?,?,?,?,?,?)";
			st=conn.prepareStatement(sql);
			st.setString(1, pcnUser.getPcnuName());
			st.setString(2, pcnUser.getPcnuPassword());
			st.setString(3, pcnUser.getPcnuEmail());
			st.setString(4, pcnUser.getPcnuNumber());
			st.setString(5, pcnUser.getPcnuSite());
			st.setString(6, pcnUser.getQq());
			st.setInt(7, pcnUser.getBbsex());
			st.setString(8, pcnUser.getBbname());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeAll(rs,conn,st);
		}
		return result;
	}
	public List<Pcnuser> list(String name, String password) {
		// TODO Auto-generated method stub
		List<Pcnuser> list=new ArrayList<Pcnuser>();
		Pcnuser pu;
		try {
			getConn();
			String sql="select * from pcn_user where pcnu_name=? and pcnu_password=?";
			st=conn.prepareStatement(sql);
			st.setString(1, name);
			st.setString(2, password);
			rs=st.executeQuery();
			while(rs.next()){
				pu=new Pcnuser();
				pu.setBbname(rs.getString("bbname"));
				pu.setPcnuEmail(rs.getString("pcnu_email"));
				pu.setPcnuName(rs.getString("pcnu_name"));
				pu.setPcnuNumber(rs.getString("pcnu_number"));
				pu.setPcnuPassword(rs.getString("pcnu_password"));
				pu.setPcnuSite(rs.getString("pcnu_site"));
				pu.setQq(rs.getString("qq"));
				pu.setPcnuId(rs.getInt("pcnu_id"));
				pu.setBbsex(rs.getInt("bbsex"));
				list.add(pu);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		return list;
	}
	public int update(Pcnuser pcnUser) {
		// TODO Auto-generated method stub
		int result=-1;
		try {
			getConn();
			String sql="update pcn_user set pcnu_name=?,pcnu_password=?,pcnu_number=?,pcnu_email=? where pcnu_id=?";
			st=conn.prepareStatement(sql);
			st.setString(1,pcnUser.getPcnuName() );
			st.setString(2,pcnUser.getPcnuPassword());
			st.setString(3,pcnUser.getPcnuNumber());
			st.setString(4, pcnUser.getPcnuEmail());
			st.setInt(5,pcnUser.getPcnuId());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		return result;
	}
	public List<Pcnuser> select(Integer id) {
		// TODO Auto-generated method stub
		List<Pcnuser> list=new ArrayList<Pcnuser>();
		Pcnuser pu;
		try {
			getConn();
			String sql="select * from pcn_user where pcnu_id=?";
			st=conn.prepareStatement(sql);
			st.setInt(1, id);
			rs=st.executeQuery();
			while(rs.next()){
				pu=new Pcnuser();
				pu.setBbname(rs.getString("bbname"));
				pu.setPcnuEmail(rs.getString("pcnu_email"));
				pu.setPcnuName(rs.getString("pcnu_name"));
				pu.setPcnuNumber(rs.getString("pcnu_number"));
				pu.setPcnuPassword(rs.getString("pcnu_password"));
				pu.setPcnuSite(rs.getString("pcnu_site"));
				pu.setQq(rs.getString("qq"));
				pu.setPcnuId(rs.getInt("pcnu_id"));
				pu.setBbsex(rs.getInt("bbsex"));
				list.add(pu);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		return list;
	}
//	public static void main(String[] args) {
//		pcn_userDaoImpl pd=new pcn_userDaoImpl();
//		pcn_user pu=new pcn_user();
//		pu.setPcnuName("用戶1");
//		pu.setPcnuEmail("134567@qq.com");
//		pu.setPcnuNumber("13573424324");
//		pu.setPcnuPassword("3333");
//		pu.setPcnuId(1);
//		pd.update(pu);
//		System.out.println(pd.update(pu));
//	}
}
