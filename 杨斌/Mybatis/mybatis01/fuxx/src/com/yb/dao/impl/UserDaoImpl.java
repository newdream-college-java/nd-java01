package com.yb.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.yb.dao.BaseDao;
import com.yb.dao.UserDao;
import com.yb.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {
	@Override
	public List<User> listAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();		
		List<User> listAll = sqlSession.selectList("newdreawUser.listAll");
		sqlSession.close();
		return listAll;
	}
	@Override
	public int addUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User fw=new User();
		fw.setUid(7);
		fw.setUname("Ç¿¸ç");
		int result = sqlSession.insert("newdreawUser.addUser",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int modifyUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User fw=new User();
		fw.setUid(7);
		fw.setUname("»Ô¸ç");
		int result = sqlSession.update("newdreawUser.modifyUser",fw);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	@Override
	public int removeUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int id=7;
		int result = sqlSession.delete("newdreawUser.removeUser",id);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	public static void main(String[] args) {
		UserDaoImpl fd=new UserDaoImpl();
		//fd.addUser();
		//fd.modifyUser();
		//fd.removeUser();
		System.out.println(fd.listAll());
	}
}
