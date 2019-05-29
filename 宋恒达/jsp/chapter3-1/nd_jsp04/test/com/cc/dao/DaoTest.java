package com.cc.dao;

import org.junit.Test;

import com.cc.dao.impl.PersonDaoImpl;
import com.cc.entity.Person;
/**
 * dao层的单元类
 * @author mr.chan
 *
 */
public class DaoTest {
	PersonDaoImpl pd = new PersonDaoImpl();
	@Test
	public void testBaseDao(){
		BaseDao bd =new BaseDao();
		bd.getConn();
		System.out.println(bd.conn);
	}
	@Test
	public void testPersonDaoSave(){
		
		System.out.println(pd.save(new Person("王二狗",1,44)));
	}
	@Test
	public void testPersonList(){
		System.out.println(pd.selectByIdOrAll(1));
	}
	
	@Test
	public void testPersonDelete(){
		System.out.println(pd.deleteByName("狗"));
	}
}
