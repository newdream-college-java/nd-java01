package BaseDao.imgl;

import java.util.ArrayList;
import java.util.List;

import BaseDao.BaseDao;
import BaseDao.newsDao;
import entity.News;

public class NewsDaoImgl extends BaseDao implements newsDao{

	public List<News> select(int apg,int bpg) {
		// TODO Auto-generated method stub
		List<News> list=new ArrayList<News>();
		try {
			getConn();
			StringBuffer sql=new StringBuffer("select * from news limit ?,?");
			pst=conn.prepareStatement(sql.toString());
			pst.setInt(1, (apg-1)*bpg);
			pst.setInt(2,bpg);
			rs=pst.executeQuery();
			
			while(rs.next()){
				News news=new News();
				news.setNauthor(rs.getString("Nauthor"));
				news.setNtitle(rs.getString("ntitle"));
				news.setNcreatedate(rs.getString("ncreatedate"));
				news.setNid(rs.getInt("Nid"));
				news.setNmodifydate(rs.getString("Nmodifydate"));
				news.setNpicpath(rs.getString("Npicpath"));
				news.setNsummary(rs.getString("Nsummary"));
				news.setNtid(rs.getString("Ntid"));
				news.setNcontent(rs.getString("Ncontent"));
				list.add(news);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			doseAll(rs, pst, conn);
		}
		return list;
	}

	public int conts(int bpg) {
		// TODO Auto-generated method stub
		int count=0;
		try {
			getConn();
			String sql="select ceiling(count(*)/?)cot from news";
			pst=conn.prepareStatement(sql);
			pst.setInt(1,bpg);
			rs=pst.executeQuery();
			while(rs.next()){
				count=rs.getInt("cot");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			doseAll(rs, pst, conn);
			
		}
		return count;
	}

	public int insertNews(News n) {
		// TODO Auto-generated method stub
		int result=-1;
		try {
			getConn();
			String sql="interst into news values(null,?,?,?,null,?,?,null,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, n.getNtid());
			pst.setString(2, n.getNtitle());
			pst.setString(3, n.getNauthor());
			pst.setString(4, n.getNpicpath());
			pst.setString(5, n.getNcontent());
			pst.setString(6, n.getNsummary());
			result=pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
}
