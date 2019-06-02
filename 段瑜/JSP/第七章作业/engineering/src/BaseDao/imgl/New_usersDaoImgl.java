package BaseDao.imgl;

import BaseDao.BaseDao;
import BaseDao.New_usersDao;

public class New_usersDaoImgl extends BaseDao implements New_usersDao{

	public boolean login(String uname,String upwd) {
		boolean find=false;
		try {
			getConn();
			String sql="select uname,upwd from new_users where uname=? and upwd=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,uname);
			pst.setString(2,upwd);
			rs=pst.executeQuery();
			while(rs.next()){
				find=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			doseAll(rs, pst, conn);
		}
		return find;
	}

}
