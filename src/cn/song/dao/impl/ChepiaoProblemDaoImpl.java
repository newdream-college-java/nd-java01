package cn.song.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.song.dao.BaseDao;
import cn.song.dao.ChepiaoProblemDao;
import cn.song.vo.ChepiaoProblem;

public class ChepiaoProblemDaoImpl extends BaseDao implements ChepiaoProblemDao {

	@Override
	public List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize) {
		List<ChepiaoProblem> chepiaoProblemList = new ArrayList<ChepiaoProblem>();
		String sql = "select * from problem left join problem_reply on p_id = pr_pt_id limit ?,?;";
		ChepiaoProblem chepiaoProblem = null;
		try {
			getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, (page - 1) * pageSize);
			pst.setInt(2, pageSize);
			rs = pst.executeQuery();
			while (rs.next()) {
				chepiaoProblem = new ChepiaoProblem();
				chepiaoProblem.setpId(rs.getInt("p_id"));
				chepiaoProblem.setpContent(rs.getString("p_content"));
				chepiaoProblem.setpSupply(rs.getString("p_supply"));
				chepiaoProblem.setpTypeId(rs.getInt("p_type_id"));
				chepiaoProblem.setpTime(rs.getString("p_time"));
				chepiaoProblem.setpStatus(rs.getInt("p_status"));
				chepiaoProblem.setuId(rs.getInt("u_id"));
				chepiaoProblem.setPrId(rs.getInt("pr_id"));
				chepiaoProblem.setPrContent(rs.getString("pr_content"));
				chepiaoProblem.setPrTime(rs.getString("pr_time"));
				chepiaoProblemList.add(chepiaoProblem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return chepiaoProblemList;
	}

	@Override
	public List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize, int uid, int pStatus) {
		List<ChepiaoProblem> chepiaoProblemList = new ArrayList<ChepiaoProblem>();
		String sql = "select * from problem left join problem_reply on p_id = pr_pt_id where p_status = ? and u_id = ? limit ?,?;";
		ChepiaoProblem chepiaoProblem = null;
		try {
			getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, pStatus);
			pst.setInt(2, uid);
			pst.setInt(3, (page - 1) * pageSize);
			pst.setInt(4, pageSize);
			rs = pst.executeQuery();
			while (rs.next()) {
				chepiaoProblem = new ChepiaoProblem();
				chepiaoProblem.setpId(rs.getInt("p_id"));
				chepiaoProblem.setpContent(rs.getString("p_content"));
				chepiaoProblem.setpSupply(rs.getString("p_supply"));
				chepiaoProblem.setpTypeId(rs.getInt("p_type_id"));
				chepiaoProblem.setpTime(rs.getString("p_time"));
				chepiaoProblem.setpStatus(rs.getInt("p_status"));
				chepiaoProblem.setuId(rs.getInt("u_id"));
				chepiaoProblem.setPrId(rs.getInt("pr_id"));
				chepiaoProblem.setPrContent(rs.getString("pr_content"));
				chepiaoProblem.setPrTime(rs.getString("pr_time"));
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
