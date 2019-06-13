package com.cc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.SpOrderDao;
import com.cc.entity.SpOrder;

public class SpOrderDaoImpl extends BaseDao implements SpOrderDao {

	public List<SpOrder> list() {
		List<SpOrder> list = new ArrayList<SpOrder>();
		try {
			getConn();
			StringBuffer sql = new StringBuffer(
					"select * from sp_order where spu_id in (select spu_id from sp_user)");
			pst = conn.prepareStatement(sql.toString());
			rs = pst.executeQuery();
			while (rs.next()) {
				SpOrder sp = new SpOrder();
				sp.setSpoNumber(rs.getInt("spo_number"));
				sp.setSpoAdress(rs.getString("spo_adress"));
				sp.setSpoPlaceTime(rs.getString("spo_place_time"));// 时间用date格式
				sp.setSpoTelephone(rs.getInt("spo_telephone"));
				sp.setSpoUser(rs.getString("spo_user"));
				sp.setSpoZip(rs.getInt("spo_zip"));
				sp.setSpoReceivingTime(rs.getString("spo_receiving_time"));
				sp.setSpuId(rs.getInt("spu_id"));
				list.add(sp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pst, conn);
		}
		return list;
	}

}
