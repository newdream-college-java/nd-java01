package com.wx.dao.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.wx.dao.BaseDao;
import com.wx.dao.entity.Fwlx;
import com.yb.dao.FwlxDao;

public class FwlxDaoImpl extends BaseDao implements FwlxDao {
	@Override
	public List<Fwlx> listAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();		
		List<Fwlx> listAll = sqlSession.selectList("newdreawFwlx.listAll");
		sqlSession.close();
		return listAll;
	}
	@Override
	public int addFwlx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwlx fw=new Fwlx();
		fw.setLxid(7);
		fw.setFwlx("±ðÊû");
		int result = sqlSession.insert("newdreawFwlx.addFwlx",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int modifyFwlx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwlx fw=new Fwlx();
		fw.setLxid(1);
		fw.setFwlx("Ð¡±ðÊû");
		int result = sqlSession.update("newdreawFwlx.modifyFwlx",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int removeFwlx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int id=2;
		int result = sqlSession.delete("newdreawFwlx.removeFwlx",id);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	public static void main(String[] args) {
		FwlxDaoImpl fd=new FwlxDaoImpl();
		//fd.addFwlx();
		//fd.modifyFwlx();
		fd.removeFwlx();
		//System.out.println(fd.listAll());
	}
}
