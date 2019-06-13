package cn.song.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.song.dao.BaseDao;
import cn.song.dao.StationDao;
import cn.song.entity.Station;

public class StationDaoImpl extends BaseDao implements StationDao {

	@Override
	public List<Station> getStation() {
		List<Station> list = new ArrayList<Station>();
		String sql = "select * from station where s_open_time<=now() order by s_open_time desc;";
		// 根据时间排序 小于等于时间才可以取出，只要四条
		Station sta = null;
		try {
			getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			// for循环四条数据
			while (rs.next()) {
				sta = new Station();
				sta.setsId(rs.getInt("s_id"));
				sta.setsName(rs.getString("s_name"));
				sta.setsIntroduction(rs.getString("s_introduction"));
				sta.setsAddress(rs.getString("s_address"));
				sta.setsPhone(rs.getString("s_phone"));
				sta.setsBus(rs.getString("s_bus"));
				sta.setsOpenTime(rs.getString("s_open_time"));
				sta.setsImg(rs.getString("s_img"));
				list.add(sta);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}

		return list;
	}

	public Station station(int id) {
		Station sta = null;
		try {
			getConnection();
			String sql = "select * from station where s_id=?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				sta = new Station();
				sta.setsId(rs.getInt("s_id"));
				sta.setsName(rs.getString("s_name"));
				sta.setsIntroduction(rs.getString("s_introduction"));
				sta.setsAddress(rs.getString("s_address"));
				sta.setsPhone(rs.getString("s_phone"));
				sta.setsBus(rs.getString("s_bus"));
				sta.setsOpenTime(rs.getString("s_open_time"));
				sta.setsImg(rs.getString("s_img"));
				sta.setCity(rs.getString("city"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return sta;
	}
}
