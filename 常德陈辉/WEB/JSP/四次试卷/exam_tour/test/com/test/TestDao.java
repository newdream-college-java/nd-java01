package com.test;

import org.junit.Test;

import com.dao.BaseDao;
import com.dao.TourDao;
import com.dao.impl.TourDaoImpl;
import com.entity.Tour;

public class TestDao {
	TourDao td=new TourDaoImpl();
	@Test
	public void testDao(){
		BaseDao bd=new BaseDao();
		bd.getConn();
		System.out.println(bd.conn);
	}
	@Test
	public void testTour(){
		//System.out.println(td.list());
		Tour tu=new Tour("1","2","1996-9-21","4");
		System.out.println(td.insert(tu));
		//System.out.println(td.delete(4));
	}
}
