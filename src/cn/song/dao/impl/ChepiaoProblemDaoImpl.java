package cn.song.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.song.dao.BaseDao;
import cn.song.dao.ChepiaoProblemDao;
import cn.song.vo.ChepiaoProblem;

public class ChepiaoProblemDaoImpl extends BaseDao implements ChepiaoProblemDao {

	@Override
	public List<ChepiaoProblem> getChepiaoProblem() {
		List<ChepiaoProblem> chepiaoProblemList = new ArrayList<ChepiaoProblem>();
		String sql = "select * from problem left join problem_reply on p_id = pr_pt_id ;";
		ChepiaoProblem chepiaoProblem = null;
		try {
			getConnection();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				chepiaoProblem = new ChepiaoProblem();
				chepiaoProblem.setpContent(rs.getString("p_content"));
				chepiaoProblem.setPrContent(rs.getString("pr_content"));
				chepiaoProblemList.add(chepiaoProblem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return chepiaoProblemList;
	}

}
