package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.BaseDao;
import com.dao.MembersinfoDao;
import com.entity.Membersinfo;

public class MembersinfoDaoImpl extends BaseDao implements MembersinfoDao {

	public int Update(Membersinfo mbf) {
		int result=-1;
		try {
			getConn();
			String sql="Update membersinfo set Mage=?,Maddress=?,Memail=?,Mgender=?,Mname=? where mid=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, mbf.getMage());
			pst.setString(2, mbf.getMaddress());
			pst.setString(3, mbf.getMemail());
			pst.setString(4, mbf.getMgender());
			pst.setString(5, mbf.getMname());
			pst.setInt(6, mbf.getMid());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return result;
	}

	public List<Membersinfo> list(Integer mid) {
		List<Membersinfo> list = new ArrayList<Membersinfo>();
		try {
			getConn();
			StringBuffer sql=new StringBuffer("select * from membersinfo");
			if(mid==null){
				pst=conn.prepareStatement(sql.toString());
			}else{
				sql.append(" where mid=?");
				pst=conn.prepareStatement(sql.toString());
				pst.setInt(1, mid);
			}
			rs=pst.executeQuery();
			while(rs.next()){
				Membersinfo mbi=new Membersinfo();
				mbi.setMid(rs.getInt("Mid"));
				mbi.setMage(rs.getInt("Mage"));
				mbi.setMaddress(rs.getString("Maddress"));
				mbi.setMemail(rs.getString("Memail"));
				mbi.setMgender(rs.getString("Mgender"));
				mbi.setMname(rs.getString("Mname"));
				list.add(mbi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}

}
