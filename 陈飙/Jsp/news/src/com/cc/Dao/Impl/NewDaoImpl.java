package com.cc.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.Dao.BaseDao;
import com.cc.Dao.NewDao;
import com.cc.entity.New;

public class NewDaoImpl implements NewDao {

	@Override
	public ResultSet select() {
		List list=new ArrayList();
		Connection conn = null;//简化后继承了直接使用了他的属性。
		PreparedStatement pst = null;
		ResultSet rs=null;
		New nw=null;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select nsummary,nid from news;";//此处只能查询Tname
			pst = conn.prepareStatement(sql);
			
			 rs=pst.executeQuery();
			 while(rs.next()){
			 	int id=rs.getInt("nid");
				String ns=rs.getString("nsummary");
				 //此处可以用传入参数的也可以用不传入参数的
				 //不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
				  nw= new New();
				 nw.setNid(id);
				 nw.setNsummary(ns);
				 /*  tp=new Topic();
				  tp.setTid(id);
				 tp.setTname(name); */
				 list.add(nw);
				 //find=true;
			 }
			 System.out.println(list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		//BaseDao.closeConn(rs, pst, conn);
		
		}	
		return rs;
	}
	
	@Override
	public int insert(New news) {
		List list=new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		int rs=-1;
		New nw=null;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "insert into news values(null,04,?,?,'2018-10-28 10:46:30',null,?,null,?);";//此处只能查询Tname
			pst = conn.prepareStatement(sql);
			pst.setString(1, news.getNtitle());
			pst.setString(2, news.getNauthor());
			pst.setString(3, news.getNsummary());
			pst.setString(4, news.getNcontent());
			
			rs=pst.executeUpdate();
			
			if(rs>0){
				System.out.println("插入成功");
			}else{
				System.out.println("插入失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		//BaseDao.closeConn(rs, pst, conn);
		
		}	
		return rs;
	}
	@Override
	public List<New> list(int page, int pageSize) {
		List list=new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs=null;
		New nw=null;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select * from news limit ?,?;";//此处只能查询Tname
			pst = conn.prepareStatement(sql);
			pst.setInt(1,(page-1)*pageSize );
			pst.setInt(2, pageSize);
			 rs=pst.executeQuery();
			 while(rs.next()){
			 	//int id=rs.getInt("nid");
				//String ns=rs.getString("nsummary");
				 //此处可以用传入参数的也可以用不传入参数的
				 //不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
				  nw= new New();
				 nw.setNid(rs.getInt("nid"));
				 nw.setNtid(rs.getInt("ntid"));
				 nw.setNtitle(rs.getString("ntitle"));
				 nw.setNauthor(rs.getString("nauthor"));
				 nw.setNcreatedate(rs.getDate("ncreatedate"));
				 nw.setNpicpath(rs.getString("npicpath"));
				 nw.setNcontent(rs.getString("ncontent"));
				 nw.setNmodifydate(rs.getDate("nmodifydate"));
				 nw.setNsummary(rs.getString("nsummary"));
				 /*  tp=new Topic();
				  tp.setTid(id);
				 tp.setTname(name); */
				 list.add(nw);
				 //find=true;
			 }
			 //System.out.println(list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		BaseDao.closeConn(rs, pst, conn);
		
		}	
		return list;
			}
	@Override
	public int pageMax(int pageSize) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs=null;
		New nw=null;
		int page=-1;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select ceiling(count(*)/?) g from news  ";//此处只能查询Tname
			pst = conn.prepareStatement(sql);
			
			pst.setInt(1, pageSize);
			 rs=pst.executeQuery();
			 while(rs.next()){
			 	 page=rs.getInt("g");
			 }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		BaseDao.closeConn(rs, pst, conn);
		
		}	
		return page;
	}
	public static void main(String[] args) {
		New ne=new New();
		ne.setNtitle("任何");
		ne.setNauthor("wwww1");
		ne.setNpicpath("wwwwww");
		ne.setNcontent("assss");
		ne.setNsummary("aaa");
		NewDao nd=new NewDaoImpl();
		
		System.out.println(nd.insertAll(ne));
		//List<New> rs1=new NewDaoImpl().list(ne);
		//System.out.println(rs1);
	}

	@Override
	public List<New> selectAll() {
		
		List list=new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs=null;
		New nw=null;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select * from news ";//此处只能查询Tname
			pst = conn.prepareStatement(sql);
			//pst.setInt(1,(page-1)*pageSize );
			//pst.setInt(2, pageSize);
			 rs=pst.executeQuery();
			 while(rs.next()){
			 	//int id=rs.getInt("nid");
				//String ns=rs.getString("nsummary");
				 //此处可以用传入参数的也可以用不传入参数的
				 //不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
				  nw= new New();
				 nw.setNid(rs.getInt("nid"));
				 nw.setNtid(rs.getInt("ntid"));
				 nw.setNtitle(rs.getString("ntitle"));
				 nw.setNauthor(rs.getString("nauthor"));
				 nw.setNcreatedate(rs.getDate("ncreatedate"));
				 nw.setNpicpath(rs.getString("npicpath"));
				 nw.setNcontent(rs.getString("ncontent"));
				 nw.setNmodifydate(rs.getDate("nmodifydate"));
				 nw.setNsummary(rs.getString("nsummary"));
				 /*  tp=new Topic();
				  tp.setTid(id);
				 tp.setTname(name); */
				 list.add(nw);
				 //find=true;
			 }
			 //System.out.println(list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		BaseDao.closeConn(rs, pst, conn);
		
		}	
		return list;
		
	}

	@Override
	public int insertAll(New news) {
		List list=new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		int rs=-1;
		New nw=null;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "insert into news values(null,04,?,?,'2018-10-28 10:46:30',?,?,null,?);";//此处只能查询Tname
			pst = conn.prepareStatement(sql);
			pst.setString(1, news.getNtitle());
			pst.setString(2, news.getNauthor());
			pst.setString(3, news.getNpicpath());
			pst.setString(4, news.getNsummary());
			pst.setString(5, news.getNcontent());
			
			rs=pst.executeUpdate();
			
			if(rs>0){
				System.out.println("插入成功");
			}else{
				System.out.println("插入失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		//BaseDao.closeConn(rs, pst, conn);
		
		}	
		return rs;
	}
}
