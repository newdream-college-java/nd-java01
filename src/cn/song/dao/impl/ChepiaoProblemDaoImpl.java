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
	public List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize, int uid) {
		List<ChepiaoProblem> chepiaoProblemList = new ArrayList<ChepiaoProblem>();
		ChepiaoProblem chepiaoProblem = null;
		try {
			getConnection();
			String sql = "select * from problem left join problem_reply on p_id = pr_pt_id where u_id = ? limit ?,?;";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, (page - 1) * pageSize);
			pst.setInt(3, pageSize);
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
	public int getAllCountByProblem(int uId) {
		int i = 0;
		try {
			getConnection();
			String sql = "select * from problem left join problem_reply on p_id = pr_pt_id where u_id=?;";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, uId);
			rs = pst.executeQuery();
			while (rs.next()) {
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return i;
	}

	@Override
	public int getCountByProblem(int pStatu, int uId) {
		int i = 0;
		try {
			getConnection();
			String sql = "select * from problem left join problem_reply on p_id = pr_pt_id where p_status=? and u_id = ?;";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, pStatu);
			pst.setInt(2, uId);
			rs = pst.executeQuery();
			while (rs.next()) {
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return i;
	}

	@Override
	public List<ChepiaoProblem> getChepiaoProblem(int page, int pageSize, int pStatu, int uid) {
		List<ChepiaoProblem> chepiaoProblemList = new ArrayList<ChepiaoProblem>();
		ChepiaoProblem chepiaoProblem = null;
		try {
			getConnection();
			String sql = "select * from problem left join problem_reply on p_id = pr_pt_id where u_id = ? and p_status=? limit ?,?;";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pStatu);
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

	@Override
	public ChepiaoProblem getChepiaoProblem(int pId) {
		ChepiaoProblem chepiaoProblem = null;
		try {
			getConnection();
			String sql = "select * from problem left join problem_reply on p_id = pr_pt_id where p_id = ?;";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, pId);
			rs = pst.executeQuery();
			if (rs.next()) {
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
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return chepiaoProblem;
	}

}
