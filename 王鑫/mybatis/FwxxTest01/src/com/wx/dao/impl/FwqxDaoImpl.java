package com.wx.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wx.dao.BaseDao;
import com.wx.dao.entity.Fwqx;
import com.yb.dao.FwqxDao;

public class FwqxDaoImpl extends BaseDao implements FwqxDao {
	@Override
	public List<Fwqx> listAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();		
		List<Fwqx> listAll = sqlSession.selectList("newdreawFwqx.listAll");
		sqlSession.close();
		return listAll;
	}
	@Override
	public int addFwqx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwqx fw=new Fwqx();
		fw.setQxid(7);
		fw.setQx("±ðÊû");
		int result = sqlSession.insert("newdreawFwqx.addFwqx",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int modifyFwqx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwqx fw=new Fwqx();
		fw.setQxid(1);
		fw.setQx("Ð¡±ðÊû");
		int result = sqlSession.update("newdreawFwqx.modifyFwqx",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int removeFwqx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int id=7;
		int result = sqlSession.delete("newdreawFwqx.removeFwqx",id);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	public static void main(String[] args) {
		FwqxDaoImpl fd=new FwqxDaoImpl();
		//fd.addFwqx();
		//fd.modifyFwqx();
		fd.removeFwqx();
		//System.out.println(fd.listAll());
	}
}
