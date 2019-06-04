package implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Club;
import Dao.BaseDao;
import Dao.ClubDao;
public class ClubDaoImplement  implements  ClubDao{

	public int update(Club question) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Club> select(Club club) {
		// TODO Auto-generated method stub
		List<Club> list=new ArrayList<Club>();
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Club club1=null;
		conn=BaseDao.getConn();
		try {
			String sql="select * from club ";
			ps=conn.prepareStatement(sql);
			//ps.setInt(1, question.getqId());
			 rs=ps.executeQuery();
			 while(rs.next()){
				 club1=new Club();
				 club1.setId(rs.getInt("id"));
				 club1.setName(rs.getString("name"));
				 club1.setSex(rs.getString("sex"));
				 club1.setAge(rs.getInt("age"));
				 club1.setAddress(rs.getString("address"));
				 club1.setEmail(rs.getString("email"));
				 //qs.set(rs.getString("nsummary"));
				 //System.out.println(ns);
				 System.out.println(club1);
				 list.add(club1);
				 
			 }
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			BaseDao.closeConn(rs, conn, ps);
		}
		return list;
	}
	public static void main(String[] args) {
		ClubDao club1=new ClubDaoImplement();
		Club club=new Club();
		club1.select(club);
		//System.out.println(club1.select(club));
		//System.out.println(qt.select(question));
	}
}
