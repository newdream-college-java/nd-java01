package cn.song.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.song.dao.BaseDao;
import cn.song.dao.ProblemDao;
import cn.song.vo.ChepiaoProblem;

public class ProblemDaoImpl extends BaseDao implements ProblemDao {

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

	@Override
	public boolean deleteProblem(int pId, int status) {
		int result1 = 0;
		int result2 = 0;
		try {
			getConnection();
			conn.setAutoCommit(false);
			String sql1 = "delete from problem where p_id = ?;";
			pst = conn.prepareStatement(sql1);
			pst.setInt(1, pId);
			result1 = pst.executeUpdate();

			String sql2 = "delete from problem_reply where pr_pt_id = ?;";
			pst = conn.prepareStatement(sql2);
			pst.setInt(1, pId);
			result2 = pst.executeUpdate();
			if (status == 1) {
				if (result1 == result2 && result1 == 1 && result2 == 1) {
					conn.commit();
					return true;
				}
			} else if (status == 0) {
				if (result1 == 1 && result2 == 0) {
					conn.commit();
					return true;
				}
			} else {
				conn.rollback();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return false;
	}

	@Override
	public boolean addProblem(String pContent, String pSupply, int pTypeId, int uId) {
		int result;
		try {
			getConnection();
			String sql = "insert into problem values(null,?,?,?,now(),0,?);";
			pst = conn.prepareStatement(sql);
			pst.setString(1, pContent);
			pst.setString(2, pSupply);
			pst.setInt(3, pTypeId);
			pst.setInt(4, uId);
			result = pst.executeUpdate();
			if (result == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return false;
	}

	@Override
	public int modifyAsk(String question, String supply, int pid) {
		int result = -1;
		try {
			getConnection();
			String sql = "update problem set p_content = ?,p_supply = ? where p_id = ?;";
			pst = conn.prepareStatement(sql);
			pst.setString(1, question);
			pst.setString(2, supply);
			pst.setInt(3, pid);
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return result;
	}

}
