package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yb.dao.BaseDao;
import com.yb.dao.MyorderDao;
import com.yb.vo.Myorder;


public class MyorderDaoImpl extends BaseDao implements MyorderDao{

	public List<Myorder> list(int apg, int bpg, Integer pcnuid) {
		// TODO Auto-generated method stub
		List<Myorder> list=new ArrayList<Myorder>();
		Myorder md;
		try {
			getConn();
			StringBuffer sql=new StringBuffer("SELECT * from pcn_particulars ps join pcn_goods_spec pg on pg.pcngs_id=ps.pcngs_id join pcn_indent pi on pi.pcni_id=ps.pcni_id  join pcn_parent_child_theme pt on  pt.pcnpct_id=ps.pcnpct_id join pcn_goods_spec_value pv on pg.pcngs_id=pv.pcngsv_gsid  and pv.pcngsv_pctid=pt.pcnpct_id and pi.pcnu_id=? LIMIT ?,?");
			st=conn.prepareStatement(sql.toString());
			st.setInt(1,pcnuid);
			st.setInt(2, (apg-1)*bpg);
			st.setInt(3,bpg);
			rs=st.executeQuery();
			while(rs.next()){
				md=new Myorder();
				md.setPcngs_name(rs.getString("pcngs_name"));
				md.setPcnpt_order_amount(rs.getInt("pcnpt_order_amount"));
				md.setPcni_order_number(rs.getString("pcni_order_number"));
				md.setPcni_time(rs.getString("pcni_time"));
				md.setPcni_transaction_status(rs.getInt("Pcni_transaction_status"));
				md.setPcnpct_theme_name(rs.getString("pcnpct_theme_name"));
				md.setPcnpt_quantity(rs.getInt("pcnpt_quantity"));
				md.setPcnpt_id(rs.getInt("pcnpt_id"));
				md.setPcngsv_value(rs.getInt("pcngsv_value"));
				md.setPcni_id(rs.getInt("pcni_id"));
				list.add(md);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		return list;
	}
	public static void main(String[] args) {
		MyorderDaoImpl md=new MyorderDaoImpl();
		System.out.println(md.list(1, 3,1));
	}
	public int count(int bpg) {
		// TODO Auto-generated method stub
		int count=0;
		try {
			getConn();
			String sql="select ceiling(count(*)/?)cot  from pcn_particulars ps join pcn_goods_spec pg on pg.pcngs_id=ps.pcngs_id join pcn_indent pi on pi.pcni_id=ps.pcni_id join pcn_parent_child_theme pt on  pt.pcnpct_id=ps.pcnpct_id";
			st=conn.prepareStatement(sql);
			st.setInt(1,bpg);
			rs=st.executeQuery();
			while(rs.next()){
				count=rs.getInt("cot");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		return count;
	}
	
}
