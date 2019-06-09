package com.test;

import org.junit.Test;

import com.dao.BaseDao;
import com.dao.QuestionDao;
import com.dao.impl.QuestionDaoIImpl;
import com.entity.Question;

public class TestDao {
	QuestionDao qd=new QuestionDaoIImpl();
	@Test
	public void testBD(){
		BaseDao bd=new BaseDao();
		bd.getConn();
		System.out.println(bd.conn);
	}
	@Test
	public void testSelect(){
		//System.out.println(qd.list(3));
		Question qt=new Question();
		qt.setQuestion("Ã‚4");
		qt.setQuestionA("A");
		qt.setQuestionB("B");
		qt.setQuestionC("C");
		qt.setQuestionD("D");
		qt.setSubject(2);
		qt.setAnswer("c");
		System.out.println(qd.result(qt));
	}
	
}
