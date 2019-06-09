package com.test;



import org.junit.Test;

import com.dao.BaseDao;
import com.dao.MembersinfoDao;
import com.dao.impl.MembersinfoDaoImpl;
import com.entity.Membersinfo;


public class TestDao {
	MembersinfoDao md=new MembersinfoDaoImpl();
	@Test
	public void testDao(){
		BaseDao bd=new BaseDao();
		bd.getConn();
		System.out.println(bd.conn);
	}
	@Test
	public void testMem(){
		//System.out.println(md.list(2));
		Membersinfo me=new Membersinfo();
		me.setMid(2);
		me.setMaddress("江苏省南京市河西区新北大街1号");
		me.setMage(22);
		me.setMemail("lockfeng@qq.com");
		me.setMgender("男");
		me.setMname("张宇");
		
		System.out.println(md.Update(me));
	}
}
