package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.BaseDao;
import com.dao.TourDao;
import com.entity.Tour;

public class TourDaoImpl extends BaseDao implements TourDao {

	public int delete(int tourid) {
		int result=-1;
		try {
			getConn();
			String sql="delete from tour where tourid=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, tourid);
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return result;
	}

	public int insert(Tour tour) {
		int result=-1;
		try {
			getConn();
			String sql="insert into tour values(null,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, tour.getTourCity());
			pst.setString(2, tour.getTourPlace());
			pst.setString(3, tour.getTourTime());
			pst.setString(4, tour.getTourNote());
			result=pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return result;
	}

	public List<Tour> list() {
		List<Tour> list=new ArrayList<Tour>();
		try {
			getConn();
			String sql="select * from tour";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				Tour tu=new Tour();
				tu.setTourid(rs.getInt("Tourid"));
				tu.setTourCity(rs.getString("TourCity"));
				tu.setTourNote(rs.getString("TourNote"));
				tu.setTourPlace(rs.getString("TourPlace"));
				tu.setTourTime(rs.getString("TourTime"));
				list.add(tu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}

}
