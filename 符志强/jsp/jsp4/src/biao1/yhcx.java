package biao1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class yhcx extends BaseDao implements yhjk {

	public boolean getname(String name1, String pwd1) {
			Connection conn=null;
			PreparedStatement pst=null;
			ResultSet rs=null;
			boolean b=false;
			try {
				conn=BaseDao.ct();
				StringBuffer sql=new StringBuffer("select * from yh where name=? and pwd=?");
				pst=conn.prepareStatement(sql.toString());
				pst.setString(1,name1);
				pst.setString(2, pwd1);
				rs=pst.executeQuery();

				if (rs.next()) {
				b=true;	
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return b;
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		yhcx a=new yhcx();
//		System.out.println(a.getname("ss","123"));
//	}


}
