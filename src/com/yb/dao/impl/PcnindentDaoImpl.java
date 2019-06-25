package com.yb.dao.impl;

import com.yb.dao.BaseDao;
import com.yb.dao.pcnindentDao;
import com.yb.entity.Pcnindent;


public class PcnindentDaoImpl extends BaseDao implements pcnindentDao{
	
	public int save(Pcnindent pcnIndent) {
		// TODO Auto-generated method stub
		int result=-1;
		try {
			getConn();
			String sql="insert into pcn_indent values(null,?,?,?,?,?)";
			st=conn.prepareStatement(sql);
			st.setInt(1,pcnIndent.getPcnuid());
			st.setString(2,pcnIndent.getPcniordernumber() );
			st.setInt(3,pcnIndent.getPcniactualpayment());
			st.setInt(4, pcnIndent.getPcnitransactionstatus());
			st.setString(5,pcnIndent.getPcnitime());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		return result;
	}

	public int select(Integer id) {
		// TODO Auto-generated method stub
		int pcniid = 0;
		try {
			getConn();
			String sql="select * from pcn_indent where pcnu_id=? order by pcnu_id desc LIMIT 0,1";
			st=conn.prepareStatement(sql);
			st.setInt(1,id);
			rs=st.executeQuery();
			while(rs.next()){
				pcniid=rs.getInt("pcni_id");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		return pcniid;
	}

}
