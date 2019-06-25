package com.yb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.yb.dao.BaseDao;
import com.yb.dao.DetailsDao;
import com.yb.vo.details;

public class DetailsDaoImpl extends BaseDao implements DetailsDao{

	public List<details> list(Integer id) {
		// TODO Auto-generated method stub
		List<details> list=new ArrayList<details>();
		details ds;
		try {
			getConn();
			StringBuffer sql=new StringBuffer("SELECT * from pcn_particulars ps join pcn_goods_spec pg on pg.pcngs_id=ps.pcngs_id join pcn_parent_child_theme pt on  pt.pcnpct_id=ps.pcnpct_id join pcn_goods_spec_value pv on pg.pcngs_id=pv.pcngsv_gsid  and pv.pcngsv_pctid=pt.pcnpct_id and ps.pcni_id=?");
			st=conn.prepareStatement(sql.toString());
			st.setInt(1, id);
			rs=st.executeQuery();
			while(rs.next()){
				ds=new details();
				ds.setPcngsname(rs.getString("pcngs_name"));
				ds.setPcngsvvalue(rs.getInt("pcngsv_value"));
				ds.setPcnpctsite(rs.getString("pcnpct_site"));
				ds.setPcnpctthemename(rs.getString("pcnpct_theme_name"));
				ds.setPcnpcttripmode(rs.getInt("pcnpct_trip_mode"));
				ds.setPcnptlinkmanname(rs.getString("pcnpt_linkman_name"));
				ds.setPcnptlinkmannumber(rs.getString("pcnpt_linkman_number"));
				ds.setPcnptorderamount(rs.getInt("pcnpt_order_amount"));
				ds.setPcnptremark(rs.getString("pcnpt_remark"));
				ds.setPcnptquantity(rs.getInt("pcnpt_quantity"));
				list.add(ds);
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
		DetailsDaoImpl dd=new DetailsDaoImpl();
		System.out.println(dd.list(1));
	}
}
