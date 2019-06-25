package com.yb.dao.impl;

import com.yb.dao.BaseDao;
import com.yb.dao.ExpenseStandardDao;
import com.yb.entity.ExpenseStandard;

public class ExpenseStandardDaoImpl extends BaseDao implements ExpenseStandardDao {

	@Override
	//查询收费标准信息
	public ExpenseStandard expenseStandard(Integer pctid) {
		ExpenseStandard expenseStandard=null;
		try{
			getConn();
			String sql="select * from pcn_expense_standard where pcnes_pctid=?";
			st=conn.prepareStatement(sql);
			st.setInt(1,pctid);
			rs=st.executeQuery();
			if(rs.next()){
				expenseStandard=new ExpenseStandard();
				expenseStandard.setPcnesId(rs.getInt("pcnes_id")); 
				expenseStandard.setPcnesPctid(rs.getInt("pcnes_pctid"));			
				expenseStandard.setPcnesContent(rs.getString("pcnes_content"));
				expenseStandard.setPcnesImgurl(rs.getString("pcnes_imgurl"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		
		return expenseStandard;
	}

}
