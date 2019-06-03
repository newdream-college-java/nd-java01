package imple;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.News;
import Dao.BaseDao;
import Dao.Newsinterface;

public class Newsimplement implements Newsinterface {

	public ResultSet select(News news) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		News ns=null;
		conn=BaseDao.getConn();
		try {
			String sql="select nitle,ncreatedate from news";
			ps=conn.prepareStatement(sql);
			 rs=ps.executeQuery();
			 while(rs.next()){
				 ns=new News();
				 ns.setNitle(rs.getString("nitle"));
				 ns.setNcreatedate(rs.getString("ncreatedate"));
				 System.out.println(ns);
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			BaseDao.closeConn(rs, conn, ps);
		}
		return rs;
	}
	public List<News> ServletSelect(News news) {
		// TODO Auto-generated method stub
		List<News> list=new ArrayList<News>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		News ns=null;
		conn=BaseDao.getConn();
		try {
			String sql="select * from news where nid=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, news.getNid());
			 rs=ps.executeQuery();
			 while(rs.next()){
				 ns=new News();
				 ns.setNid(rs.getInt("nid"));
				 ns.setNtid(rs.getInt("ntid"));
				 ns.setNitle(rs.getString("nitle"));
				 ns.setNauthor(rs.getString("nauthor"));
				 ns.setNcreatedate(rs.getString("ncreatedate"));
				 ns.setNpicpath(rs.getString("npicpath"));
				 ns.setNcontent(rs.getString("ncontent"));
				 ns.setNmodiydate(rs.getDate("nmodiydate"));
				 ns.setNsummary(rs.getString("nsummary"));
				 //System.out.println(ns);
				 list.add(ns);
				 System.out.println(ns);
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			BaseDao.closeConn(rs, conn, ps);
		}
		return list;
	}
	public int add(News news){
		Connection conn=null;
		PreparedStatement ps=null;
		int rs=-1;
		//News ns=null;
		conn=BaseDao.getConn();
		try {
			String sql="insert into news values(null,?,?,?,?,?,?,null,?)";
			ps=conn.prepareStatement(sql);
			//ps.setInt(1,ns.getNid());
			ps.setInt(1,news.getNtid());
			ps.setString(2,news.getNitle());
			ps.setString(3,news.getNauthor());
			ps.setString(4,news.getNcreatedate());
			ps.setString(5,news.getNpicpath());
			ps.setString(6,news.getNcontent());
			//ps.setDate(7,nul);
			ps.setString(7,news.getNsummary());
			rs=ps.executeUpdate();
			if(rs>0){
				System.out.println("添加成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return rs;
	}
	
	public static void main(String[] args) {
		News ns=new News();
		Newsimplement m=new Newsimplement();
//		System.out.println(m.limit(1,3));
//		System.out.println();
//		News news=new News();
//		news.setNauthor("asd");
//		news.setNcontent("dsa");
//		news.setNcreatedate("nuasll");
//		news.setNitle("搞什么啊");
//		news.setNpicpath("asdasd");
//		news.setNsummary("dasdas");
//		news.setNtid(77);
//		
//		System.out.println(m.add(news));
		
		
		//Servlet查询方法
		ns.setNid(1);
		m.ServletSelect(ns);
	}
	

	public List<News> limit(int page, int pagesize) {
		// TODO Auto-generated method stub
		int count=0;
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List list=new ArrayList();
		News n=null;
		conn=BaseDao.getConn();
		String sql="select * from news limit ?,?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, (page-1)*pagesize);
			ps.setInt(2, pagesize);
			rs=ps.executeQuery();
			while(rs.next()){
				n=new News();
				n.setNid(rs.getInt("nid"));
				n.setNtid(rs.getInt("ntid"));
				n.setNitle(rs.getString("nitle"));
				n.setNauthor(rs.getString("nauthor"));
				n.setNcreatedate(rs.getString("ncreatedate"));
				n.setNpicpath(rs.getString("npicpath"));
				n.setNcontent(rs.getString("Ncontent"));
				n.setNmodiydate(rs.getDate("nmodiydate"));
				n.setNsummary(rs.getString("nsummary"));
				count++;
				list.add(n);
			}
			System.out.println(count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
