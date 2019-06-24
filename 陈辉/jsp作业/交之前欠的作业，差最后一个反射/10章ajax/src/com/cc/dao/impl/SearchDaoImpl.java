package com.cc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.SearchDao;
import com.cc.entity.Search;

public class SearchDaoImpl extends BaseDao implements SearchDao {

	public List<Search> list(String user) {
		List<Search> list = new ArrayList<Search>();

		try {
			getConn();
			// and user like '%บร%'
			StringBuffer sql = new StringBuffer("select * from ajax where 1=1");
			if (user != null) {
				sql.append(" and user like ?");
				pst = conn.prepareStatement(sql.toString());
				pst.setString(1, user + "%");
			} else {
				pst = conn.prepareStatement(sql.toString());
			}
			rs = pst.executeQuery();
			while (rs.next()) {
				Search sh = new Search();
				sh.setUser(rs.getString("user"));
				sh.setPwd(rs.getInt("pwd"));
				sh.setId(rs.getInt("id"));
				list.add(sh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(rs, pst, conn);
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(new SearchDaoImpl().searchByKeyWord("A"));
	}

	public String searchByKeyWord(String keyWord) {
		StringBuffer sBuffer = new StringBuffer();
		try {
			getConn();

			String sql = "select * from ajax where user like ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, keyWord + "%");
			rs = pst.executeQuery();
			while (rs.next()) {
				sBuffer.append(rs.getString("user") + "-");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(rs, pst, conn);
		}

		return sBuffer.toString();
	}
}
