package com.yb.dao.impl;

import com.yb.dao.BaseDao;
import com.yb.dao.PcnparticularsDao;
import com.yb.entity.Pcnparticulars;

public class PcnparticularsDaoImpl extends BaseDao implements PcnparticularsDao{

	public int save(Pcnparticulars pcnParticulars) {
		// TODO Auto-generated method stub
		int result=-1;
		try {
			getConn();
			String sql="insert into pcn_particulars values(null,?,?,?,?,?,?,?,?)";
			st=conn.prepareStatement(sql);
			st.setInt(1, pcnParticulars.getPcniid());
			st.setInt(2, pcnParticulars.getPcngsid());
			st.setInt(3,pcnParticulars.getPcnpctid());
			st.setInt(4,pcnParticulars.getPcnptquantity());
			st.setString(5,pcnParticulars.getPcnptlinkmanName());
			st.setString(6,pcnParticulars.getPcnptlinkmanNumber());
			st.setString(7,pcnParticulars.getPcnptremark());
			st.setInt(8,pcnParticulars.getPcnptorderamount());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		return result;
	}

}
