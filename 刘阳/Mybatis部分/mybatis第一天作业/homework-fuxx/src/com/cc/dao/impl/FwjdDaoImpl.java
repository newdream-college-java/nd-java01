package com.cc.dao.impl;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.cc.dao.BaseDao;
import com.cc.dao.FwjdDao;
import com.cc.entity.Fwjd;
public class FwjdDaoImpl extends BaseDao implements FwjdDao {
	@Override
	public List<Fwjd> listAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();		
		List<Fwjd> listAll = sqlSession.selectList("newdreaw.listAll");
		sqlSession.close();
		return listAll;
	}
	@Override
	public int addFwid() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwjd fw=new Fwjd();
		fw.setJd("4");
		fw.setJdid(6);
		int result = sqlSession.insert("newdreaw.addFwid",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int modifyFwjd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwjd fw=new Fwjd();
		fw.setJd("4");
		fw.setJdid(6);
		int result = sqlSession.update("newdreaw.modifyFwjd",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int removeFwjd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int id=2;
		int result = sqlSession.delete("newdreaw.removeFwjd",id);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	public static void main(String[] args) {
		FwjdDaoImpl fd=new FwjdDaoImpl();
		//List<Fwjd> listAll=fd.listAll();
		//fd.addFwid();
		//fd.modifyFwjd();
		fd.removeFwjd();
		//System.out.println(listAll);
	}
	
}
