package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.MembersinfoDao;

import entity.Membersinfo;

public class MembersinfoDaoImpl extends BaseDao implements MembersinfoDao {

	public List<Membersinfo> list(Integer mem) {
		List<Membersinfo> list=new ArrayList<Membersinfo>();
		try {
			conn();
			StringBuffer sql=new StringBuffer("select * from membersinfo where 1=1 ");
			if(mem!=null){
				sql.append("and id=?");
				pst=conn.prepareStatement(sql.toString());
				pst.setInt(1, mem);
			}else{
				pst=conn.prepareStatement(sql.toString());
			}
			rs=pst.executeQuery();
			while(rs.next()){
				Membersinfo me=new Membersinfo();
				me.setId(rs.getInt("id"));
				me.setUage(rs.getInt("uage"));
				me.setUdizhi(rs.getString("udizhi"));
				me.setUname(rs.getString("uname"));
				me.setUemail(rs.getString("uemail"));
				me.setUsex(rs.getString("usex"));
				list.add(me);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}
	public List<Membersinfo> findById(int id) {
		List<Membersinfo> list=new ArrayList<Membersinfo>();
		try {
			conn();
			StringBuffer sql=new StringBuffer("select * from membersinfo where id=? ");
			
				pst=conn.prepareStatement(sql.toString());
				pst.setInt(1, id);
			rs=pst.executeQuery();
			while(rs.next()){
				Membersinfo me=new Membersinfo();
				me.setId(rs.getInt("id"));
				me.setUage(rs.getInt("uage"));
				me.setUdizhi(rs.getString("udizhi"));
				me.setUname(rs.getString("uname"));
				me.setUemail(rs.getString("uemail"));
				me.setUsex(rs.getString("usex"));
				list.add(me);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}
	public int update(Membersinfo mem) {
		int rs=-1;
		try {
			conn();
			String sql="update membersinfo set uname=?,usex=?,uage=?,udizhi=?,uemail=? where id=?";
			
			pst=conn.prepareStatement(sql);
			pst.setString(1, mem.getUname());
			pst.setString(2, mem.getUsex());
			pst.setInt(3, mem.getUage());
			pst.setString(4, mem.getUdizhi());
			pst.setString(5, mem.getUemail());
			pst.setInt(6,mem.getId());
			rs=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		return rs;
	}
//	public static void main(String[] args) {
//		MembersinfoDaoImpl m=new MembersinfoDaoImpl();
//		Membersinfo mb=new Membersinfo();
//		mb.setId(1);
//		mb.setUage(0);
//		mb.setUdizhi("asd");
//		mb.setUemail("adas");
//		mb.setUsex("ÄÐ");
//		mb.setUname("a");
//		m.update(mb);
//	}

	
}
