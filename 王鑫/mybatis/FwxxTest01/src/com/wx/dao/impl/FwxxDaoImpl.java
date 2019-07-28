package com.wx.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wx.dao.BaseDao;
import com.wx.dao.entity.Fwxx;
import com.yb.dao.FwxxDao;

public class FwxxDaoImpl extends BaseDao implements FwxxDao {
	@Override
	public List<Fwxx> listAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();		
		List<Fwxx> listAll = sqlSession.selectList("newdreawFwxx.listAll");
		sqlSession.close();
		return listAll;
	}
	@Override
	public int addFwxx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwxx fw=new Fwxx();
		fw.setFwid(7);
		fw.setFwxx("±ðÊû");
		int result = sqlSession.insert("newdreawFwxx.addFwxx",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int modifyFwxx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwxx fw=new Fwxx();
		fw.setFwid(7);
		fw.setFwxx("Ð¡±ðÊû");
		int result = sqlSession.update("newdreawFwxx.modifyFwxx",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int removeFwxx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int id=7;
		int result = sqlSession.delete("newdreawFwxx.removeFwxx",id);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	public static void main(String[] args) {
		FwxxDaoImpl fd=new FwxxDaoImpl();
		//fd.addFwxx();
		//fd.modifyFwxx();
		//fd.removeFwxx();
		System.out.println(fd.listAll());
	}
}
