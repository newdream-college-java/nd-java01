package BaseDao.imgl;

import java.util.ArrayList;
import java.util.List;

import BaseDao.BaseDao;
import BaseDao.newsDao;
import entity.News;

public class NewsDaoImgl extends BaseDao implements newsDao{

	public List<News> select() {
		// TODO Auto-generated method stub
		List<News> list=new ArrayList<News>();
		News news=new News();
		try {
			getConn();
			StringBuffer sql=new StringBuffer("select * from news");
			pst=conn.prepareStatement(sql.toString());
			rs=pst.executeQuery();
			
			while(rs.next()){
				news.setUtitle(rs.getString("ntitle"));
				news.setDate(rs.getString("ncreatedate"));
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
}
