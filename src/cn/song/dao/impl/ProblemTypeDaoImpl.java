package cn.song.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.song.dao.BaseDao;
import cn.song.dao.ProblemTypeDao;
import cn.song.entity.ProblemType;

public class ProblemTypeDaoImpl extends BaseDao implements ProblemTypeDao {

	@Override
	public List<ProblemType> selectProblemType() {
		List<ProblemType> proTypeList = new ArrayList<ProblemType>();
		ProblemType proType = null;
		try {
			getConnection();
			String sql = "select * from problem_type;";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				proType = new ProblemType();
				proType.setPtId(rs.getInt("pt_id"));
				proType.setPtType(rs.getString("pt_type"));
				proTypeList.add(proType);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return proTypeList;
	}

}
