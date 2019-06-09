package com.test;

import java.util.List;

import org.junit.Test;

import com.dao.BaseDao;
import com.dao.HandsetDao;
import com.dao.impl.HandsetDaoImpl;
import com.entity.Handset;

public class TestDao {
	HandsetDao hd=new HandsetDaoImpl();
	@Test
	public void testDao(){
		BaseDao bd=new BaseDao();
		bd.getConn();
		System.out.println(bd.conn);
	}
	@Test
	public void testHand(){
		//System.out.println(hd.list(1));
		System.out.println(hd.delete(2));
	}
}
